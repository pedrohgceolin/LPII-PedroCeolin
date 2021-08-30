package Atividade9.Exercicio2;

import Atividade9.Exercicio1.Pais;

import java.util.ArrayList;

public class Continente {
    String nome;
    ArrayList<Pais> contemPaises = new ArrayList<Pais>();

    public Continente(String nome){
        this.nome = nome;
    }

    public void addPais(Pais p){
        this.contemPaises.add(p);
    }

    public float dimConti(){
        float dimTotal =  0;
        for(Pais p : this.contemPaises){
            dimTotal = (float) (dimTotal + p.getDim());
        }
        return dimTotal;
    }

    public int popConti(){
      int popTotal =  0;
        for(Pais p : this.contemPaises){
            popTotal = (popTotal + p.getPop());
        }
        return popTotal;
    }

    public float densidadeCont(){
        return (float) this.popConti()/this.dimConti();
    }

    public Pais popMaior(){
        Pais popMaior = this.contemPaises.get(0);

        for(int i = 1; i<contemPaises.size(); i++){
            Pais p = this.contemPaises.get(i);
            if(p.getPop() > popMaior.getPop()){
                popMaior = p;
            }
        }
        return popMaior;
    }

    public Pais popMenor(){
        Pais popMenor = this.contemPaises.get(0);

        for(int i = 1; i<contemPaises.size(); i++){
            Pais p = this.contemPaises.get(i);
            if(p.getPop() < popMenor.getPop()){
                popMenor = p;
            }
        }
        return popMenor;
    }

    public Pais dimMaior(){
        Pais dimMaior = this.contemPaises.get(0);

        for(int i = 1; i<contemPaises.size(); i++){
            Pais p = this.contemPaises.get(i);
            if(p.getDim() > dimMaior.getDim()){
                dimMaior = p;
            }
        }
        return dimMaior;
    }

    public Pais dimMenor(){
        Pais dimMenor = this.contemPaises.get(0);

        for(int i = 1; i<contemPaises.size(); i++){
            Pais p = this.contemPaises.get(i);
            if(p.getDim() < dimMenor.getDim()){
                dimMenor = p;
            }
        }
        return dimMenor;
    }


    public float razaoTerr(){
        Pais maior = this.dimMaior();
        Pais menor = this.dimMenor();

        return (float) ( maior.getDim()/ menor.getDim());
    }
}
