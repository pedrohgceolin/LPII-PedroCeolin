package Atividade3;

public class PedroCeolinSem3Exec5 {
    public static void main(String[] args) {
        String texto = "Texto   para  exemplo de   exercicio   ";
        StringBuilder textoCorrigido = new StringBuilder(texto.trim());
        int index = 0;

        while( index < textoCorrigido.length()) {
            index = textoCorrigido.indexOf(" ", index);
            if (index == -1){
                index = textoCorrigido.length();
            } else{
                Character c = textoCorrigido.charAt(index - 1);
                if (c.equals(' ')){
                    textoCorrigido.deleteCharAt(index);
                }else{
                    index++;
                }
            }

        }
        System.out.println("Texte corrigido: " + textoCorrigido);
    }
}
