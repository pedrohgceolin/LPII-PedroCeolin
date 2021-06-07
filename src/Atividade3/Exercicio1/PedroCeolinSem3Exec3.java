package Atividade3.Exercicio1;

public class PedroCeolinSem3Exec3 {
    public static void main(String[] args) {
        String nome = "Pedro Henrique Ceolin";
        String[] vetNomes = new String[10];
        int startIndex = 0;
        int endIndex = 0;
        int cont = 0;

            while( endIndex < nome.length()) {
            endIndex = nome.indexOf(' ', startIndex);
            if (endIndex == -1){
                endIndex = nome.length();
            }

            vetNomes[cont] = nome.substring(startIndex, endIndex);

            startIndex =endIndex + 1;
            cont++;
            }

            StringBuilder abrev = new StringBuilder();

            for (int i=0 ; i<cont ; i++) {
                if (    !vetNomes[i].equals("e") &&
                        !vetNomes[i].equals("do") &&
                        !vetNomes[i].equals("da") &&
                        !vetNomes[i].equals("dos") &&
                        !vetNomes[i].equals("das") &&
                        !vetNomes[i].equals("de") &&
                        !vetNomes[i].equals("di") &&
                        !vetNomes[i].equals("du") ) {

                    abrev.append(vetNomes[i].charAt(0));
                }

            }

        System.out.println("Nome completo: " + nome);
        System.out.println("Nome abreviado: " + abrev);

    }
}

