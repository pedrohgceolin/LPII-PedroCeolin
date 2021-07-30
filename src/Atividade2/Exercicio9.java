package Atividade2;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Exercicio9 {
    public static void main(String[] args) {
       int func = 10;
       List lista = new ArrayList();
       String nome = new String();
       int[] dependentes = new int[func];
       int[] hrs_trab = new int[func];
       float sal_brut, total=0;
       Scanner leitor = new Scanner(System.in);

       for (int i=0; i<func; i++){
           System.out.println("Digite o nome do funcionario " + i + " :");
           nome=leitor.next();
           lista.add(nome);
           System.out.println("Digite o numero de dependentes do funcionario " + i + " :");
           dependentes[i] = leitor.nextInt();
           System.out.println("Digite o numero de horas trabalhadas do funcionario " + i + " :");
           hrs_trab[i]=leitor.nextInt();
       }
        for (int i=0; i<func; i++){
            System.out.println("Funcionario " + i + " :" );
            System.out.println("Nome: " + lista.get(i));
            sal_brut= (float) ((dependentes[i]*125.55)+(hrs_trab[i]*100.00));
            System.out.printf("Salario bruto: R$ %.2f\n", sal_brut);
            System.out.printf("Salario liquido: R$ %.2f\n", sal_brut*.88);
            System.out.printf("Desconto: R$ %.2f\n\n", sal_brut*.12);
            total = total+sal_brut;

        }

        System.out.println("Total de funcionarios: " + func);
        System.out.printf("Total gasto: R$ %.2f\n",total);
        System.out.printf("Total descontado: R$ %.2f\n",total*.12);
    }
}
