package model;

public class Telefone {
    private int ddd;
    private int num;
    
    public Telefone(int ddd, int num){
        this.ddd = ddd;
        this.num = num;
    }

    public int getDdd() {
        return ddd;
    }

    public void setDdd(int ddd) {
        this.ddd = ddd;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
    
}
