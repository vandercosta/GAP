
package view.tabelas;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import model.Cliente;


public class TabelaCliente extends AbstractTableModel {
    private ArrayList<Cliente> clientes = new ArrayList<>();
    private String[] colunas = {"ID", "nome", "Cpf", "Telefone"};

    public static final int INDICE_ID_CLIENTE = 0;
    public static final int INDICE_NOME = 1;
    public static final int INDICE_CPF = 2;
    public static final int INDICE_TELEFONE = 3;

    @Override
    public int getRowCount() {
        return clientes.size();
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
        String[] linha = clientes.get(rowIndex).toArray();
        return linha[columnIndex];
    }
    
    public void inserirCliente(Cliente cliente) {
        clientes.add(cliente);
        this.fireTableDataChanged();
    }
    
    public Cliente getSelectedCliente(int linhaSelecionada) {
        return clientes.get(linhaSelecionada);
    }
    
    public void removeClientes(int linhaSelecionada){
        clientes.remove(linhaSelecionada);
        this.fireTableDataChanged();
    }
    
    public void setCliente(ArrayList<Cliente> clientes){
        this.clientes = clientes;
        this.fireTableDataChanged();
    }

}
