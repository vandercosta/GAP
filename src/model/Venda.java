package model;
import java.util.ArrayList;
import java.util.Calendar;

public class Venda {
    private int idVenda;
    private Calendar dataVenda;
    private Cliente cliente;
    private double valorTotal;
    private ArrayList<Produto> listaProdutos;

    public Venda() {
        
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

    public Calendar getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(Calendar dataVenda) {
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

    @Override
    public String toString() {
        return "Venda{" + "idVenda=" + idVenda + ", dataVenda=" + dataVenda + ", cliente=" + cliente + ", valorTotal=" + valorTotal + ", listaProdutos=" + listaProdutos + '}';
    }
  
}
