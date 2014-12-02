
package model.dao;

import java.util.ArrayList;
import model.Cliente;
import controller.ControleCliente;

public class ClienteDAO implements OperacoesDAO{

   private ArrayList<Cliente> clientes = new ArrayList();

    @Override
    public void inserir(Object obj) {
        if (obj instanceof Cliente) {
            Cliente cliente = (Cliente) obj;
            String sql = "insert into cliente("
                    + "id_cliente, telefone_cliente, cpf_cliente, nome_cliente)"                 
                    + " values (s_cliente.nextval,?,?,?)";

            ControleCliente cont = new ControleCliente();
            cont.adicionaCliente(sql, cliente);
        }
    }

    @Override
    public void excluir(Object obj) {
        
        if (obj instanceof Cliente) {
            Cliente cliente = (Cliente) obj;
            String sql = "DELETE FROM CLIENTE WHERE id_cliente = ?";

            ControleCliente cont = new ControleCliente();
            cont.excluirCliente(sql,cliente);
        }
        
    }

    @Override
    public void editar(Object obj) {
        if (obj instanceof Cliente) {
            Cliente cliente = (Cliente) obj;
            String sql = "UPDATE cliente set "
                    + "telefone_cliente =?, cpf_cliente =?, nome_cliente =?"
                    + "where id_cliente = ? ";
            
            ControleCliente cont = new ControleCliente();
            cont.editarCliente(sql,cliente);
        }

    }

    @Override
    public ArrayList pequisarTodos() {
        String sql = "SELECT * FROM CLIENTE";
        ControleCliente cont = new ControleCliente();
        return clientes = cont.listarCliente(sql);
    }

    public ArrayList pesquisarUsuario(String usuario) {
        String sql = "SELECT * FROM CLIENTE WHERE NOME_CLIENTE LIKE '%" + usuario + "%' ";
        ControleCliente cont = new ControleCliente();
        return clientes = cont.listarCliente(sql);
    }
    
}
