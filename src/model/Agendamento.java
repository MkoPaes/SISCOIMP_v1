package model;

import storage.Storeable;

public class Agendamento implements Storeable{
    
    private String fileID = "agendamento";
    
    private String id;
    private Data data;
    private Resultado resultado;

    public Agendamento(){}

    public Agendamento(String id, Data data) {
        this.id = id;
        this.data = data;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
