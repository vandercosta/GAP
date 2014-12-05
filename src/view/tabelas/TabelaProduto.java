
package view.tabelas;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import model.Produto;

public class TabelaProduto extends AbstractTableModel{
    
    private ArrayList<Produto> produtos = new ArrayList<>();
    private String[] colunas = {"ID", "Nome", "Valor", "Quantidade", "Modelo", "Categoria"};
    
    public static final int INDICE_ID_PRODUTO = 0;
    public static final int INDICE_NOME = 1;
    public static final int INDICE_VALOR = 2;
    public static final int INDICE_QUANTIDADE = 3;
    public static final int INDICE_MODELO = 4;
    public static final int INDICE_CATEGORIA = 5;

    @Override
    public int getRowCount() {
        return produtos.size();
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
        String[] linha = produtos.get(rowIndex).toArray();
        return linha[columnIndex];
    }
    
    public void inserirProduto(Produto produto) {
        produtos.add(produto);
        this.fireTableDataChanged();
    }
    
    public Produto getSelectedProduto(int linhaSelecionada) {
        return produtos.get(linhaSelecionada);
    }
    
    public void removeProdutos(int linhaSelecionada){
        produtos.remove(linhaSelecionada);
        this.fireTableDataChanged();
    }
    
    public void setProduto(ArrayList<Produto> produtos){
        this.produtos = produtos;
        this.fireTableDataChanged();
    }
    
}

