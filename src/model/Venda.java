package model;
import java.util.ArrayList;

public class Venda {
    private int idVenda;
    private String dataVenda;
    private Cliente cliente;
    private double valorTotal;
    private ArrayList<Produto> listaProdutos;

    public Venda() {
    }

    public Venda(int idVenda, String dataVenda, Cliente cliente, double valorTotal, ArrayList<Produto> listaProdutos) {
        this.idVenda = idVenda;
        this.dataVenda = dataVenda;
        this.cliente = cliente;
        this.valorTotal = valorTotal;
        this.listaProdutos = listaProdutos;
    }

    public ArrayList<Produto> getListaProdutos() {
        return listaProdutos;
    }

    public void setListaProdutos(ArrayList<Produto> listaProdutos) {
        this.listaProdutos = listaProdutos;
    }

    public int getIdVenda() {
        return idVenda;
    }

    public void setIdVenda(int idVenda) {
        this.idVenda = idVenda;
    }

    public String getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(String dataVenda) {
        this.dataVenda = dataVenda;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
    
    
    public void cadastrarVenda(){
        
        
    }
    
}
