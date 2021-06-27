package Atividade3;

import java.util.Scanner;

public class PedroCeolinSem3Exec1 {
    public static void main(String[] args) {
        String frase = new String();
        Scanner leitor = new Scanner(System.in);
        int vogais = 0, digitos = 0, palin = 0;

        System.out.print("Digite a string:");
        frase = leitor.next();

        System.out.println("Numero de caracteres:" + frase.length());
        System.out.println("String em maiusculo:" + frase.toUpperCase());

        for (int i=0; i<frase.length(); i++){
            char c = frase.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')
            {
                vogais++;
            }
        }

        System.out.println("Numero de vogais da string:" + vogais);
        System.out.println("String  comeca com UNI:" + frase.toUpperCase().startsWith("UNI"));
        System.out.println("String  termina com RIO:"+ frase.toUpperCase().endsWith("RIO"));

        for (int i=0; i<frase.length(); i++){
            char c = frase.charAt(i);
            if ( Character.isDigit(c))
            {
                digitos++;
            }
        }

        System.out.println("Numero de digitos da string:" + digitos);

        for (int i=0; i<frase.length(); i++){
            Character c = frase.charAt(i);
            Character d = frase.charAt(frase.length()-(i+1));
            if ( c.equals(d) == false)
            {
                palin++;
            }
        }
        if (palin>0)
        System.out.println("String  eh palindromo: false");
        else
        System.out.println("String  eh palindromo: true");
    }
}
