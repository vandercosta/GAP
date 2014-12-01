/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.tabelas;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import model.Compra;

/**
 *
 * @author João Fontoura
 */
public class TabelaCompra extends AbstractTableModel {
    private ArrayList<Compra> compras = new ArrayList<>();
    private String[] colunas = {"ID Compra", "fornecedor", "valorTotal", "usuario"};

    public static final int INDICE_ID_COMPRA = 0;
    public static final int INDICE_FORNECEDOR = 1;
    public static final int INDICE_VALORTOTAL = 2;
    public static final int INDICE_USUARIO = 3;

    @Override
    public int getRowCount() {
        return compras.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public String getColumnName(int coluna) { 
        return colunas[coluna];
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        String[] linha = compras.get(rowIndex).toArray();
        return linha[columnIndex];
    }
    
    public void inserirCompra(Compra compra) {
        compras.add(compra);
        this.fireTableDataChanged();
    }
    
    public Compra getSelectedCompra(int linhaSelecionada) {
        return compras.get(linhaSelecionada);
    }
    
    public void removeCompras(int linhaSelecionada){
        compras.remove(linhaSelecionada);
        this.fireTableDataChanged();
    }
    
    public void setCompra(ArrayList<Compra> compras){
        this.compras = compras;
        this.fireTableDataChanged();
    }

}
