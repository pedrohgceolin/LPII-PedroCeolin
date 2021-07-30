package Atividade2;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
       int[] valor = new int[20];
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite os valores:");
        for (int i=0; i<20; i++){
            valor[i]=leitor.nextInt();
        }
        for (int i=0; i<20; i++){
            System.out.println("Valor " + (i+1) +" : "  + valor[i]);
        }
        int cont=0;
        for (int i=0; i<20; i++){
            if(valor[i]%2==0) {
            cont++;
            }
        }
        System.out.print("Valores pares: " + cont);

    }
}
