package models;

import java.util.Date;

public class Produto {
    private int id;
    private  String descrição;
    private double preço;
    private Date dataValidade;

    public Produto(int id, String descrição,double preço, Date dataValidade) {
        this.id= id;
        this.descrição = descrição;
        this.preço =preço;
        this.dataValidade = dataValidade;

    }

    public void setDescrição(String descrição) {
        this.descrição = descrição;

    }

    public int getId() {
        return id;
    }

    public String getDescrição() {
        return descrição;
    }

    public double getPreço() {
        return preço;
    }

    public Date getDataValidade() {
        return dataValidade;
    }
}
