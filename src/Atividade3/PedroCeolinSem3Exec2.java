package Atividade3;

import java.util.Scanner;

public class PedroCeolinSem3Exec2 {
    public static void main(String[] args) {

        int num =0, cont = 0, resto = 0;
        String[] vetNum = new String[20];
        Scanner leitor = new Scanner(System.in);

        System.out.print("Entre o numero:");
        num = leitor.nextInt();

        do{
            resto = num % 10;
            num = num/10;

            switch (resto) {
                case 1:
                    vetNum[cont] = "um";
                    break;
                case 2:
                    vetNum[cont] = "dois";
                    break;
                case 3:
                    vetNum[cont] = "tres";
                    break;
                case 4:
                    vetNum[cont] = "quatro";
                    break;
                case 5:
                    vetNum[cont] = "cinco";
                    break;
                case 6:
                    vetNum[cont] = "seis";
                    break;
                case 7:
                    vetNum[cont] = "sete";
                    break;
                case 8:
                    vetNum[cont] = "oito";
                    break;
                case 9:
                    vetNum[cont] = "nove";
                    break;
                case 0:
                    vetNum[cont] = "zero";
                    break;
            }
            cont++;

        } while (resto != 0 || num != 0);

        for (int i=cont-2; i>=0 ; i--){
            System.out.print(vetNum[i] + " , ");
        }

    }
}
