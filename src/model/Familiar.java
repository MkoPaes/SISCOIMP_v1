package model;

public class Familiar {
    private String nome;
    private Telefone tel;
    
    public Familiar(String nome, Telefone tel){
        this.nome = nome;
        this.tel = tel;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Telefone getTel() {
        return tel;
    }

    public void setTel(Telefone tel) {
        this.tel = tel;
    }
}
