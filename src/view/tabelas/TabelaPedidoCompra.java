
package view.tabelas;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import model.PedidoCompra;

public class TabelaPedidoCompra extends AbstractTableModel{
    
    private ArrayList<PedidoCompra> pedidos = new ArrayList<>();
    private String[] colunas = {"produto","Compra", "Quantidade"};
    
    public static final int INDICE_PRODUTO = 0;
    public static final int INDICE_COMPRA = 1;
    public static final int INDICE_QUANTIDADE = 2;


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
    
    public void inserirPedido(PedidoCompra pedido) {
        pedidos.add(pedido);
        this.fireTableDataChanged();
    }
    
    public PedidoCompra getSelectedFornecedor(int linhaSelecionada) {
        return pedidos.get(linhaSelecionada);
    }
    
    public void removePedidos(int linhaSelecionada){
        pedidos.remove(linhaSelecionada);
        this.fireTableDataChanged();
    }
    
    public void setPedido(ArrayList<PedidoCompra> pedidos){
        this.pedidos = pedidos;
        this.fireTableDataChanged();
    }
    
}