package Atividade2;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
       int[] vetor1 = new int[10], vetor2 = new int[10], vetorRes = new int[10];
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite os valores:");
        for (int i=0; i<10; i++){
            System.out.print("Vetor 1 [" + (i+1) + "]:");
            vetor1[i]=leitor.nextInt();
        }
        for (int i=0; i<10; i++){
            System.out.print("Vetor 2 [" + (i+1) + "]:");
            vetor2[i]=leitor.nextInt();
        }
        for (int i=0; i<10; i++){
            vetorRes[i] = vetor1[i] * vetor2[i];
            System.out.println("Vetor 1 [" + (i+1) + "] * Vetor 1 [" + (i+1) + "] = " + vetorRes[i]);
        }

    }
}
