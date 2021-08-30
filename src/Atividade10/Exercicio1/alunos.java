package Atividade10.Exercicio1;

public class alunos extends Pessoa{
    public String curso;

    public alunos(String nome, int matricula, String curso){
        super(nome, matricula);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }



}
