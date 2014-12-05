package model;

import java.util.Calendar;
import java.util.Objects;
import view.tabelas.TabelaCompra;

public class Compra {

    private int idCompra;
    private Calendar dataCompra;
    private Fornecedor fornecedor;
    private double valorTotal;
    private Funcionario usuario;

    public Compra(int idCompra, Calendar dataCompra, Fornecedor fornecedor, double valorTotal, Funcionario usuario) {
        this.idCompra = idCompra;
        this.dataCompra = dataCompra;
        this.fornecedor = fornecedor;
        this.valorTotal = valorTotal;
        this.usuario = usuario;
    }

    public Compra(Calendar dataCompra, Fornecedor fornecedor, double valorTotal, Funcionario usuario) {
        this.dataCompra = dataCompra;
        this.fornecedor = fornecedor;
        this.valorTotal = valorTotal;
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
       
        if (!Objects.equals(this.usuario, other.usuario)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Compra{" + "idCompra=" + idCompra + ", dataCompra=" + dataCompra + ", fornecedor=" + fornecedor + ", valorTotal=" + valorTotal + ", usuario=" + usuario + '}';
    }
    
    public String[] toArray() {
        String[] compraArray = new String[4];
        compraArray[TabelaCompra.INDICE_ID_COMPRA] = String.valueOf(this.getIdCompra());
        compraArray[TabelaCompra.INDICE_FORNECEDOR] = this.getFornecedor().getNome();
        compraArray[TabelaCompra.INDICE_VALORTOTAL] = String.valueOf(this.getValorTotal());
        compraArray[TabelaCompra.INDICE_FUNCIONARIO] = this.getUsuario().getNomeUsuario();
        return compraArray;
    }
    
}
