
package view.tabelas;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import model.Funcionario;


public class TabelaFuncionario extends AbstractTableModel{
    
    private ArrayList<Funcionario> funcionarios = new ArrayList<>();
    private String[] colunas = {"ID Funcionario", "Usuario", "Cpf", "Telefone"};
    
    public static final int INDICE_ID_FUNCIONARIO = 0;
    public static final int INDICE_NOME_USUARIO = 1;
    public static final int INDICE_CPF = 2;
    public static final int INDICE_TELEFONE = 3;

    @Override
    public int getRowCount() {
        return funcionarios.size();
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
        String[] linha = funcionarios.get(rowIndex).toArray();
        return linha[columnIndex];
    }
    
    public void inserirFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
        this.fireTableDataChanged();
    }
    
    public Funcionario getSelectedFuncionario(int linhaSelecionada) {
        return funcionarios.get(linhaSelecionada);
    }
    
    public void removeFuncionarios(int linhaSelecionada){
        funcionarios.remove(linhaSelecionada);
        this.fireTableDataChanged();
    }
    
    public void setFuncionario(ArrayList<Funcionario> funcionarios){
        this.funcionarios = funcionarios;
        this.fireTableDataChanged();
    }
    
}
