
package model;

import java.util.Objects;


public class Categoria {
    
    private int idCategoria;
    private String nomeCategoria;

    public Categoria(int idCategoria, String nomeCategoria) {
        this.idCategoria = idCategoria;
        this.nomeCategoria = nomeCategoria;
    }

    public String getNomeCategoria() {
        return nomeCategoria;
    }

    public void setNomeCategoria(String nomeCategoria) {
        this.nomeCategoria = nomeCategoria;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + this.idCategoria;
        hash = 59 * hash + Objects.hashCode(this.nomeCategoria);
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
        final Categoria other = (Categoria) obj;
        if (this.idCategoria != other.idCategoria) {
            return false;
        }
        if (!Objects.equals(this.nomeCategoria, other.nomeCategoria)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Categoria{" + "idCategoria=" + idCategoria + ", nomeCategoria=" + nomeCategoria + '}';
    }
    
    
    
}
