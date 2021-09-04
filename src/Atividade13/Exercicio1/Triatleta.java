package Atividade13.Exercicio1;

public class Triatleta extends Pessoa implements Corredor, Ciclista, Nadador {
    public Triatleta(String nome){
        super(nome);
    }
    public void correr(){
        System.out.println("correndo");
    }
    public void pedalar(){
        System.out.println("pedalando");
    }
    public void nadar(){
        System.out.println("nadando");
    }

}
