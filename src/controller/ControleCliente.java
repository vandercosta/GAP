package controller;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.JOptionPane;
import model.Cliente;
import model.Funcionario;

/**
 *
 * @author 0175145
 */
public class ControleCliente {

    ConectorBanco conector = new ConectorBanco();

    public ArrayList<Cliente> listarCliente(String consulta) {

        Connection conexao = conector.getConnection();
        ArrayList<Cliente> listaClientes = new ArrayList<>();

        try {
            PreparedStatement ps = conexao.prepareStatement(consulta);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                int idCliente = rs.getInt("ID_CLIENTE");
                String nomeCliente = rs.getString("NOME_CLIENTE");
                long cpf = rs.getLong("CPF_CLIENTE");
                String telefone = rs.getString("TELEFONE_FUNCIONARIO");

                Cliente cliente = new Cliente(idCliente, nomeCliente, cpf);

                //funcionario.setIdFuncionario(rs.getInt("ID_FUNCIONARIO"));
                listaClientes.add(cliente);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro na listagem dos clientes" + " detalhes: " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }

        return listaClientes;
    }

    public void adicionaCliente(String consulta, Cliente cliente) {

        Connection conexao = conector.getConnection();

        try {
            PreparedStatement ps = conexao.prepareStatement(consulta);
            ps.setString(1, cliente.getTelefone());
            ps.setLong(2, cliente.getCpf());
            ps.setString(3, cliente.getNome());
            ps.execute();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir cliente" + " detalhes: " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }

    }
       
    public void editarCliente(String consulta, Cliente cliente){
        
        //efetua conexão, nunca muda
        Connection conexao = conector.getConnection();
        
        try{
            PreparedStatement ps = conexao.prepareStatement(consulta);
            
            ps.setString(1, cliente.getTelefone());
            ps.setLong(2, cliente.getCpf());
            ps.setString(3, cliente.getNome());
            ps.executeUpdate();
            
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao editar cliente"+" detalhes: "+ex.getMessage(), "Erro",JOptionPane.ERROR_MESSAGE);
        }
    }
     
    public void excluirCliente(String consulta, Cliente cliente){
        
        //efetua conexão, nunca muda
        Connection conexao = conector.getConnection();
        
        try{
            PreparedStatement ps = conexao.prepareStatement(consulta);
            ps.setInt(1, cliente.getIdCliente());
            ps.execute(); 
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro na exclusão do cliente"+" detalhes: "+ex.getMessage(), "Erro",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    
}
