package model;

import storage.Storeable;
import java.util.UUID;  

public class Agendamento implements Storeable{
    
    private String fileID = "agendamento";
    
    private UUID uuid;
    private Data data;
    private Resultado resultado;

    public Agendamento(){}

    public Agendamento(Data data) {
        this.setId();
        this.data = data;
    }

    public UUID getId() {
        return uuid;
    }

    public void setId() {
        this.uuid = UUID.randomUUID(); //Generates random UUID  
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public Resultado getResultado() {
        return resultado;
    }

    public void setResultado(Resultado resultado) {
        this.resultado = resultado;
    }
    
    public String getFileID(){
        return fileID;
    }
}
