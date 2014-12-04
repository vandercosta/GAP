/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model.dao;

import controller.ControleFornecedor;
import java.util.ArrayList;
import model.Fornecedor;


public class FornecedorDAO implements OperacoesDAO{
    
    private ArrayList<Fornecedor> fornecedores = new ArrayList();

    @Override
    public void inserir(Object obj) {
        if (obj instanceof Fornecedor) {
            Fornecedor fornecedor = (Fornecedor) obj;
    
            
            String sql = "insert into fornecedor("
                    + "id_fornecedor, cnpj_fornecedor,"
                    + " telefone_fornecedor, nome_fornecedor)"
                    + " values (s_fornecedor.nextval,?,?,?)";
            
            ControleFornecedor cont = new ControleFornecedor();
            cont.adicionaFornecedor(sql, fornecedor);
        }
    }

   @Override
    public void excluir(Object obj) {
        
        if (obj instanceof Fornecedor) {
            Fornecedor fornecedor = (Fornecedor) obj;
            String sql = "DELETE FROM FORNECEDOR WHERE id_fornecedor = ?";
            ControleFornecedor cont = new ControleFornecedor();
            cont.excluirFornecedor(sql,fornecedor);
        }
    }
    @Override
    public void editar(Object obj) {
        if (obj instanceof Fornecedor) {
            Fornecedor fornecedor = (Fornecedor) obj;
            String sql = "UPDATE fornecedor set "
                    + "cnpj_fornecedor =?, telefone_fornecedor =?, nome_fornecedor =?"
                    + "where id_fornecedor = ? ";
            
            ControleFornecedor cont = new ControleFornecedor();
            cont.editarFornecedor(sql,fornecedor);
        }
    }

    @Override
    public ArrayList pequisarTodos() {
        String sql = "SELECT * FROM FORNECEDOR";
        ControleFornecedor cont = new ControleFornecedor();
        return fornecedores = cont.listarFornecedor(sql);
    }
    
    public ArrayList pesquisar(String busca) {
        String sql = "SELECT * FROM FORNECEDOR WHERE NOME_FORNECEDOR LIKE '%" + busca + "%' ";
        ControleFornecedor cont = new ControleFornecedor();
        return fornecedores = cont.listarFornecedor(sql);
    }
    
    
}
