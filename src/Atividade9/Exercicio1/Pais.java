package Atividade9.Exercicio1;

import java.util.ArrayList;

public class Pais {
    String codISO;
    String nome;
    Integer pop;
    Double dim;
    ArrayList<Pais> fronteira = new ArrayList<>();

    public Pais(String codISO, String nome, Double dim){
        this.codISO = codISO;
        this.nome = nome;
        this.dim = dim;
    }

    public String getCodISO(String s) {
        return codISO;
    }

    public void setCodISO(String codISO) {
        this.codISO = codISO;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getPop() {
        return pop;
    }

    public void setPop(Integer pop) {
        this.pop = pop;
    }

    public Double getDim() {
        return dim;
    }

    public void setDim(Double dim) {
        this.dim = dim;
    }

    public boolean mesmoPais(Pais comparador){
        if(this.codISO.equals(comparador.codISO)){
            return true;
        }else {
            return false;
        }
    }

    public boolean fazFronteira(Pais comparador){
        if(this.fronteira.contains(comparador)){
            return true;
        }else {
            return false;
        }
    }

    public ArrayList<Pais> mesmaFronteira(Pais comparador){
        ArrayList<Pais> igual = new ArrayList<>();
        for(Pais p : this.fronteira){
            if (comparador.fazFronteira(p)){
                igual.add(p);
            }
        }
        return igual;
    }

    public float densidade(){
        return (float) (this.pop/this.dim);
    }

}
