
package controller;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.JOptionPane;
import model.Venda;


public class ControleVenda {
   
    ConectorBanco conector = new ConectorBanco();
    
    public ArrayList<Venda> listarVenda(String consulta) {

        Connection conexao = conector.getConnection();
        ArrayList<Venda> listaVendas = new ArrayList<>();

        try {
            PreparedStatement ps = conexao.prepareStatement(consulta);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                int idVenda = rs.getInt("ID_VENDA");
                //DATA VENDA
                Date DataVenda = rs.getDate("DATA_VENDA");  
                Calendar dataVenda = Calendar.getInstance();
                dataVenda.setTime(DataVenda);
                double valorTotal = rs.getDouble("VALOR_TOTALVENDA");
                int Cliente = rs.getInt("ID_CLIENTE");
                int Usuario = rs.getInt("ID_FUNCIONARIO");
                

                Venda venda = new Venda(idVenda, DataVenda, ValorTotal, Cliente, Usuario);

                listaVendas.add(venda);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro na listagem das vendas" + " detalhes: " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }

        return listaVendas;
    }
    
    public void adicionaVenda(String consulta, Venda venda) {

        Connection conexao = conector.getConnection();

        try {
            PreparedStatement ps = conexao.prepareStatement(consulta);
            ps.setDate(1, venda.getDataVenda());
            ps.setDouble(2, venda.getValorTotal());
            ps.setInt(3, venda.getCliente());
            ps.setInt(4, venda.getUsuario());
            ps.execute();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir cliente" + " detalhes: " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }

    }
    
    public void editarVenda(String consulta, Venda venda) {

        
        Connection conexao = conector.getConnection();

        try {
            PreparedStatement ps = conexao.prepareStatement(consulta);

            ps.setDate(1, venda.getDataVenda());
            ps.setDouble(2, venda.getValorTotal());
            ps.setInt(3, venda.getCliente());
            ps.setInt(4, venda.getUsuario());
            ps.setInt(5, venda.getIdVenda());
            ps.executeUpdate();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao editar venda" + " detalhes: " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void excluirVenda(String consulta, Venda venda) {

        //efetua conexão, nunca muda
        Connection conexao = conector.getConnection();
        try {
            PreparedStatement ps = conexao.prepareStatement(consulta);
            ps.setInt(1, venda.getIdVenda());
            ps.execute();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro na exclusão da venda" + " detalhes: " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
}
