//
//package model.dao;
//
//import controller.ControleVenda;
//import java.util.ArrayList;
//import model.Venda;
//
//public class VendaDAO implements OperacoesDAO{
//
//   private ArrayList<Venda> vendas = new ArrayList();
//
//    @Override
//    public void inserir(Object obj) {
//        if (obj instanceof Venda) {
//            Venda venda = (Venda) obj;
//            String sql = "insert into venda("
//                    + "id_venda, data_venda, valor_totalVenda, id_cliente,id_funcionario)"                 
//                    + " values (s_cliente.nextval,?,?,?,?)";
//
//            ControleVenda cont = new ControleVenda();
//            cont.adicionaVenda(sql, venda);
//        }
//    }
//    
//    @Override
//    public void excluir(Object obj) {
//        
//        if (obj instanceof Venda) {
//            Venda venda = (Venda) obj;
//            String sql = "DELETE FROM VENDA WHERE id_venda = ?";
//            ControleVenda cont = new ControleVenda();
//            cont.excluirVenda(sql,venda);
//        }
//    }
//    
//     @Override
//    public void editar(Object obj) {
//        if (obj instanceof Venda) {
//            Venda venda = (Venda) obj;
//            String sql = "UPDATE venda set "
//                    + "data_venda =?, valor_totalVenda =?, id_cliente =?,id_funcionario =?"
//                    + "where id_venda = ? ";
//            
//            ControleVenda cont = new ControleVenda();
//            cont.editarVenda(sql,venda);
//        }
//    }
//    @Override
//    public ArrayList pequisarTodos() {
//        String sql = "SELECT * FROM VENDA";
//        ControleVenda cont = new ControleVenda();
//        return vendas = cont.listarVenda(sql);
//    }
//    
//        public ArrayList pesquisar(String busca) {
//        String sql = "SELECT * FROM VENDA WHERE DATA_VENDA LIKE '%" + busca + "%' ";
//        ControleVenda cont = new ControleVenda();
//        return vendas = cont.listarVenda(sql);
//    }
//    
//}
//
