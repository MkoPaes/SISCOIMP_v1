package model;

import java.awt.image.BufferedImage;

import storage.Storeable;

public class Profissional implements Storeable{
    private String fileID = "profissional";

    private String nome;
    private String endereco;
    private BufferedImage foto;
    private Telefone tel;

    public Profissional(){}
    
    public Profissional(String nome, String endereco, BufferedImage foto, Telefone tel){
        this.nome = nome;
        this.endereco = nome;
        this.foto = foto;
        this.tel = tel;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
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
