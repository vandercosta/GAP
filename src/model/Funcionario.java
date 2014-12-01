

package model;

import java.util.Calendar;
import java.util.Objects;
import view.tabelas.TabelaFuncionario;

public class Funcionario {
    
    private int idFuncionario;
    private String nomeUsuario;
    private long cpf;
    private String telefone;
    private Calendar dataNascimento;
    private Calendar dataEntrada;
    private Calendar dataDemissao;
    private int perfil;

    public Funcionario(int idFuncionario, String nomeUsuario, long cpf, String telefone, Calendar dataNascimento, Calendar dataEntrada, int perfil) {
        this.idFuncionario = idFuncionario;
        this.nomeUsuario = nomeUsuario;
        this.cpf = cpf;
        this.telefone = telefone;
        this.dataNascimento = dataNascimento;
        this.dataEntrada = dataEntrada;
        this.perfil = perfil;
    }

    public Funcionario(int idFuncionario, String nomeUsuario, long cpf, String telefone, Calendar dataNascimento, Calendar dataEntrada, Calendar dataDemissao, int perfil) {
        this.idFuncionario = idFuncionario;
        this.nomeUsuario = nomeUsuario;
        this.cpf = cpf;
        this.telefone = telefone;
        this.dataNascimento = dataNascimento;
        this.dataEntrada = dataEntrada;
        this.dataDemissao = dataDemissao;
        this.perfil = perfil;
    }

    public Funcionario(String nomeUsuario, long cpf, String telefone, Calendar dataNascimento, Calendar dataEntrada, int perfil) {
        this.nomeUsuario = nomeUsuario;
        this.cpf = cpf;
        this.telefone = telefone;
        this.dataNascimento = dataNascimento;
        this.dataEntrada = dataEntrada;
        this.perfil = perfil;
    }
    
    
    


    public int getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(int idFuncionario) {
        this.idFuncionario = idFuncionario;
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

    public int getPerfil() {
        return perfil;
    }

    public void setPerfil(int perfil) {
        this.perfil = perfil;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 31 * hash + this.idFuncionario;
        hash = 31 * hash + Objects.hashCode(this.nomeUsuario);
        hash = 31 * hash + (int) (this.cpf ^ (this.cpf >>> 32));
        hash = 31 * hash + Objects.hashCode(this.telefone);
        hash = 31 * hash + Objects.hashCode(this.dataNascimento);
        hash = 31 * hash + Objects.hashCode(this.dataEntrada);
        hash = 31 * hash + Objects.hashCode(this.dataDemissao);
        hash = 31 * hash + this.perfil;
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
        final Funcionario other = (Funcionario) obj;
        if (this.idFuncionario != other.idFuncionario) {
            return false;
        }
        if (!Objects.equals(this.nomeUsuario, other.nomeUsuario)) {
            return false;
        }
        if (this.cpf != other.cpf) {
            return false;
        }
        if (!Objects.equals(this.telefone, other.telefone)) {
            return false;
        }
        if (!Objects.equals(this.dataNascimento, other.dataNascimento)) {
            return false;
        }
        if (!Objects.equals(this.dataEntrada, other.dataEntrada)) {
            return false;
        }
        if (!Objects.equals(this.dataDemissao, other.dataDemissao)) {
            return false;
        }
        if (this.perfil != other.perfil) {
            return false;
        }
        return true;
    }
    
    

    @Override
    public String toString() {
        return "Funcionario{" + "idFuncionario=" + idFuncionario + ", nomeUsuario=" + nomeUsuario + ", cpf=" + cpf + ", telefone=" + telefone + ", dataNascimento=" + dataNascimento + ", dataEntrada=" + dataEntrada + ", dataDemissao=" + dataDemissao + ", perfil=" + perfil + '}';
    }

    public String[] toArray() {
        String[] funcionarioArray = new String[8];
        funcionarioArray[TabelaFuncionario.INDICE_ID_FUNCIONARIO] = String.valueOf(this.getIdFuncionario());
        funcionarioArray[TabelaFuncionario.INDICE_NOME_USUARIO] = this.getNomeUsuario();
        funcionarioArray[TabelaFuncionario.INDICE_CPF] = String.valueOf(this.getCpf());
        funcionarioArray[TabelaFuncionario.INDICE_TELEFONE] = String.valueOf(this.getTelefone());
        return funcionarioArray;
    }
    

}
