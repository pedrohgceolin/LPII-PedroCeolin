package Atividade5;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercicio1 {
    public static void main(String[] args) {
       // Scanner leitor = new Scanner(System.in);
        String Cel = "\\(\\d{2}\\)\\d{5}\\-\\d{4}";
        String Fixo = "\\(\\d{2}\\)\\d{4}\\-\\d{4}";

        //System.out.println("Digite um numero de telefone:");
       // String telefone = leitor.nextLine();

        Pattern CelPad = Pattern.compile(Cel);
        Pattern FixoPad = Pattern.compile(Fixo);

        Matcher CelMat = CelPad.matcher(args[0]);
        Matcher FixoMat = FixoPad.matcher(args[0]);

        if(CelMat.matches())
        {
            System.out.println("O telefone digitado eh celular");
        } else {
            if(FixoMat.matches()){
                System.out.println("O telefone digitado eh fixo");
            }else{
                System.out.println("Numero invalido");
            }
        }

    }
}
