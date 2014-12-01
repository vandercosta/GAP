/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.tabelas;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import model.Relatorio;

/**
 *
 * @author João Fontoura
 */
public class TabelaRelatorio extends AbstractTableModel{
    
    private ArrayList<Relatorio> relatorios = new ArrayList<>();
    private String[] colunas = {"cliente", "produto", "fornecedor"};
    
    public static final int INDICE_CLIENTE = 0;
    public static final int INDICE_PRODUTO = 1;
    public static final int INDICE_FORNECEDOR = 2;

    @Override
    public int getRowCount() {
        return relatorios.size();
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
        String[] linha = relatorios.get(rowIndex).toArray();
        return linha[columnIndex];
    }
    
    public void inserirRelatorio(Relatorio relatorio) {
        relatorios.add(relatorio);
        this.fireTableDataChanged();
    }
    
    public Relatorio getSelectedRelatorio(int linhaSelecionada) {
        return relatorios.get(linhaSelecionada);
    }
    
    public void removeRelatorios(int linhaSelecionada){
        relatorios.remove(linhaSelecionada);
        this.fireTableDataChanged();
    }
    
    public void setRelatorio(ArrayList<Relatorio> relatorios){
        this.relatorios = relatorios;
        this.fireTableDataChanged();
    }
    
}
