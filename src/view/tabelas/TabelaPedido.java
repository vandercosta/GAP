/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.tabelas;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import model.Pedido;

/**
 *
 * @author João Fontoura
 */
public class TabelaPedido extends AbstractTableModel{
    
    private ArrayList<Pedido> pedidos = new ArrayList<>();
    private String[] colunas = {"produto", "Quantidade"};
    
    public static final int INDICE_PRODUTO = 0;
    public static final int INDICE_QUANTIDADE = 1;


    @Override
    public int getRowCount() {
        return pedidos.size();
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
        String[] linha = pedidos.get(rowIndex).toArray();
        return linha[columnIndex];
    }
    
    public void inserirPedido(Pedido pedido) {
        pedidos.add(pedido);
        this.fireTableDataChanged();
    }
    
    public Pedido getSelectedFornecedor(int linhaSelecionada) {
        return pedidos.get(linhaSelecionada);
    }
    
    public void removePedidos(int linhaSelecionada){
        pedidos.remove(linhaSelecionada);
        this.fireTableDataChanged();
    }
    
    public void setPedido(ArrayList<Pedido> pedidos){
        this.pedidos = pedidos;
        this.fireTableDataChanged();
    }
    
}