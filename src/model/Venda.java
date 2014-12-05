package model;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Objects;
import view.tabelas.TabelaVenda;

public class Venda {
    private int idVenda;
    private Calendar dataVenda;
    private Cliente cliente;
    private double valorTotal;
    private ArrayList<PedidoCompra> listaPedidos;
    private Funcionario usuario;

    public Venda(int idVenda, Calendar dataVenda, Cliente cliente, double valorTotal, ArrayList<PedidoCompra> listaPedidos, Funcionario usuario) {
        this.idVenda = idVenda;
        this.dataVenda = dataVenda;
        this.cliente = cliente;
        this.valorTotal = valorTotal;
        this.listaPedidos = listaPedidos;
        this.usuario = usuario;
    }

    public Funcionario getUsuario() {
        return usuario;
    }

    public void setUsuario(Funcionario usuario) {
        this.usuario = usuario;
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

    public ArrayList<PedidoCompra> getListaPedidos() {
        return listaPedidos;
    }

    public void setListaPedidos(ArrayList<PedidoCompra> listaPedidos) {
        this.listaPedidos = listaPedidos;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + this.idVenda;
        hash = 53 * hash + Objects.hashCode(this.dataVenda);
        hash = 53 * hash + Objects.hashCode(this.cliente);
        hash = 53 * hash + (int) (Double.doubleToLongBits(this.valorTotal) ^ (Double.doubleToLongBits(this.valorTotal) >>> 32));
        hash = 53 * hash + Objects.hashCode(this.listaPedidos);
        hash = 53 * hash + Objects.hashCode(this.usuario);
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
        final Venda other = (Venda) obj;
        if (this.idVenda != other.idVenda) {
            return false;
        }
        if (!Objects.equals(this.dataVenda, other.dataVenda)) {
            return false;
        }
        if (!Objects.equals(this.cliente, other.cliente)) {
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
        return "Venda{" + "idVenda=" + idVenda + ", dataVenda=" + dataVenda + ", cliente=" + cliente + ", valorTotal=" + valorTotal + ", listaPedidos=" + listaPedidos + ", usuario=" + usuario + '}';
    }

    public String[] toArray() {
        String[] vendaArray = new String[4];
        vendaArray[TabelaVenda.INDICE_ID_VENDA] = String.valueOf(this.getIdVenda());
        vendaArray[TabelaVenda.INDICE_CLIENTE] = String.valueOf(this.getCliente());
        vendaArray[TabelaVenda.INDICE_VALORTOTAL] = String.valueOf(this.getValorTotal());
        vendaArray[TabelaVenda.INDICE_USUARIO] = String.valueOf(this.getUsuario());
        return vendaArray;
    }
  
}
