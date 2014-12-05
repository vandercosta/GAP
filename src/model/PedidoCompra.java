

package model;

import java.util.Objects;
import view.tabelas.TabelaPedidoCompra;


public class PedidoCompra {
    private Produto produto;
    private Compra compra;
    
    private int quantidade;

    public PedidoCompra(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
    
    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.produto);
        hash = 23 * hash + this.quantidade;
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
        final PedidoCompra other = (PedidoCompra) obj;
        if (!Objects.equals(this.produto, other.produto)) {
            return false;
        }
        if (this.quantidade != other.quantidade) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Pedido{" + "produto=" + produto + ", quantidade=" + quantidade + '}';
    }
    
    public String[] toArray() {
        String[] pedidoArray = new String[3];
        pedidoArray[TabelaPedidoCompra.INDICE_PRODUTO] = String.valueOf(this.getProduto().getIdProduto());
        pedidoArray[TabelaPedidoCompra.INDICE_COMPRA] = String.valueOf(this.getCompra().getIdCompra());
        pedidoArray[TabelaPedidoCompra.INDICE_QUANTIDADE] = String.valueOf(this.getQuantidade());
        return pedidoArray;
    }

    public Compra getCompra() {
        return compra;
    }

    public void setCompra(Compra compra) {
        this.compra = compra;
    }
    
}
