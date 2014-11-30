
package model.dao;

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
            String chave = funcionario.getNome();
            for (int i = 0; i < funcionarios.size(); i++) {
                Funcionario achou = funcionarios.get(i);
                if (chave.equals(achou.getNome())) {
                    funcionarios.set(i, funcionario);
                }
            }
        }
        
    }

    @Override
    public ArrayList pequisar() {
        return funcionarios;
    }
    
    public ArrayList pesquisar(Object obj) {
        ArrayList<Funcionario> retorno = new ArrayList();
        if (obj instanceof String) {
            String chave = (String) obj;
            Iterator<Funcionario> it = funcionarios.iterator();
            while (it.hasNext()) {
                Funcionario funcionario = it.next();
                if (chave.equalsIgnoreCase(funcionario.getNome())) {
                    retorno.add(funcionario);
                }
            }
        }
        return retorno;
    }
    
    
    
    
}
