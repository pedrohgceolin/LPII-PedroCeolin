package Atividade6;

import java.util.ArrayList;
import java.util.Collections;

public class Exercicio2 {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<String>();

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

        Collections.sort(nomes);

        for(int i=0; i< nomes.size(); i++){
            System.out.println("Nome "+ i + " : " + nomes.get(i));
        }
    }

}

