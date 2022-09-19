package controllers;

import java.util.ArrayList;
import java.awt.image.BufferedImage;

import model.*;
import storage.*;

public class Dados {

    private User user = null;
    
    ///Padrão Singleton
    private static Dados uniqueInstance;
    
    private Dados(){
        this.user = Database.readObjFromFile(new User());
        readArray(this.listaAgendamentos, new Agendamento());
        readArray(this.listaProfissionais, new Profissional());
    }

    public static synchronized Dados getInstance(){
        if(uniqueInstance == null){
            uniqueInstance = new Dados();
        }
        return uniqueInstance;
    }

    
    ArrayList<Agendamento> listaAgendamentos = new ArrayList<>();
    ArrayList<Profissional> listaProfissionais = new ArrayList<>();

    
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
   
    //Salvar nos arquivos

    public boolean SalvaDados(){
        boolean success = true;
        
        if(!SalvaUser()) success = false;
        if(!writeArray(listaAgendamentos)) success = false;
        if(!writeArray(listaProfissionais)) success = false;

        return success;
    }


    public boolean SalvaUser(){
        return Database.writeObjToFile(getUser());
    }

    public boolean SalvaAgendamento(){
        return writeArray(listaAgendamentos);
    }
    public boolean SalvaProfissionais(){
        return writeArray(listaProfissionais);
    }
    
    //getters

    public User getUser(){
        if(!hasUser()){
            this.user = new User();
        }
        return this.user;
    }

    public boolean hasUser(){
        if (user == null) {
            user = Database.readObjFromFile(new User());
            return (user != null);
        }

        return true;
    }
    
    public boolean hasAgendamentos(){
        return !listaAgendamentos.isEmpty();
    }
    
    public boolean hasProfissionais(){
        return !listaProfissionais.isEmpty();
    }

    public boolean setUser(String nome, Endereco endereco, String email, String eInfo, BufferedImage foto){
        getUser().setNome(nome);
        getUser().setEndereco(endereco);
        getUser().setEmail(email);
        getUser().seteInfo(eInfo);
        getUser().setFoto(foto);

        return SalvaUser();
    }

    public boolean setUser(String nome, Endereco endereco, String email, String eInfo){
        getUser().setNome(nome);
        getUser().setEndereco(endereco);
        getUser().setEmail(email);
        getUser().seteInfo(eInfo);

        return SalvaUser();
    }

    public boolean SetUsereInfo(String eInfo){      
        
        getUser().seteInfo(eInfo);
        
        return SalvaUser();
    }

    public boolean addUserTel(Telefone t){
        getUser().addTel(t);

        return SalvaUser();
    }

    public boolean removeUserTel(int index){
        if(hasUser()){
            user.removeTel(index);
            return SalvaUser();
        }
        return false;
    }

    public boolean addUserFamiliar(Familiar f){
        getUser().addFamiliares(f);
        return SalvaUser();
    }
    public boolean removeUserFamiliar(int index){
        if(hasUser()){
            user.removeFamiliar(index);
            return SalvaUser();
        }

        return false;
    }

    public ArrayList<Agendamento> getAgendamentos(){
        return listaAgendamentos;
    }
    public Agendamento getAgendamento(int index){
        if(index >= 0 && index < listaAgendamentos.size()){
            return listaAgendamentos.get(index);
        }
        return null;
    }
    public boolean addAgendamento(Agendamento a){
        for (Agendamento ag : listaAgendamentos) {
            if(ag.getData().equals(a.getData())){
                return false;
            }
        }
        listaAgendamentos.add(a);
        SalvaAgendamento();
        return true;
    }
    public boolean agendamentoProximo(Agendamento a){
        for (Agendamento ag : listaAgendamentos) {
            if(ag.getData().isClose(a.getData())){
                return true;
            }
        }
        return false;
    }
    public boolean agendamentoProximo(Data d){
        for (Agendamento ag : listaAgendamentos) {
            if(ag.getData().isClose(d)){
                return true;
            }
        }
        return false;
    }

    public Object[] getProfissionaisArray(){
        return listaProfissionais.toArray();
    }

    public Profissional getProfissional(int index){
        if(index >= 0 && index < listaProfissionais.size()){
            return listaProfissionais.get(index);
        }
        return null;
    }
    public boolean setProfissional(int index, Endereco endereco, Telefone telefone){
        if(index >= 0 && index < listaProfissionais.size()){
            listaProfissionais.get(index).setEndereco(endereco);
            listaProfissionais.get(index).setTel(telefone);
            return SalvaProfissionais();
        }
        return false;
    }
    public void addProfissional(Profissional p){
        listaProfissionais.add(p);
        SalvaProfissionais();
    }
}
