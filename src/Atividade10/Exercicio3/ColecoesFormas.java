package Atividade10.Exercicio3;

import java.util.ArrayList;

public class ColecoesFormas {
    ArrayList<Forma> f = new ArrayList<>();
    public ColecoesFormas(){
        this.f = new ArrayList<Forma>();
    }

    public void adicionarItem(Forma f){
        this.f.add(f);
    }

    public void Imprimir(){
        for(Forma f : this.f){
            System.out.println(f);
        }
    }

}
