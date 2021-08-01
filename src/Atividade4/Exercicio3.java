package Atividade4;

public class Exercicio3 {
    public static void main(String[] args) {
        String frase = "pUpm pfpiplpmpe plpepgpapl";
        StringBuilder decod = new StringBuilder();
        int espaco=0;

        for(int i=0; i<frase.length();i++){
            if(frase.charAt(i) ==' '){
                espaco++;
                decod.append(frase.charAt(i));
            }else {
                if (espaco % 2 == 0)
                    if (i % 2 == 1) {
                        decod.append(frase.charAt(i));
                    }
                if (espaco % 2 == 1)
                    if (i % 2 == 0) {
                        decod.append(frase.charAt(i));
                    }
            }
        }
        System.out.println("Frase inicial: " + frase);
        System.out.println("Frase decodificada: " + decod);
    }
}
