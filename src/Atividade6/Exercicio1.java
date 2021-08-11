package Atividade6;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<String>();
        String leitura;
        Scanner leitor = new Scanner(System.in);

        do {
            System.out.print("Digite um nome:");
            leitura = leitor.nextLine();
            if(!leitura.isEmpty()){
               if(!nomes.contains(leitura)) {
                   nomes.add(leitura);
               } else {
                   System.out.println("Nome ja existe na lista!!");
               }
            }

        }while(!leitura.isEmpty());

        for(int i=0; i< nomes.size(); i++){
            System.out.println("Nome "+ i + " : " + nomes.get(i));
        }
    }

}

