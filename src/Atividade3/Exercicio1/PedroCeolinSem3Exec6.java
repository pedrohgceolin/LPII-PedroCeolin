package Atividade3.Exercicio1;

import java.util.Random;
import java.util.Scanner;

public class PedroCeolinSem3Exec6 {

    public static void mutacao(StringBuilder s1) {
        Random rand = new Random();
        int numAleat = rand.nextInt(s1.length());
        int genAlet = rand.nextInt(3);
        switch (genAlet){
            case 0:
                 s1.setCharAt(numAleat, 'a');
                 break;
            case 1:
                s1.setCharAt(numAleat, 't');
                break;
            case 2:
                s1.setCharAt(numAleat, 'c');
                break;
            case 3:
                s1.setCharAt(numAleat, 'g');
                break;
        }
    }

    public static void recombinacao(String s1, String s2, StringBuilder s3, StringBuilder s4) {
        Random rand = new Random();
        int numAleat = rand.nextInt(s1.length()-2) +1;
        s3.append(s1.substring(0,numAleat)).append(s2.substring(numAleat,s2.length()));
        s4.append(s2.substring(0,numAleat)).append(s1.substring(numAleat,s2.length()));
    }


    public static void main(String[] args) {
        String p1 = new String(), p2 = new String();
        StringBuilder f1 = new StringBuilder(), f2 = new StringBuilder();
        Scanner leitor = new Scanner(System.in);


        System.out.print("Digite a primeira sequencia genetica (A,T,C,G): ");
        p1 = leitor.next();

        System.out.print("Digite a segunda sequencia genetica (A,T,C,G): ");
        p2 = leitor.next();

        PedroCeolinSem3Exec6.recombinacao(p1,p2,f1,f2);
        System.out.println("--------RECOMBINACAO--------");
        System.out.println("Pai 1: " + p1);
        System.out.println("Pai 2: " + p2);
        System.out.println("Filho 1: " + f1);
        System.out.println("Filho 2: " + f2);

        PedroCeolinSem3Exec6.mutacao(f1);
        PedroCeolinSem3Exec6.mutacao(f2);

        System.out.println("--------MUTACAO (minuscula)--------");
        System.out.println("Filho 1: " + f1);
        System.out.println("Filho 2: " + f2);
    }

}
