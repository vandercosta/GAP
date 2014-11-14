

package model;

import java.util.Calendar;

public class Funcionario {
    
    private int id_funcionario;
    private String nome;
    private String nomeUsuario;
    private long cpf;
    private String telefone;
    private Calendar dataNascimento;
    private Calendar dataEntrada;
    private Calendar dataDemissao;
    private int perfil;

    public Funcionario() {
        
    }



    public int getPerfil() {
        return perfil;
    }

    public void setPerfil(int perfil) {
        this.perfil = perfil;
    }

    public int getId_funcionario() {
        return id_funcionario;
    }

    public void setId_funcionario(int id_funcionario) {
        this.id_funcionario = id_funcionario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Calendar getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Calendar dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Calendar getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(Calendar dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public Calendar getDataDemissao() {
        return dataDemissao;
    }

    public void setDataDemissao(Calendar dataDemissao) {
        this.dataDemissao = dataDemissao;
    }

    @Override
    public String toString() {
        return "Funcionario{" + "id_funcionario=" + id_funcionario + ", nome=" + nome + ", nomeUsuario=" + nomeUsuario + ", cpf=" + cpf + ", telefone=" + telefone + ", dataNascimento=" + dataNascimento + ", dataEntrada=" + dataEntrada + ", dataDemissao=" + dataDemissao + ", perfil=" + perfil + '}';
    }
    
    
}
