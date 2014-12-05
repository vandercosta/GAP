package controller;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.JOptionPane;
import model.Compra;
import model.Fornecedor;
import model.Funcionario;

public class ControleCompra {

    ConectorBanco conector = new ConectorBanco();
    SimpleDateFormat formatoData = new SimpleDateFormat("dd-MMM-yy");

    public ArrayList<Compra> listarCompra(String consulta) {

        Connection conexao = conector.getConnection();
        
        ArrayList<Compra> listaCompras = new ArrayList<>();

        try {
            PreparedStatement ps = conexao.prepareStatement(consulta);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                int idCompra = rs.getInt("ID_COMPRA");

                Date dCompra = rs.getDate("DATA_COMPRA");
                Calendar dataCompra = Calendar.getInstance();
                dataCompra.setTime(dCompra);

                double valorTotal = rs.getDouble("VALOR_TOTALCOMPRA");

                //FUNCIONARIO
                int idFuncionario = rs.getInt("ID_FUNCIONARIO");
                Date dEntrada = rs.getDate("DATA_ENTRADA");
                Calendar dataEntrada = Calendar.getInstance();
                dataEntrada.setTime(dEntrada);
                Date dDemissao = rs.getDate("DATA_DEMISSAO");
                Calendar dataDemissao = Calendar.getInstance();
                if(dDemissao != null){
                    dataDemissao.setTime(dDemissao);
                }else{
                    dataDemissao = null;
                }
                int perfil = rs.getInt("PERFIL");
                long cpf = rs.getLong("CPF_FUNCIONARIO");
                Date dNascimento = rs.getDate("DATA_NASCIMENTO");
                Calendar dataNascimento = Calendar.getInstance();
                dataNascimento.setTime(dNascimento);
                String telefoneFuncionario = rs.getString("TELEFONE_FUNCIONARIO");
                String nomeFuncionario = rs.getString("NOME_USUARIO");
                Funcionario funcionario = new Funcionario(idFuncionario, nomeFuncionario, cpf, telefoneFuncionario, dataNascimento, dataEntrada, dataDemissao, perfil);

                //FORNECEDOR        
                int idFornecedor = rs.getInt("ID_FORNECEDOR");
                String nomeFornecedor = rs.getString("NOME_FORNECEDOR");
                String telefoneFornecedor = rs.getString("TELEFONE_FORNECEDOR");
                long cnpj = rs.getLong("CNPJ_FORNECEDOR");

                Fornecedor fornecedor = new Fornecedor(idFornecedor, nomeFornecedor, telefoneFornecedor, cnpj);

                Compra compra = new Compra(idCompra, dataCompra, fornecedor, valorTotal, funcionario);

                listaCompras.add(compra);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro na listagem das compras" + " detalhes: " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }

        return listaCompras;
    }

    public void adicionaCompra(String consulta, Compra compra) {

        Connection conexao = conector.getConnection();

        try {
            PreparedStatement ps = conexao.prepareStatement(consulta);

            ps.setString(1, this.formatoData.format(compra.getDataCompra().getTime()));

            ps.setDouble(2, compra.getValorTotal());
            ps.setInt(3, compra.getFornecedor().getIdFornecedor());
            ps.setInt(4, compra.getUsuario().getIdFuncionario());
            ps.execute();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir compra" + " detalhes: " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }

    }

    public void editarCompra(String consulta, Compra compra) {

        Connection conexao = conector.getConnection();

        try {
            PreparedStatement ps = conexao.prepareStatement(consulta);

            ps.setString(1, this.formatoData.format(compra.getDataCompra().getTime()));
            ps.setDouble(2, compra.getValorTotal());
            ps.setInt(3, compra.getFornecedor().getIdFornecedor());
            ps.setInt(3, compra.getUsuario().getIdFuncionario());
            ps.setInt(4, compra.getIdCompra());
            ps.executeUpdate();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao editar compra" + " detalhes: " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void excluirCompra(String consulta, Compra compra) {

        //efetua conexão, nunca muda
        Connection conexao = conector.getConnection();
        try {
            PreparedStatement ps = conexao.prepareStatement(consulta);
            ps.setInt(1, compra.getIdCompra());
            ps.execute();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro na exclusão da compra" + " detalhes: " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
}
