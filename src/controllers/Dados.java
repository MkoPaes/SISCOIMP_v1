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
        readArray(this.listaAgendamentos, new Agendamento());
        readArray(this.listaProfissionais, new Profissional());
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
        
        if(!Database.writeObjToFile(user)) success = false;
        if(!writeArray(listaAgendamentos)) success = false;
        if(!writeArray(listaProfissionais)) success = false;

        return success;
    }


    public boolean SalvaUser(){
        return Database.writeObjToFile(user);
    }

    public boolean SalvaAgendamento(){
        return writeArray(listaAgendamentos);
    }
    public boolean SalvaProfissionais(){
        return writeArray(listaProfissionais);
    }
    
    //getters

    private User getUser(){
        if(!hasUser()){
            return new User();
        }
        return user;
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

    public void removeUserTel(int index){
        if(hasUser()){
            user.removeTel(index);
        }
    }

    public boolean addUserFamiliar(Familiar f){
        getUser().addFamiliares(f);
        return SalvaUser();
    }
    public void removeUserFamiliar(int index){
        if(hasUser()){
            user.removeFamiliar(index);
        }
    }

    public Object[] getAgendamentosArray(){
        return listaAgendamentos.toArray();
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
    public void addProfissional(Profissional p){
        listaProfissionais.add(p);
        SalvaProfissionais();
    }
}
