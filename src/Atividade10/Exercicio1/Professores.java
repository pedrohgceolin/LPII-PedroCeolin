package Atividade10.Exercicio1;

public class Professores extends Pessoa{
    public String materia;
    public Professores(String nome, int matricula, String materia){
        super(nome, matricula);
        this.materia = materia;
    }

}
