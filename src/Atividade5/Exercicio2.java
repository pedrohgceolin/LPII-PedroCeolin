package Atividade5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercicio2 {
    public static void main(String[] args) {
        String url = "(http://|https://|ftp://)(www.)?([a-zA-z0-9]+).[a-zA-z0-9]*.[a-z]{3}.?([a-z]+)?";

        Pattern urlPad = Pattern.compile(url);

        Matcher urlMat = urlPad.matcher(args[0]);

        if(urlMat.matches())
        {
            System.out.println("URL valido");
        } else
            {
                System.out.println("URL invalido");
            }
    }

}

