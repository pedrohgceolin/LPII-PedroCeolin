package Atividade6;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<String>();
        Scanner leitor = new Scanner(System.in);
        String remover;
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

        System.out.println("Que nome deseja remover?");
        remover = leitor.nextLine();
        if (nomes.contains(remover)) {
            nomes.remove(remover);
            System.out.println("Foi removido o nome " + remover);
        }else{
            if(remover.equals("clear")) {
                nomes.clear();
                System.out.println("O conteudo da lista foi apagado");
            }else {
                System.out.println("Nao foi encontrado esse nome na lista");
            }
        }

        for(int i=0; i< nomes.size(); i++){
            System.out.println("Nome "+ i + " : " + nomes.get(i));
        }
    }

}


