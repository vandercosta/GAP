//
//package controller;
//
//import java.sql.Connection;
//import java.sql.Date;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.ArrayList;
//import java.util.Calendar;
//import javax.swing.JOptionPane;
//import model.Compra;
//
//
//public class ControleCompra {
//    
//        ConectorBanco conector = new ConectorBanco();
//        
//        public ArrayList<Compra> listarCompra(String consulta) {
//
//        Connection conexao = conector.getConnection();
//        ArrayList<Compra> listaCompras = new ArrayList<>();
//
//        try {
//            PreparedStatement ps = conexao.prepareStatement(consulta);
//            ResultSet rs = ps.executeQuery();
//
//            while (rs.next()) {
//
//                int idCompra = rs.getInt("ID_COMPRA");
//                //DATA VENDA
//                Date DataCompra = rs.getDate("DATA_COMPRA");  
//                Calendar dataCompra = Calendar.getInstance();
//                dataCompra.setTime(DataCompra);
//                double valorTotal = rs.getDouble("VALOR_TOTALCOMPRA");
//                int usuario = rs.getInt("ID_FUNCIONARIO");
//                
//
//                Compra compra = new Compra(idCompra, DataCompra, valorTotal, usuario);
//
//                listaCompras.add(compra);
//            }
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "Erro na listagem das compras" + " detalhes: " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
//        }
//
//        return listaCompras;
//    }
//    
//    public void adicionaCompra(String consulta, Compra compra) {
//
//        Connection conexao = conector.getConnection();
//
//        try {
//            PreparedStatement ps = conexao.prepareStatement(consulta);
//            ps.setDate(1, compra.getDataCompra());
//            ps.setDouble(2, compra.getValorTotal());
//            ps.setInt(3, compra.getUsuario());
//            ps.execute();
//
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "Erro ao inserir compra" + " detalhes: " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
//        }
//
//    }
//     public void editarCompra(String consulta, Compra compra) {
//
//        
//        Connection conexao = conector.getConnection();
//
//        try {
//            PreparedStatement ps = conexao.prepareStatement(consulta);
//
//            ps.setDate(1, compra.getDataVenda());
//            ps.setDouble(2, compra.getValorTotal());
//            ps.setInt(3, compra.getUsuario());
//            ps.setInt(4, compra.getIdCompra());
//            ps.executeUpdate();
//
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "Erro ao editar compra" + " detalhes: " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
//        }
//    }
//     
//     public void excluirCompra(String consulta, Compra compra) {
//
//        //efetua conexão, nunca muda
//        Connection conexao = conector.getConnection();
//        try {
//            PreparedStatement ps = conexao.prepareStatement(consulta);
//            ps.setInt(1, compra.getIdCompra());
//            ps.execute();
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "Erro na exclusão da compra" + " detalhes: " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
//        }
//    }
//}
