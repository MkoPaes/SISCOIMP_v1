package model;

import java.io.Serializable;

public class Endereco implements Serializable{
    String endereco;
    String numero;

    public Endereco(){}

    public Endereco(String endereco, String numero) {
        this.endereco = endereco;
        this.numero = numero;
    }
    
    
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
}
