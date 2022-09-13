package model;

import java.awt.image.BufferedImage;
import java.util.ArrayList;

public class User {
    private String nome;
    private String endereco;
    private String email;
    private String eInfo; // Informações de Emergência
    private BufferedImage foto;
    private ArrayList<Telefone> tel;
    private ArrayList<Familiar> familiares;
    private static User uniqueInstance;
    
    
    private User(){}
    
    // Padrão Singleton
    public static synchronized User getInstance(){
        if(uniqueInstance == null)
            uniqueInstance = new User();
        return uniqueInstance;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String geteInfo() {
        return eInfo;
    }

    public void seteInfo(String eInfo) {
        this.eInfo = eInfo;
    }

    public BufferedImage getFoto() {
        return foto;
    }

    public void setFoto(BufferedImage foto) {
        this.foto = foto;
    }

    public ArrayList<Telefone> getTel() {
        return tel;
    }

    public void setTel(ArrayList<Telefone> tel) {
        this.tel = tel;
    }

    public ArrayList<Familiar> getFamiliares() {
        return familiares;
    }

    public void setFamiliares(ArrayList<Familiar> familiares) {
        this.familiares = familiares;
    }
    
}
