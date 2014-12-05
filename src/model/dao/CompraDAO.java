//
//package model.dao;
//
//import controller.ControleCompra;
//import java.util.ArrayList;
//import model.Compra;
//
//
//public class CompraDAO implements OperacoesDAO{
//
//   private ArrayList<Compra> compras = new ArrayList();
//
//    @Override
//    public void inserir(Object obj) {
//        if (obj instanceof Compra) {
//            Compra compra = (Compra) obj;
//            String sql = "insert into compra("
//                    + "id_compra, data_compra, valor_totalCompra, id_funcionario)"                 
//                    + " values (s_cliente.nextval,?,?,?)";
//
//            ControleCompra cont = new ControleCompra();
//            cont.adicionaCompra(sql, compra);
//        }
//    }
//   @Override
//    public void excluir(Object obj) {
//        
//        if (obj instanceof Compra) {
//            Compra compra = (Compra) obj;
//            String sql = "DELETE FROM COMPRA WHERE id_compra = ?";
//            ControleCompra cont = new ControleCompra();
//            cont.excluirCompra(sql,compra);
//        }
//    }
//     @Override
//    public void editar(Object obj) {
//        if (obj instanceof Compra) {
//            Compra compra = (Compra) obj;
//            String sql = "UPDATE compra set "
//                    + "data_compra =?, valor_totalCompra =?,id_funcionario =?"
//                    + "where id_compra = ? ";
//            
//            ControleCompra cont = new ControleCompra();
//            cont.editarCompra(sql,compra);
//        }
//    }
//    
//        @Override
//    public ArrayList pequisarTodos() {
//        String sql = "SELECT * FROM COMPRA";
//        ControleCompra cont = new ControleCompra();
//        return compras = cont.listarCompra(sql);
//    }
//    
//    public ArrayList pesquisar(String busca) {
//        String sql = "SELECT * FROM COMPRA WHERE DATA_COMPRA LIKE '%" + busca + "%' ";
//        ControleCompra cont = new ControleCompra();
//        return compras = cont.listarCompra(sql);
//    }
//}