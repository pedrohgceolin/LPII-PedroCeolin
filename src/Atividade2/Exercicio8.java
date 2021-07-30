package Atividade2;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
       int[] V = new int[15];
       int troca;
       Scanner leitor = new Scanner(System.in);
       System.out.println("Digite o vetor:");
       for (int i=0; i<15; i++){
            System.out.print("Vetor V [" + (i+1) + "]:");
            V[i]=leitor.nextInt();
       }
       for(int i=0; i<14;i++){
          for(int j=0; j<14;j++)
          {
              if(V[j]<V[j+1]){
                  troca = V[j];
                  V[j]=V[j+1];
                  V[j+1]=troca;
              }
          }
       }
        for (int i=0; i<15; i++){
            System.out.println("Vetor V [" + (i+1) + "]:" + V[i]);
        }
    }
}
