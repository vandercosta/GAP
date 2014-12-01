
package controller;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.JOptionPane;
import model.Funcionario;


//fazer para o banco, copiar do discoteca GerenciadoArquivos
public class ControleFuncionario {
    
    ConectorBanco conector = new ConectorBanco();
    
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
    
    
    public void adicionaFuncionario(Funcionario funcionario, String consulta){
        
        Connection conexao = conector.getConnection();
        
        try{
            PreparedStatement ps = conexao.prepareStatement(consulta);
            ps.setString(1, "07-NOV-13");
            ps.setInt(2, funcionario.getPerfil());
            ps.setLong(3, funcionario.getCpf());
            ps.setString(4, "08-NOV-13");
            ps.setString(5, funcionario.getTelefone());
            ps.setString(6, funcionario.getNomeUsuario());
            
            ps.execute();
            
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao inserir funcionario"+" detalhes: "+ex.getMessage(), "Erro",JOptionPane.ERROR_MESSAGE);
        }
        
    }
    
    
    
}
