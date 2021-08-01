package Atividade4;

public class Exercicio2 {
    public static void main(String[] args) {
        String frase = "Socorram-me, subi no ônibus em Marrocos";
        StringBuilder contrario = new StringBuilder();

        for(int i=frase.length()-1; i>=0;i--){
            contrario.append(frase.charAt(i));
        }
        System.out.println("Frase inicial: "+frase);
        System.out.println("Frase ao contrario: " + contrario);

    }
}
