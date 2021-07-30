package Atividade2;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
       int[] vetor = new int[20];
       int troca;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite os valores:");
        for (int i=0; i<20; i++){
            System.out.print("Vetor [" + (i+1) + "]:");
            vetor[i]=leitor.nextInt();
        }

        for (int i=0; i<10; i++){
           troca = vetor[19-i];
           vetor[19-i]=vetor[i];
           vetor[i]=troca;
        }
        for (int i=0; i<20; i++){
            System.out.println("Novo vetor [" + (i+1) + "]:" + vetor[i]);

        }
    }
}
