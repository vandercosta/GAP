

package model;

import java.util.Calendar;
import view.tabelas.TabelaRelatorio;


public class Relatorio {
    
    private Cliente cliente;
    private Produto produto;
    private Fornecedor fornecedor;
    private Calendar dataEmissao;

    public Relatorio(Cliente cliente, Produto produto, Fornecedor fornecedor) {
        this.cliente = cliente;
        this.produto = produto;
        this.fornecedor = fornecedor;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Calendar getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(Calendar dataEmissao) {
        this.dataEmissao = dataEmissao;
    }
    
    public String[] toArray() {
        String[] relatorioArray = new String[8];
        relatorioArray[TabelaRelatorio.INDICE_CLIENTE] = String.valueOf(this.getCliente());
        relatorioArray[TabelaRelatorio.INDICE_PRODUTO] = String.valueOf(this.getProduto());
        relatorioArray[TabelaRelatorio.INDICE_FORNECEDOR] = String.valueOf(this.getFornecedor());
        return relatorioArray;
    }
    
    
    
}
