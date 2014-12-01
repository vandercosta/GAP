
package model.dao;

import controller.ControleFuncionario;
import java.util.ArrayList;
import java.util.Iterator;
import model.Funcionario;

public class FuncionarioDAO implements OperacoesDAO{
    
    private ArrayList<Funcionario> funcionarios = new ArrayList();

    @Override
    public void inserir(Object obj) {
        if (obj instanceof Funcionario) {
            Funcionario funcionario = (Funcionario) obj;
            funcionarios.add(funcionario);
            
            
            String sql = "";
            ControleFuncionario cont = new ControleFuncionario();
            cont.adicionaFuncionario(funcionario, sql);
        }
    }

    @Override
    public boolean excluir(Object obj) {
        boolean achou = false;
        ArrayList pesquisa = pesquisar(obj);
        if (pesquisa.size() != 0) { //Encontrou alguma coisa
            funcionarios.removeAll(pesquisa);
            achou = true;
        }
        return achou;
    }

    @Override
    public void editar(Object obj) {
        if (obj instanceof Funcionario) {
            Funcionario funcionario = (Funcionario) obj;
            String chave = funcionario.getNomeUsuario();
            for (int i = 0; i < funcionarios.size(); i++) {
                Funcionario achou = funcionarios.get(i);
                if (chave.equals(achou.getNomeUsuario())) {
                    funcionarios.set(i, funcionario);
                }
            }
        }
        
    }

    @Override
    public ArrayList pequisarTodos() {
        String sql = "SELECT * FROM FUNCIONARIO";
        ControleFuncionario cont = new ControleFuncionario();
        return funcionarios = cont.listarFuncionario(sql);
    }
    
    public ArrayList pesquisarUsuario(String usuario) {
        
        String sql = "SELECT * FROM FUNCIONARIO WHERE NOME_USUARIO LIKE '%"+usuario+"%' ";
        ControleFuncionario cont = new ControleFuncionario();
        return funcionarios = cont.listarFuncionario(sql);
    }
    
    public ArrayList pesquisar(Object obj) {
        return funcionarios;
    }
    
    
    
   // public void finalizar(){
        //GerenciadorArquivos.gravarDados("usuarios.dat", usuarios);
    //}
    
    
    
    

    
}
