package controller;

import java.util.ArrayList;
import java.util.Date;
import model.Cliente;
import model.Produto;

public class RelatorioCliente {
    Cliente cliente;
    ArrayList<Produto> produtos;
    Date dataEmissao;

    public RelatorioCliente() {
    }

    public RelatorioCliente(Cliente cliente, ArrayList<Produto> produtos, Date dataEmissao) {
        this.cliente = cliente;
        this.produtos = produtos;
        this.dataEmissao = dataEmissao;
    }
    
    
    
}
