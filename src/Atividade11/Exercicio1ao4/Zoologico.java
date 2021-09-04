package Atividade11.Exercicio1ao4;

import java.util.ArrayList;

public class Zoologico {
    ArrayList<Animal> listaAnimais = new ArrayList<>();

    public Zoologico(){
        this.listaAnimais = new ArrayList<Animal>();
    }

    public void adicionarItem(Animal f){
        this.listaAnimais.add(f);
    }

    public void percorrerJaulas(){
        for(Animal a : this.listaAnimais){
            a.emitirSom();
            if(a instanceof Cachorro || a instanceof Cavalo){
                a.correr();
            }
        }
    }
}
