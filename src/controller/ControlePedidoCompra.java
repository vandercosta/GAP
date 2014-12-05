///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//
//package controller;
//
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.ArrayList;
//import javax.swing.JOptionPane;
//import model.PedidoCompra;
//
///**
// *
// * @author 0186147
// */
//public class ControlePedidoCompra {
//    
//    ConectorBanco conector = new ConectorBanco();
//
//    public ArrayList<PedidoCompra> listarPedidoCompra(String consulta) {
//
//        Connection conexao = conector.getConnection();
//        ArrayList<PedidoCompra> listaPedidosCompra = new ArrayList<>();
//
//        try {
//            PreparedStatement ps = conexao.prepareStatement(consulta);
//            ResultSet rs = ps.executeQuery();
//
//            while (rs.next()) {
//
//                int idProduto = rs.getInt("ID_PRODUTO");
//                int idCompra = rs.getInt("ID_COMPRA");
//
//                PedidoCompra pedidocompra = new PedidoCompra(idProduto, idCompra);
//
//                listaPedidoCompra.add(pedidocompra);
//            }
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "Erro na listagem dos pedidos de compra" + " detalhes: " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
//        }
//
//        return listaPedidosCompra;
//    }
//    
//    public void adicionaPedidoCompra(String consulta, PedidoCompra pedidocompra) {
//
//        Connection conexao = conector.getConnection();
//
//        try {
//            PreparedStatement ps = conexao.prepareStatement(consulta);
//            ps.setInt(1, pedidocompra.getProduto());
//            ps.setInt(2, pedidocompra.getCompra());
//            ps.execute();
//
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "Erro ao inserir pedido de compra" + " detalhes: " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
//        }
//
//    }
//    
//    public void editarPedidoCompra(String consulta, PedidoCompra pedidocompra) {
//
//        
//        Connection conexao = conector.getConnection();
//
//        try {
//            PreparedStatement ps = conexao.prepareStatement(consulta);
//
//            ps.setInt(1, pedidocompra.getProduto());
//            ps.setInt(2, pedidocompra.getCompra());
//            ps.executeUpdate();
//
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "Erro ao editar pedido de compra" + " detalhes: " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
//        }
//    }
//    public void excluirPedidoCompra(String consulta, PedidoCompra pedidocompra) {
//
//        //efetua conexão, nunca muda
//        Connection conexao = conector.getConnection();
//        try {
//            PreparedStatement ps = conexao.prepareStatement(consulta);
//            ps.setInt(1, pedidocompra.getCompra());
//            ps.execute();
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "Erro na exclusão do pedido de compra" + " detalhes: " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
//        }
//    }
//    
//}
