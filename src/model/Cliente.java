package model;

import java.util.Objects;
import view.tabelas.TabelaCliente;

public class Cliente {

    private int idCliente;
    private String nome;
    private String telefone;
    private long cpf;

    public Cliente(int idCliente, String nome, long cpf) {
        this.idCliente = idCliente;
        this.nome = nome;
        this.cpf = cpf;
    }

    public Cliente(int idCliente, String nome, String telefone, long cpf) {
        this.idCliente = idCliente;
        this.nome = nome;
        this.telefone = telefone;
        this.cpf = cpf;
    }

    public Cliente(String nome, String telefone, long cpf) {
        this.nome = nome;
        this.telefone = telefone;
        this.cpf = cpf;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
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

    @Override
    public String toString() {
        return "Cliente{" + "idCliente=" + idCliente + ", nome=" + nome + ", telefone=" + telefone + ", cpf=" + cpf + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + this.idCliente;
        hash = 41 * hash + Objects.hashCode(this.nome);
        hash = 41 * hash + Objects.hashCode(this.telefone);
        hash = 41 * hash + Objects.hashCode(this.cpf);
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
        final Cliente other = (Cliente) obj;
        if (this.idCliente != other.idCliente) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.telefone, other.telefone)) {
            return false;
        }
        if (!Objects.equals(this.cpf, other.cpf)) {
            return false;
        }
        return true;
    }
    
    public String[] toArray() {
        String[] clienteArray = new String[4];
        clienteArray[TabelaCliente.INDICE_ID_CLIENTE] = String.valueOf(this.getIdCliente());
        clienteArray[TabelaCliente.INDICE_NOME] = this.getNome();
        clienteArray[TabelaCliente.INDICE_CPF] = String.valueOf(this.getCpf());
        clienteArray[TabelaCliente.INDICE_TELEFONE] = this.getTelefone();
        return clienteArray;
    }
    
    
}
