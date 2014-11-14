package model;

public class Fornecedor {

    private int idFornecedor;
    private String nome;
    private String telefone;
    private long cnpj;

    public Fornecedor() {
        
    }

   
    
    
    

    public int getIdFornecedor() {
        return idFornecedor;
    }

    public void setIdFornecedor(int idFornecedor) {
        this.idFornecedor = idFornecedor;
    }

    public String getNome() {
        return nome;
    }

    public long getCnpj() {
        return cnpj;
    }

    public void setCnpj(long cnpj) {
        this.cnpj = cnpj;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Fornecedor{" + "idFornecedor=" + idFornecedor + ", nome=" + nome + ", telefone=" + telefone + '}';
    }
    
   
    
}
