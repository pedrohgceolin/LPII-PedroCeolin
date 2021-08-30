package Atividade9.Exercicio6;

public class Aluno {
    private double notaFinal;

    public double getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(double notaFinal) {
        if(notaFinal>10 && notaFinal<0){
            System.out.println("Nota invalida");
        }else {
            this.notaFinal = notaFinal;
        }
    }




}
