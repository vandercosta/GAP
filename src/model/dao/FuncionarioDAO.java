package model.dao;

import controller.ControleFuncionario;
import java.util.ArrayList;
import model.Funcionario;

public class FuncionarioDAO implements OperacoesDAO {

    private ArrayList<Funcionario> funcionarios = new ArrayList();

    @Override
    public void inserir(Object obj) {
        if (obj instanceof Funcionario) {
            Funcionario funcionario = (Funcionario) obj;
            String sql = "insert into funcionario("
                    + "id_funcionario, data_entrada, perfil, cpf_funcionario,"
                    + " data_nascimento, telefone_funcionario, nome_usuario)"
                    + " values (s_funcionario.nextval,?,?,?,?,?,?)";

            ControleFuncionario cont = new ControleFuncionario();
            cont.adicionaFuncionario(sql, funcionario);
        }
    }

    @Override
    public void excluir(Object obj) {
        
        if (obj instanceof Funcionario) {
            Funcionario funcionario = (Funcionario) obj;
            String sql = "DELETE FROM FUNCIONARIO WHERE id_funcionario = ?";

            ControleFuncionario cont = new ControleFuncionario();
            cont.excluirFuncionario(sql,funcionario);
        }
        
    }

    @Override
    public void editar(Object obj) {
        if (obj instanceof Funcionario) {
            Funcionario funcionario = (Funcionario) obj;
            String sql = "UPDATE funcionario set "
                    + "nome_usuario =?, cpf_funcionario =?, data_nascimento =?, telefone_funcionario= ?, data_entrada =?, perfil =?, data_demissao =?"
                    + "where id_funcionario = ? ";
            
            ControleFuncionario cont = new ControleFuncionario();
            cont.editarFuncionario(sql,funcionario);
        }

    }

    @Override
    public ArrayList pequisarTodos() {
        String sql = "SELECT * FROM FUNCIONARIO";
        ControleFuncionario cont = new ControleFuncionario();
        return funcionarios = cont.listarFuncionario(sql);
    }

    public ArrayList pesquisarUsuario(String usuario) {
        String sql = "SELECT * FROM FUNCIONARIO WHERE NOME_USUARIO LIKE '%" + usuario + "%' ";
        ControleFuncionario cont = new ControleFuncionario();
        return funcionarios = cont.listarFuncionario(sql);
    }

    

   // public void finalizar(){
    //GerenciadorArquivos.gravarDados("usuarios.dat", usuarios);
    //}
}
