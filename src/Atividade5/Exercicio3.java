package Atividade5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercicio3 {
    public static void main(String[] args) {
        String senhaForte = "^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[$*&@#])[0-9a-zA-Z$*&@#]{8,}$";

        Pattern senhaPad = Pattern.compile(senhaForte);

        Matcher senhaMat = senhaPad.matcher(args[0]);

        if(senhaMat.matches())
        {
            System.out.println("Senha forte");
        } else
            {
                System.out.println("Senha fraca");
            }
    }

}

