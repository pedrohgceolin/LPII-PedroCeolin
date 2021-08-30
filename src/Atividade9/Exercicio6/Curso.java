package Atividade9.Exercicio6;

import java.util.ArrayList;

public class Curso {
    private int codigo;
    private double mensalidade;
    ArrayList<Aluno> alunosLista = new ArrayList<>();

    public Curso(int codigo, double mensalidade){
        this.codigo = codigo;
        this.mensalidade = mensalidade;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getMensalidade() {
        return mensalidade;
    }

    public void setMensalidade(double mensalidade) {
        this.mensalidade = mensalidade;
    }

    public void addAluno(Aluno a){
        this.alunosLista.add(a);
    }

    public int qtdAprovados(){
        int x = 0;
        for(Aluno a : alunosLista){
            if (a.getNotaFinal() >= 7){
                x++;
            }
        }
        return x;
    }

    public int qtdReprovados(){
        int x = 0;
        for(Aluno a : alunosLista){
            if (a.getNotaFinal() < 7){
                x++;
            }
        }
        return x;
    }

    public float receita(){
        return (float) (alunosLista.size()*this.mensalidade);
    }

    public String toString(){
        String s = "Curso" + this.getCodigo()
                + "\nReceita total:" + this.receita()
                + "\nNotas:(";
        for (Aluno a : alunosLista){
            s = s + a.toString() + ",";
        }
        s = s + ")";
        return s;
    }

}
