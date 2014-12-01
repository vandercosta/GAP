/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.tabelas;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import model.Venda;

/**
 *
 * @author João Fontoura
 */
public class TabelaVenda extends AbstractTableModel{
    
    private ArrayList<Venda> vendas = new ArrayList<>();
    private String[] colunas = {"ID Venda", "cliente", "valorTotal", "usuario"};
    
    public static final int INDICE_ID_VENDA = 0;
    public static final int INDICE_CLIENTE = 1;
    public static final int INDICE_VALORTOTAL = 2;
    public static final int INDICE_USUARIO = 3;

    @Override
    public int getRowCount() {
        return vendas.size();
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
        String[] linha = vendas.get(rowIndex).toArray();
        return linha[columnIndex];
    }
    
    public void inserirVenda(Venda venda) {
        vendas.add(venda);
        this.fireTableDataChanged();
    }
    
    public Venda getSelectedVenda(int linhaSelecionada) {
        return vendas.get(linhaSelecionada);
    }
    
    public void removeVendas(int linhaSelecionada){
        vendas.remove(linhaSelecionada);
        this.fireTableDataChanged();
    }
    
    public void setVenda(ArrayList<Venda> vendas){
        this.vendas = vendas;
        this.fireTableDataChanged();
    }
    
}

