
package view.tabelas;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import model.Fornecedor;


public class TabelaFornecedor extends AbstractTableModel{
    
    private ArrayList<Fornecedor> fornecedores = new ArrayList<>();
    private String[] colunas = {"ID", "Nome", "Cnpj", "Telefone"};
    
    public static final int INDICE_ID_FORNECEDOR = 0;
    public static final int INDICE_NOME = 1;
    public static final int INDICE_CNPJ = 2;
    public static final int INDICE_TELEFONE = 3;

    @Override
    public int getRowCount() {
        return fornecedores.size();
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
        String[] linha = fornecedores.get(rowIndex).toArray();
        return linha[columnIndex];
    }
    
    public void inserirFornecedor(Fornecedor fornecedor) {
        fornecedores.add(fornecedor);
        this.fireTableDataChanged();
    }
    
    public Fornecedor getSelectedFornecedor(int linhaSelecionada) {
        return fornecedores.get(linhaSelecionada);
    }
    
    public void removeFornecedores(int linhaSelecionada){
        fornecedores.remove(linhaSelecionada);
        this.fireTableDataChanged();
    }
    
    public void setFornecedor(ArrayList<Fornecedor> fornecedores){
        this.fornecedores = fornecedores;
        this.fireTableDataChanged();
    }
    
}
