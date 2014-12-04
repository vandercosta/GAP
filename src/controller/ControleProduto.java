
package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Produto;


public class ControleProduto {
    
    ConectorBanco conector = new ConectorBanco();
    
    public ArrayList<Produto> listarProduto(String consulta) {

        Connection conexao = conector.getConnection();
        ArrayList<Produto> listaProdutos = new ArrayList<>();

        try {
            PreparedStatement ps = conexao.prepareStatement(consulta);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                int idProduto = rs.getInt("ID_PRODUTO");
                String nomeProduto = rs.getString("NOME_PRODUTO");
                int valor = rs.getInt("VALOR_PRODUTO");
                int qtd = rs.getInt("QUANTIDADE");
                String modelo = rs.getString("MODELO");
                int fornecedor = rs.getInt("ID_FORNECEDOR");
                int compra = rs.getInt("ID_COMPRA");
                int categoria = rs.getInt("ID_CATEGORIA");

                Produto produto = new Produto(idProduto,nomeProduto,valor,qtd,modelo,fornecedor,compra,categoria);

                listaProdutos.add(produto);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro na listagem dos produtos" + " detalhes: " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }

        return listaProdutos;
    }
    
    public void adicionaProduto(String consulta, Produto produto) {

        Connection conexao = conector.getConnection();

        try {
            PreparedStatement ps = conexao.prepareStatement(consulta);
            ps.setString(1, produto.getNome());
            ps.setDouble(2, produto.getValor());
            ps.setInt(3, produto.getQtd());
            ps.setString(4, produto.getModelo());
            ps.setInt(5, produto.getFornecedor());
            ps.setInt(6, produto.getCompra());
            ps.setInt(7, produto.getCategoria());            
            
            ps.execute();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir produto" + " detalhes: " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }

    }
    
     public void editarProduto(String consulta, Produto produto) {

        
        Connection conexao = conector.getConnection();

        try {
            PreparedStatement ps = conexao.prepareStatement(consulta);

            ps.setString(1, produto.getNome());
            ps.setInt(2, produto.getValor());
            ps.setInt(3, produto.getQtd());
            ps.setString(4, produto.getModelo());
            ps.setInt(5, produto.getFornecedor());
            ps.setInt(6, produto.getCompra());
            ps.setInt(7, produto.getCategoria());
            ps.setInt(8, produto.getIdProduto());
            ps.executeUpdate();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao editar produto" + " detalhes: " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
     
         public void excluirProduto(String consulta, Produto produto) {

        //efetua conexão, nunca muda
        Connection conexao = conector.getConnection();
        try {
            PreparedStatement ps = conexao.prepareStatement(consulta);
            ps.setInt(1, produto.getIdProduto());
            ps.execute();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro na exclusão do produto" + " detalhes: " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
}
