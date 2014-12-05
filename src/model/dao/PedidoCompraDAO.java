///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//
//package model.dao;
//
//import controller.ControlePedidoCompra;
//import java.util.ArrayList;
//import model.PedidoCompra;
//
///**
// *
// * @author 0186147
// */
//public class PedidoCompraDAO implements OperacoesDAO{
//
//   private ArrayList<PedidoCompra> pedidoscompra = new ArrayList();
//
//    @Override
//    public void inserir(Object obj) {
//        if (obj instanceof PedidoCompra) {
//            PedidoCompra pedidocompra = (PedidoCompra) obj;
//            String sql = "insert into lista_compra("
//                    + "id_produto, id_compra)"                 
//                    + " values (?,?)";
//
//            ControlePedidoCompra cont = new ControlePedidoCompra();
//            cont.adicionaPedidoCompra(sql, pedidocompra);
//        }
//    }
//     @Override
//    public void excluir(Object obj) {
//        
//        if (obj instanceof PedidoCompra) {
//            PedidoCompra pedidocompra = (PedidoCompra) obj;
//            String sql = "DELETE FROM LISTA_COMPRA WHERE id_compra = ?";
//            ControlePedidoCompra cont = new ControlePedidoCompra();
//            cont.excluirPedidoCompra(sql,pedidocompra);
//        }
//    } 
//    @Override
//    public void editar(Object obj) {
//        if (obj instanceof PedidoCompra) {
//            PedidoCompra pedidocompra = (PedidoCompra) obj;
//            String sql = "UPDATE lista_compra set "
//                    + "id_produto =?, id_compra =?"
//                    + "where id_compra = ? ";
//            
//            ControlePedidoCompra cont = new ControlePedidoCompra();
//            cont.editarPedidoCompra(sql,pedidocompra);
//        }
//    }
//    
//    @Override
//    public ArrayList pequisarTodos() {
//        String sql = "SELECT * FROM LISTA_COMPRA";
//        ControlePedidoCompra cont = new ControlePedidoCompra();
//        return pedidoscompra = cont.listarPedidoCompra(sql);
//    }
//    
//        public ArrayList pesquisar(String busca) {
//        String sql = "SELECT * FROM LISTA_COMPRA WHERE ID_COMPRA LIKE '%" + busca + "%' ";
//        ControlePedidoCompra cont = new ControlePedidoCompra();
//        return pedidoscompra = cont.listarPedidoCompra(sql);
//    }
//}