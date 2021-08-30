package Atividade10.Exercicio3;

import java.util.ArrayList;
import java.util.spi.TimeZoneNameProvider;

public class ColecoesFormas {
    ArrayList<Forma> f = new ArrayList<>();
    Forma c1 = new Circulo(10);
    ColecoesFormas(){
        this.f = new ArrayList<Forma>();
    }

    public void adicionarItem(Forma f){
        this.f.add(c1);
    }

    public void Imprimir(){

    }
}
