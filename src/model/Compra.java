package model;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Objects;

public class Compra {

    private int idCompra;
    private Calendar dataCompra;
    private Fornecedor fornecedor;
    private double valorTotal;
    private ArrayList<Pedido> listaPedidos;
    private Funcionario usuario;

    public Compra(int idCompra, Calendar dataCompra, Fornecedor fornecedor, double valorTotal, ArrayList<Pedido> listaPedidos, Funcionario usuario) {
        this.idCompra = idCompra;
        this.dataCompra = dataCompra;
        this.fornecedor = fornecedor;
        this.valorTotal = valorTotal;
        this.listaPedidos = listaPedidos;
        this.usuario = usuario;
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

    public ArrayList<Pedido> getListaPedidos() {
        return listaPedidos;
    }

    public void setListaPedidos(ArrayList<Pedido> listaPedidos) {
        this.listaPedidos = listaPedidos;
    }

    public Funcionario getUsuario() {
        return usuario;
    }

    public void setUsuario(Funcionario usuario) {
        this.usuario = usuario;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + this.idCompra;
        hash = 89 * hash + Objects.hashCode(this.dataCompra);
        hash = 89 * hash + Objects.hashCode(this.fornecedor);
        hash = 89 * hash + (int) (Double.doubleToLongBits(this.valorTotal) ^ (Double.doubleToLongBits(this.valorTotal) >>> 32));
        hash = 89 * hash + Objects.hashCode(this.listaPedidos);
        hash = 89 * hash + Objects.hashCode(this.usuario);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Compra other = (Compra) obj;
        if (this.idCompra != other.idCompra) {
            return false;
        }
        if (!Objects.equals(this.dataCompra, other.dataCompra)) {
            return false;
        }
        if (!Objects.equals(this.fornecedor, other.fornecedor)) {
            return false;
        }
        if (Double.doubleToLongBits(this.valorTotal) != Double.doubleToLongBits(other.valorTotal)) {
            return false;
        }
        if (!Objects.equals(this.listaPedidos, other.listaPedidos)) {
            return false;
        }
        if (!Objects.equals(this.usuario, other.usuario)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Compra{" + "idCompra=" + idCompra + ", dataCompra=" + dataCompra + ", fornecedor=" + fornecedor + ", valorTotal=" + valorTotal + ", listaPedidos=" + listaPedidos + ", usuario=" + usuario + '}';
    }
    
    
}
