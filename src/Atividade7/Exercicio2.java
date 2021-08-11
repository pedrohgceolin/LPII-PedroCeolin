package Atividade7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        Scanner leitor = new Scanner(System.in);
        int x;
        for (int i = 0; i<10; i++) {
            System.out.print("Digite um numero para adicionar na lista:");
            x=leitor.nextInt();
            numeros.add(x);
        }
        for(Integer y : numeros){
            System.out.println("Todos elementos: " + y);
        }
        for(int i = 0;i< numeros.size();i++){
            if(numeros.get(i)%2==0){
                numeros.remove(i);
            }
        }
        for(Integer b : numeros){
            System.out.println("Somente impares: " + b);
        }


    }
}






