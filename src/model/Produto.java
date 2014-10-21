package model;

public class Produto {
    private int idProduto;
    private String nome;
    private String modelo;
    private String categoria;
    private double valor;
    private Fornecedor fornecedor;
    private int quantidade;

    public Produto() {
    }

    public Produto(int idProduto, String nome, String modelo, String categoria, double valor, Fornecedor fornecedor, int quantidade) {
        this.idProduto = idProduto;
        this.nome = nome;
        this.modelo = modelo;
        this.categoria = categoria;
        this.valor = valor;
        this.fornecedor = fornecedor;
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

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    @Override
    public String toString() {
        return "Produto{" + "idProduto=" + idProduto + ", nome=" + nome + ", modelo=" + modelo + ", categoria=" + categoria + ", valor=" + valor + ", fornecedor=" + fornecedor + ", quantidade=" + quantidade + '}';
    }
    
    
}
