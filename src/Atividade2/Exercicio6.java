package Atividade2;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
       int[] X = new int[10], Y = new int[10], P = new int[20];
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o dois vetores:");
        for (int i=0; i<10; i++){
            System.out.print("Vetor X [" + (i+1) + "]:");
            X[i]=leitor.nextInt();
        }
        for (int i=0; i<10; i++){
            System.out.print("Vetor Y [" + (i+1) + "]:");
            Y[i]=leitor.nextInt();
        }
        for (int i=0; i<10; i++){
            System.out.println("Vetor X [" + (i+1) + "]:" + X[i]);
        }
        for (int i=0; i<10; i++){
            System.out.println("Vetor Y [" + (i+1) + "]:" + Y[i]);
        }
        for (int i=0; i<10; i++){
            P[i]=X[i];
            P[i+10]=Y[i];
        }
        for (int i=0; i<20; i++){
            System.out.println("Vetor P [" + (i+1) + "]:" + P[i]);
        }
        for (int i=0; i<10; i++){
            P[i]=X[i]-Y[i];
        }
        for (int i=0; i<10; i++){
            System.out.println("Vetor P [" + (i+1) + "]:" + P[i]);
        }
        for (int i=0; i<10; i++){
            P[i]=X[i]+Y[i];
        }
        for (int i=0; i<10; i++){
            System.out.println("Vetor P [" + (i+1) + "]:" + P[i]);
        }
        for (int i=0; i<10; i++){
            P[i]=X[i]*Y[i];
        }
        for (int i=0; i<10; i++){
            System.out.println("Vetor P [" + (i+1) + "]:" + P[i]);
        }
        int intersecao=0;
        for (int i=0; i<10; i++){
            for (int j=0; j<10; j++){
                if(X[i]==Y[j])
                {
                    P[intersecao]=X[i];
                    intersecao++;
                }
            }
        }
        for (int i=0; i<intersecao; i++){
            System.out.println("Vetor P [" + (i+1) + "]:" + P[i]);
        }
    }
}
