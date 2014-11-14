/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dao;

import java.util.ArrayList;


public interface OperacoesDAO {

	void inserir (Object O);

	boolean excluir (Object O);

	void editar (Object O);

	ArrayList pesquisar();
}