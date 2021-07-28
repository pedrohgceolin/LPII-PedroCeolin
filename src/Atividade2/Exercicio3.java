package Atividade2;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
       int[] vetor = new int[10];
       int menor, posMenor=0;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite os valores:");
        for (int i=0; i<10; i++){
            System.out.print("Vetor [" + (i+1) + "]:");
            vetor[i]=leitor.nextInt();
        }
        menor = vetor[0];
        for (int i=0; i<10; i++){
            if(menor>vetor[i]){
                posMenor = i;
                menor = vetor[i];
            }
        }
        System.out.println("Menor valor: " + menor);
        System.out.println("Posicao do menor valor: " + (posMenor+1));
    }
}
