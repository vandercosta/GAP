package model;

import java.util.Objects;
import view.tabelas.TabelaFornecedor;

public class Fornecedor {

    private int idFornecedor;
    private String nome;
    private String telefone;
    private long cnpj;

    public Fornecedor(int idFornecedor, String nome, String telefone, long cnpj) {
        this.idFornecedor = idFornecedor;
        this.nome = nome;
        this.telefone = telefone;
        this.cnpj = cnpj;
    }

    public Fornecedor(String nome, String telefone, long cnpj) {
        this.nome = nome;
        this.telefone = telefone;
        this.cnpj = cnpj;
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

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public long getCnpj() {
        return cnpj;
    }

    public void setCnpj(long cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + this.idFornecedor;
        hash = 59 * hash + Objects.hashCode(this.nome);
        hash = 59 * hash + Objects.hashCode(this.telefone);
        hash = 59 * hash + (int) (this.cnpj ^ (this.cnpj >>> 32));
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
        final Fornecedor other = (Fornecedor) obj;
        if (this.idFornecedor != other.idFornecedor) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.telefone, other.telefone)) {
            return false;
        }
        if (this.cnpj != other.cnpj) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Fornecedor{" + "idFornecedor=" + idFornecedor + ", nome=" + nome + ", telefone=" + telefone + ", cnpj=" + cnpj + '}';
    }

    
    public String[] toArray() {
        String[] fornecedorArray = new String[4];
        fornecedorArray[TabelaFornecedor.INDICE_ID_FORNECEDOR] = String.valueOf(this.getIdFornecedor());
        fornecedorArray[TabelaFornecedor.INDICE_NOME] = this.getNome();
        fornecedorArray[TabelaFornecedor.INDICE_CNPJ] = String.valueOf(this.getCnpj());
        fornecedorArray[TabelaFornecedor.INDICE_TELEFONE] = this.getTelefone();
        return fornecedorArray;
    }
    
   
    
}
