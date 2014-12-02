
package controller;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.JOptionPane;
import model.Funcionario;


public class ControleFuncionario {
    
    //efetua conexão, nunca muda
    ConectorBanco conector = new ConectorBanco();
    
    SimpleDateFormat formatoData = new SimpleDateFormat("dd-MMM-yy");
    public ArrayList<Funcionario> listarFuncionario(String consulta){
        
        Connection conexao = conector.getConnection();
        ArrayList<Funcionario> listaFuncionarios = new ArrayList<>();
       
        try{
            PreparedStatement ps =conexao.prepareStatement(consulta);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()){
                
                int idFuncionario = rs.getInt("ID_FUNCIONARIO");
                String nomeUsuario = rs.getString("NOME_USUARIO");
                long cpf = rs.getLong("CPF_FUNCIONARIO");
                String telefone = rs.getString("TELEFONE_FUNCIONARIO");
                
                //DATA NASCIMENTO
                Date nascimento = rs.getDate("DATA_NASCIMENTO");  
                Calendar dataNascimento = Calendar.getInstance();
                dataNascimento.setTime(nascimento);
                
                //DATA ENTRADA
                Date entrada = rs.getDate("DATA_ENTRADA");  
                Calendar dataEntrada = Calendar.getInstance();
                dataEntrada.setTime(entrada);
                
                //DATA DEMISSAO
                Date demissao = rs.getDate("DATA_DEMISSAO");  
                Calendar dataDemissao = Calendar.getInstance();
                if(demissao != null){
                    dataDemissao.setTime(demissao);
                }else{
                    dataDemissao = null;
                }
                int perfil = rs.getInt("PERFIL");     
                Funcionario funcionario = new Funcionario(idFuncionario, nomeUsuario, cpf, telefone, dataNascimento, dataEntrada, dataDemissao, perfil);
                
                //funcionario.setIdFuncionario(rs.getInt("ID_FUNCIONARIO"));
                listaFuncionarios.add(funcionario);
            }
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro na listagem dos funcionarios"+" detalhes: "+ex.getMessage(), "Erro",JOptionPane.ERROR_MESSAGE);
        }
        
        return listaFuncionarios;
    }
    
    
    public void adicionaFuncionario(String consulta, Funcionario funcionario){
        
        Connection conexao = conector.getConnection();
        
        try{
            PreparedStatement ps = conexao.prepareStatement(consulta);
            ps.setString(1, this.formatoData.format(funcionario.getDataEntrada().getTime()));
            ps.setString(2, null);
            ps.setInt(3, funcionario.getPerfil());
            ps.setLong(4, funcionario.getCpf());
            ps.setString(5, this.formatoData.format(funcionario.getDataNascimento().getTime()));
            ps.setString(6, funcionario.getTelefone());
            ps.setString(7,funcionario.getNomeUsuario());
            ps.setInt(8,1); //insere especialidade
            ps.execute();
            
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao inserir funcionario"+" detalhes: "+ex.getMessage(), "Erro",JOptionPane.ERROR_MESSAGE);
        }
        
    }
    
    public void editarFuncionario(String consulta, Funcionario funcionario){
        
        //efetua conexão, nunca muda
        Connection conexao = conector.getConnection();
        
        try{
            PreparedStatement ps = conexao.prepareStatement(consulta);
            
            ps.setString(1,funcionario.getNomeUsuario());
            ps.setLong(2, funcionario.getCpf());
            ps.setString(3, formatoData.format(funcionario.getDataNascimento().getTime()));
            ps.setString(4, funcionario.getTelefone());
            ps.setString(5, formatoData.format(funcionario.getDataEntrada().getTime()));
            ps.setInt(6, funcionario.getPerfil());
            
            if(funcionario.getDataDemissao() ==null){
                ps.setString(7, null);
            }else{
                ps.setString(7, formatoData.format(funcionario.getDataDemissao().getTime()));
            }
            
            ps.setInt(8, funcionario.getIdFuncionario());
            
            ps.executeUpdate();
            
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao editar funcionario"+" detalhes: "+ex.getMessage(), "Erro",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void excluirFuncionario(String consulta, Funcionario funcionario){
        
        //efetua conexão, nunca muda
        Connection conexao = conector.getConnection();
        
        try{
            PreparedStatement ps = conexao.prepareStatement(consulta);
            ps.setInt(1, funcionario.getIdFuncionario());
            ps.execute(); 
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro na exclusão do funcionario"+" detalhes: "+ex.getMessage(), "Erro",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    
    
    
}
