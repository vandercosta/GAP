package model.dao;

import java.util.ArrayList;

public interface OperacoesDAO {

    void inserir(Object obj);

    void excluir(Object obj);

    void editar(Object obj);

    ArrayList pequisarTodos(); //Pesquisar tudo

}
