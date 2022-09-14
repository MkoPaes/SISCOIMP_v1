package controllers;

import java.util.ArrayList;
import java.awt.image.BufferedImage;

import model.*;
import storage.*;

public class Dados {

    ///Padrão Singleton
    private static Dados uniqueInstance;
    
    private Dados(){
        this.user = Database.readObjFromFile(new User());
        this.hasUser = user != null;
        this.hasAgendamentos = readArray(this.listaAgendamentos, new Agendamento());
        this.hasProfissionais = readArray(this.listaProfissionais, new Profissional());
    }

    public static synchronized Dados getInstance(){
        if(uniqueInstance == null){
            uniqueInstance = new Dados();
        }
        return uniqueInstance;
    }

    User user;
    
    ArrayList<Agendamento> listaAgendamentos = new ArrayList<>();
    ArrayList<Profissional> listaProfissionais = new ArrayList<>();

    boolean hasUser = false;
    boolean hasAgendamentos = false;
    boolean hasProfissionais = false;

    
    /**
     * Function to write an array of T to file.
     * Return true upon success, or return false otherwise.
     */
    private <T extends Storeable> boolean writeArray(ArrayList<T> list){
        for (int i = 0; i < list.size(); i++) {
            if(!Database.writeObjToFile(list.get(i), list.get(i).getFileID()+i)){
                return false;
            }
        }
        return true;
    }
    
    /**
     * Function to read an array of T from file.
     * Return true if it reads at least one file.
     * Return false if no file was found.
     */
    private <T extends Storeable> boolean readArray(ArrayList<T> list, T obj){
        int i = 0;
        
        do {
            obj = Database.readObjFromFile(obj, obj.getFileID()+i);
            if(obj != null) list.add(obj);
            
            i++;
        } while (obj != null);
        
        return (i > 1) && (obj != null);
    }

    public boolean SalvaDados(){
        boolean success = true;
        
        if(!Database.writeObjToFile(user)) success = false;
        if(!writeArray(listaAgendamentos)) success = false;
        if(!writeArray(listaProfissionais)) success = false;

        return success;
    }
    
    //getters

    public boolean HasUser(){
        return (user != null);
    }
    
    public boolean HasAgendamentos(){
        return hasAgendamentos;
    }
    
    public boolean HasProfissionais(){
        return hasProfissionais;
    }

    public User getUser(){
        return user;
    }
    public void setUser(String nome, String endereco, String email, String eInfo, BufferedImage foto){
        if(user == null){
            user = new User(nome,endereco,email,eInfo, foto);
        }
        user.setUser(nome,endereco,email,eInfo, foto);
    }

    public ArrayList<Agendamento> getListaAgendamentos(){
        return listaAgendamentos;
    }
    public ArrayList<Profissional> getListaProfissionais(){
        return listaProfissionais;
    }
}
