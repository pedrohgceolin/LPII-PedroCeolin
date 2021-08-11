package Atividade7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        ArrayList<String> agenda = new ArrayList<String>();
        Scanner leitor = new Scanner(System.in);
        String nome = new String();
        String telefone = new String();
        int escolha=0;

        do{
            System.out.println("Escolha um item abaixo:");
            System.out.println("1 – cadastrar\n2 – listar\n3 – remover\n4 - sair");
            escolha = leitor.nextInt();
            if(escolha==1){
                System.out.print("Digite o nome:");
                nome=leitor.next();
                System.out.print("Digite o telefone:");
                telefone=leitor.next();
                agenda.add(nome + ";" + telefone);
            }
            if(escolha==2) {
                Collections.sort(agenda);
                for (int i = 0; i < agenda.size(); i++) {
                    String contato = agenda.get(i);
                    String[] separaContato = contato.split(";");
                    System.out.println("Indice: " + (i + 1));
                    System.out.println("Nome: " + separaContato[0]);
                    System.out.println("Telefone: " + separaContato[1]);
                }
            }
            if(escolha==3){
                System.out.println("Digite o indice a ser excluido:");
                int remover;
                remover = leitor.nextInt();
                agenda.remove(remover-1);
            }
        }while (escolha!=4);



    }
}






