
package model.dao;

import controller.ControleCategoria;
import java.util.ArrayList;
import model.Categoria;

public class CategoriaDAO implements OperacoesDAO{

   private ArrayList<Categoria> lista = new ArrayList();

    @Override
    public void inserir(Object obj) {
        if (obj instanceof Categoria) {
            Categoria categoria = (Categoria) obj;
            String sql = "insert into categoria("
                    + "id_categoria, nome_categoria)"                 
                    + " values (s_categoria.nextval,?)";

            ControleCategoria cont = new ControleCategoria();
            cont.adicionaCategoria(sql, categoria);
        }
    }

    @Override
    public void excluir(Object obj) {
        
        if (obj instanceof Categoria) {
            Categoria categoria = (Categoria) obj;
            String sql = "DELETE FROM CATEGORIA WHERE id_categoria = ?";
            ControleCategoria cont = new ControleCategoria();
            cont.excluirCategoria(sql,categoria);
        }
    }

    @Override
    public void editar(Object obj) {
        if (obj instanceof Categoria) {
            Categoria categoria = (Categoria) obj;
            String sql = "UPDATE categoria set "
                    + "nome_categoria =?"
                    + "where id_categoria = ? ";
            
            ControleCategoria cont = new ControleCategoria();
            cont.editarCategoria(sql,categoria);
        }
    }

    @Override
    public ArrayList pequisarTodos() {
        String sql = "SELECT * FROM CATEGORIA";
        ControleCategoria cont = new ControleCategoria();
        return lista = cont.listarCategoria(sql);
    }

    public ArrayList pesquisar(String busca) {
        String sql = "SELECT * FROM CATEGORIA WHERE NOME_CATEGORIA LIKE '%" + busca + "%' ";
        ControleCategoria cont = new ControleCategoria();
        return lista = cont.listarCategoria(sql);
    }
    
}
