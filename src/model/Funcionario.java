

package model;

public class Funcionario {
    
    private int id_funcionario;
    private String nome;
    private String nomeUsuario;
    private long cpf;
    private String telefone;
    private String dataNascimento;
    private String dataEntrada;
    private String dataDemissao;
    private int perfil;

    public Funcionario() {
    }

    public Funcionario(int id_funcionario, String nome, String nomeUsuario, long cpf, String telefone, String dataNascimento, String dataEntrada, String dataDemissao, int perfil) {
        this.id_funcionario = id_funcionario;
        this.nome = nome;
        this.nomeUsuario = nomeUsuario;
        this.cpf = cpf;
        this.telefone = telefone;
        this.dataNascimento = dataNascimento;
        this.dataEntrada = dataEntrada;
        this.dataDemissao = dataDemissao;
        this.perfil = perfil;
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

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(String dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public String getDataDemissao() {
        return dataDemissao;
    }

    public void setDataDemissao(String dataDemissao) {
        this.dataDemissao = dataDemissao;
    }
    
    
}
