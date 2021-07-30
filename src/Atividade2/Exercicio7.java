package Atividade2;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
       int[] V = new int[10];
       int N, nega=0;
       Scanner leitor = new Scanner(System.in);
       System.out.println("Digite o vetor:");
       for (int i=0; i<10; i++){
            System.out.print("Vetor V [" + (i+1) + "]:");
            V[i]=leitor.nextInt();
       }
        System.out.println("Digite o numero:");
        N=leitor.nextInt();
        for(int i=0; i<10;i++){
            if(N == V[i]){
                System.out.println("Encontrado na posicao " + (i+1));
                nega++;
            }
        }
        if(nega==0){
            System.out.println("O numero fornecido nao existe no vetor!");
        }
    }
}
