
package model.dao;

import java.util.ArrayList;
import model.Produto;
import controller.ControleProduto;

public class ProdutoDAO implements OperacoesDAO{
    
       private ArrayList<Produto> produtos = new ArrayList();
       
    @Override
    public void inserir(Object obj) {
        if (obj instanceof Produto) {
            Produto produto = (Produto) obj;
            String sql = "insert into produto("
                    + "id_produto, nome_produto, valor_produto, quantidade, modelo, id_categoria)"                 
                    + " values (s_cliente.nextval,?,?,?,?,?)";

            ControleProduto cont = new ControleProduto();
            cont.adicionaProduto(sql, produto);
        }
    }
    @Override
    public void excluir(Object obj) {
        
        if (obj instanceof Produto) {
            Produto produto = (Produto) obj;
            String sql = "DELETE FROM PRODUTO WHERE id_produto = ?";
            ControleProduto cont = new ControleProduto();
            cont.excluirProduto(sql,produto);
        }
    } 
    
    @Override
    public void editar(Object obj) {
        if (obj instanceof Produto) {
            Produto produto = (Produto) obj;
            String sql = "UPDATE produto set "
                    + "nome_produto =?, valor_produto=?, quantidade =?, modelo =?, id_categoria =?" 
                    + "where id_produto = ? ";
            
            ControleProduto cont = new ControleProduto();
            cont.editarProduto(sql,produto);
        }
    }    
       
    //verificar essas listagem pq tem que pegar as categorias
    @Override
    public ArrayList pequisarTodos() {
        String sql = "SELECT * FROM PRODUTO";
        ControleProduto cont = new ControleProduto();
        return produtos = cont.listarProduto(sql);
    }

    public ArrayList pesquisar(String busca) {
        String sql = "SELECT * FROM PRODUTO WHERE NOME_PRODUTO LIKE '%" + busca + "%' ";
        ControleProduto cont = new ControleProduto();
        return produtos = cont.listarProduto(sql);
    }
    
    
}
