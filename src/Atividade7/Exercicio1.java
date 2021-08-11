package Atividade7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        Scanner leitor = new Scanner(System.in);
        int x;

        do {
            System.out.print("Digite um numero para adicionar na lista:");
            x=leitor.nextInt();
            if(x>=0) {
                numeros.add(x);
            }
        }while (x>=0);
        System.out.println("Metodo 1:");
        for (int i=0; i<numeros.size();i++){
            System.out.println(numeros.get(i));
        }
        System.out.println("Metodo 2:");
        for (Integer y : numeros){
            System.out.println(y);
        }
        System.out.println("Metodo 3:");
        Iterator c = numeros.iterator();

        while (c.hasNext()){
            System.out.println(c.next());
        }
    }
}






