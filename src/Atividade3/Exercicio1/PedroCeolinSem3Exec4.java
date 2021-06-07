package Atividade3.Exercicio1;

public class PedroCeolinSem3Exec4 {
    public static void main(String[] args) {
        String texto = "Texto para exemplo de exercicio";
        int startIndex = 0;
        int endIndex = 0;
        int cont = 0;

        while( endIndex < texto.length()) {
            endIndex = texto.indexOf(' ', startIndex);
            if (endIndex == -1){
                endIndex = texto.length();
            }
            startIndex = endIndex + 1;
            cont++;
        }
        System.out.println("Quantidade de palavras: " + cont);
        System.out.println("Total de caracteres: " + (texto.length() - (cont-1)));
    }
}
