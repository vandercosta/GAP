package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Fornecedor;

public class ControleFornecedor {

    ConectorBanco conector = new ConectorBanco();

    public ArrayList<Fornecedor> listarFornecedor(String consulta) {

        Connection conexao = conector.getConnection();
        ArrayList<Fornecedor> listaFornecedor = new ArrayList<>();

        try {
            PreparedStatement ps = conexao.prepareStatement(consulta);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                int idFornecedor = rs.getInt("ID_FORNECEDOR");
                String nomeFornecedor = rs.getString("NOME_FORNECEDOR");
                long cnpj = rs.getLong("CNPJ_FORNECEDOR");
                String telefone = rs.getString("TELEFONE_FORNECEDOR");

                Fornecedor fornecedor = new Fornecedor(idFornecedor, nomeFornecedor, telefone, cnpj);
                listaFornecedor.add(fornecedor);

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro na listagem dos fornecedores" + " detalhes: " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }

        return listaFornecedor;
    }

    public void adicionaFornecedor(String consulta, Fornecedor fornecedor) {

        Connection conexao = conector.getConnection();

        try {
            PreparedStatement ps = conexao.prepareStatement(consulta);
            
            ps.setLong(1, fornecedor.getCnpj());
            ps.setString(2, fornecedor.getTelefone());
            ps.setString(3, fornecedor.getNome());
            
            ps.execute();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir fornecedor" + " detalhes: " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }

    }

    public void editarFornecedor(String consulta, Fornecedor fornecedor) {

        Connection conexao = conector.getConnection();

        try {
            PreparedStatement ps = conexao.prepareStatement(consulta);

            ps.setLong(1, fornecedor.getCnpj());
            ps.setString(2, fornecedor.getTelefone());
            ps.setString(3, fornecedor.getNome());
            ps.setInt(4, fornecedor.getIdFornecedor());
            ps.executeUpdate();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao editar fornecedor" + " detalhes: " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void excluirFornecedor(String consulta, Fornecedor fornecedor) {

        //efetua conexão, nunca muda
        Connection conexao = conector.getConnection();
        try {
            PreparedStatement ps = conexao.prepareStatement(consulta);
            ps.setInt(1, fornecedor.getIdFornecedor());
            ps.execute();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro na exclusão do fornecedor" + " detalhes: " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

}
