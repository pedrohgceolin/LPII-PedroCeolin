package Atividade10.Exercicio1;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class Escola {
    ArrayList<Pessoa> p = new ArrayList<>();

    Escola(){
        this.p = new ArrayList<Pessoa>();
    }

    public void adicionarItem(Pessoa p){
        this.p.add(p);
    }


    public void imprimir(){
        for (Pessoa p : this.p){
            System.out.print(p.nome);
            if(p instanceof alunos){
                System.out.println("/aluno");
            }
            if(p instanceof Professores){
                System.out.println("/Professor");
            }
            if(p instanceof TAE){
                System.out.println("/TAE");
            }
        }
    }

}
