package model;

import java.util.ArrayList;

public class ListaA {
    private ArrayList<Agendamento> agenda;

    public ListaA(ArrayList<Agendamento> agenda) {
        this.agenda = agenda;
    }

    public ArrayList<Agendamento> getAgenda() {
        return agenda;
    }

    public void setAgenda(ArrayList<Agendamento> agenda) {
        this.agenda = agenda;
    }
    
}
