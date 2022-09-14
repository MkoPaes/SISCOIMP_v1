package model;

import java.awt.image.BufferedImage;

import storage.Storeable;

public class Profissional implements Storeable{
    private String fileID = "storage/profissional";

    private String nome;
    private Endereco endereco;
    private BufferedImage foto;
    private Telefone tel;

    public Profissional(){}
    
    public Profissional(String nome, Endereco endereco, BufferedImage foto, Telefone tel){
        this.nome = nome;
        this.endereco = endereco;
        this.foto = foto;
        this.tel = tel;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public BufferedImage getFoto() {
        return foto;
    }

    public void setFoto(BufferedImage foto) {
        this.foto = foto;
    }

    public Telefone getTel() {
        return tel;
    }

    public void setTel(Telefone tel) {
        this.tel = tel;
    }
    
    public String getFileID(){
        return fileID;
    }
}
