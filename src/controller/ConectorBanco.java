
package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class ConectorBanco {
    
    Connection getConnection(){
        Connection conexao = null;
        try{
            Class.forName("oracle.jdbc.OracleDriver");
            
            String url = "jdbc:oracle:thin:@oracle.inf.poa.ifrs.edu.br:1521:XE";
            conexao = DriverManager.getConnection(url, "usr16", "usr16");

        }catch (SQLException ex){
            
            JOptionPane.showMessageDialog(null, "Problemas na conexão"+" detalhes: "+ex.getMessage(), "Erro",JOptionPane.ERROR_MESSAGE);
        }catch (ClassNotFoundException ex){
            JOptionPane.showMessageDialog(null, "Driver não encontrado"+" detalhes: "+ex.getMessage(), "Erro",JOptionPane.ERROR_MESSAGE);
        }
        return conexao;
    }
    
}
