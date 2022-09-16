package model;

import java.io.Serializable;

public class Telefone implements Serializable{
    private String ddd;
    private String num;
    
    public Telefone(String ddd, String num){
        this.ddd = ddd;
        this.num = num;
    }

    public String getDdd() {
        return ddd;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return ddd + num;
    }
    
}
