package model;

import java.util.Objects;
import view.tabelas.TabelaProduto;

public class Produto {
    private int idProduto;
    private String nome;
    private String modelo;
    private String categoria;
    private double valor;
    private int quantidade;

    
    public Produto(int idProduto, String nome, String modelo, String categoria, double valor, int quantidade) {
        this.idProduto = idProduto;
        this.nome = nome;
        this.modelo = modelo;
        this.categoria = categoria;
        this.valor = valor;
        this.quantidade = quantidade;
    }


    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 41 * hash + this.idProduto;
        hash = 41 * hash + Objects.hashCode(this.nome);
        hash = 41 * hash + Objects.hashCode(this.modelo);
        hash = 41 * hash + Objects.hashCode(this.categoria);
        hash = 41 * hash + (int) (Double.doubleToLongBits(this.valor) ^ (Double.doubleToLongBits(this.valor) >>> 32));
        hash = 41 * hash + this.quantidade;
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
        final Produto other = (Produto) obj;
        if (this.idProduto != other.idProduto) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.modelo, other.modelo)) {
            return false;
        }
        if (!Objects.equals(this.categoria, other.categoria)) {
            return false;
        }
        if (Double.doubleToLongBits(this.valor) != Double.doubleToLongBits(other.valor)) {
            return false;
        }
        if (this.quantidade != other.quantidade) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Produto{" + "idProduto=" + idProduto + ", nome=" + nome + ", modelo=" + modelo + ", categoria=" + categoria + ", valor=" + valor + ", quantidade=" + quantidade + '}';
    }
    
    public String[] toArray() {
        String[] produtoArray = new String[8];
        produtoArray[TabelaProduto.INDICE_ID_PRODUTO] = String.valueOf(this.getIdProduto());
        produtoArray[TabelaProduto.INDICE_NOME] = this.getNome();
        produtoArray[TabelaProduto.INDICE_VALOR] = String.valueOf(this.getValor());
        produtoArray[TabelaProduto.INDICE_QUANTIDADE] = String.valueOf(this.getQuantidade());
        return produtoArray;
    }
     
}
