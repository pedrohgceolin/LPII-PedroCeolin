package Atividade4;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        String frase = "Socorram-me, subi no ônibus em Marrocos";
        String[] vetor = frase.split(" ");

        for(int i=0; i< vetor.length;i++){
            System.out.println(vetor[i] + " ");
        }

        for(int i=0; i<vetor.length;i++){
            System.out.println(vetor[vetor.length-i-1] + " ");
        }

    }
}
