package model;

import java.awt.image.BufferedImage;
import java.util.ArrayList;

import storage.Storeable;

public class User implements Storeable{
    private String fileID = "user";

    private String nome;
    private Endereco endereco;
    private String email;
    private String eInfo; // Informações de Emergência
    private BufferedImage foto;
    private ArrayList<Telefone> tel;
    private ArrayList<Familiar> familiares;

    public User(){
        this.tel = new ArrayList<Telefone>();
        this.familiares = new ArrayList<Familiar>();
    }

    public User(String nome, Endereco endereco, String email, String eInfo, BufferedImage foto) {
        this.nome = nome;
        this.endereco = endereco;
        this.email = email;
        this.eInfo = eInfo;
        this.foto = foto;
        this.tel = new ArrayList<Telefone>();
        this.familiares = new ArrayList<Familiar>();
        System.out.println(tel.toString());
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

    public void addTel(Telefone t){
        // if(tel == null){
        //     tel = new ArrayList<Telefone>();
        // }
        tel.add(t);
    }

    public void removeTel(int index){
        if((index > 0) && (index < this.tel.size())){
            tel.remove(index);
        }
    }

    public ArrayList<Familiar> getFamiliares() {
        return familiares;
    }

    public void setFamiliares(ArrayList<Familiar> familiares) {
        this.familiares = familiares;
    }

    public void addFamiliares(Familiar familiar){
        this.familiares.add(familiar);
    }

    public void removeFamiliar(int index){
        if((index > 0) && (index < this.familiares.size())){
            familiares.remove(index);
        }
    }
    
    public String getFileID(){
        return fileID;
    }

    @Override
    public String toString() {
        return "User [eInfo=" + eInfo + ", email=" + email + ", endereco=" + endereco + ", familiares=" + familiares
                + ", fileID=" + fileID + ", foto=" + foto + ", nome=" + nome + ", tel=" + tel + "]";
    }
}
