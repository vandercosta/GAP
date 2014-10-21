package model;

import java.util.ArrayList;

public class Compra {

    private int idCompra;
    private int dataCompra;
    private Fornecedor fornecedor;
    private double valorTotal;
    private ArrayList<Produto> listaProdutos;

    public Compra() {
    }

    public Compra(int idCompra, int dataCompra, Fornecedor fornecedor, double valorTotal, ArrayList<Produto> listaProdutos) {
        this.idCompra = idCompra;
        this.dataCompra = dataCompra;
        this.fornecedor = fornecedor;
        this.valorTotal = valorTotal;
        this.listaProdutos = listaProdutos;
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

    public int getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(int dataCompra) {
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
