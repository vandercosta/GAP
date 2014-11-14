package model;

import java.util.ArrayList;
import java.util.Calendar;

public class Compra {

    private int idCompra;
    private Calendar dataCompra;
    private Fornecedor fornecedor;
    private double valorTotal;
    private ArrayList<Produto> listaProdutos;

    public Compra() {
        
    }

    

    public ArrayList<Produto> getListaProdutos() {
        return listaProdutos;
    }

    public void setListaProdutos(ArrayList<Produto> listaProdutos) {
        this.listaProdutos = listaProdutos;
    }

    public int getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(int idCompra) {
        this.idCompra = idCompra;
    }

    public Calendar getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(Calendar dataCompra) {
        this.dataCompra = dataCompra;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    @Override
    public String toString() {
        return "Compra{" + "idCompra=" + idCompra + ", dataCompra=" + dataCompra + ", fornecedor=" + fornecedor + ", valorTotal=" + valorTotal + ", listaProdutos=" + listaProdutos + '}';
    }
    
  
}
