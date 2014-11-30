package model.dao;

import java.util.ArrayList;

public interface OperacoesDAO {

    void inserir(Object obj);

    boolean excluir(Object obj);

    void editar(Object obj);

    ArrayList pequisar(); //Pesquisar tudo

}
