package Atividade11.Exercicio1ao4;

public class Veterinario {
    public static void examinar(Animal a){
        System.out.println("Animal " + a.nome + " examinado!");
        a.emitirSom();
    }
}
