package Atividade6;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<String>();
        Scanner leitor = new Scanner(System.in);
        String vizinhos;
        nomes.add("Pedro");
        nomes.add("Maria");
        nomes.add("Augusto");
        nomes.add("Jose");
        nomes.add("Bianca");
        nomes.add("Paulo");
        nomes.add("Ana");
        nomes.add("Joao");
        nomes.add("Tiago");
        nomes.add("Andressa");

        System.out.println("Que nome deseja saber os vizinhos?");
        vizinhos = leitor.nextLine();
        if (nomes.contains(vizinhos)) {
            int i = nomes.indexOf(vizinhos);
            if (i == 0) {
                System.out.println("O elemento posterior eh: " + nomes.get(i + 1));
            } else {
                if (i == nomes.size()-1) {
                    System.out.println("O elemento anterior eh: " + nomes.get(i - 1));
                } else {
                    System.out.println("O elemento anterior eh: " + nomes.get(i - 1));
                    System.out.println("O elemento posterior eh: " + nomes.get(i + 1));
                }
            }
        }
    }

}






