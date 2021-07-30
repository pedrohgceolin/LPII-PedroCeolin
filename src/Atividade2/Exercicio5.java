package Atividade2;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
       int[] res = new int[6];
       int[] codigo = new int[5];
       int[][] aposta = new int[5][6];
       int[] acertos = new int[5];
       int ganhador=0;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o resultado:");
        for (int i=0; i<6; i++){
            System.out.print("Resultado [" + (i+1) + "]:");
            res[i]=leitor.nextInt();
        }

        for (int i=0; i<5; i++){
            System.out.println("Digite o numero do cartao do jogador " + (i+1) + ":");
            codigo[i]=leitor.nextInt();
            System.out.println("Digite a aposta do jogador " + (i+1) + ":");
            for(int j=0;j<6;j++){
                aposta[i][j]=leitor.nextInt();
            }
        }

        for (int i=0; i<5; i++){
            for(int j=0;j<6;j++){
                for(int k=0;k<6;k++){
                    System.out.println("Jogador: " + i + " Aposta: " + aposta[i][j] + " resultado:" + res[k]);
                    if(aposta[i][j] == res[k]){
                        acertos[i]++;
                        System.out.println("acertos jogador " + i + " : " + acertos[i]);
                    }
                }
            }
        }
        for (int i=0; i<4; i++){
            System.out.println("acertos jogador " + i + " : " + acertos[i]);
            if(acertos[i]<acertos[i+1])
                ganhador=i+1;
        }
        System.out.println("Ganhador e o jogador "+ ganhador);

    }
}
