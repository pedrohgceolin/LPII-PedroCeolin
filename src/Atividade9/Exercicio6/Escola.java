package Atividade9.Exercicio6;

import Atividade9.Exercicio6.Curso;

import java.util.ArrayList;

public class Escola {
    ArrayList<Curso> cursosLista = new ArrayList<>();

    public int reprovados (){
        int x=0;
        for (Curso c : cursosLista){
            x = x + c.qtdReprovados();
        }
        return x;
    }

    public int maiorReceita (){
        float maior = 0;
        Curso cMaior = null;
        for (Curso c: cursosLista){
            maior = c.receita();
            cMaior = c;
        }
        return cMaior.getCodigo();
    }

    public String toString(){
        String s = "";
        for (Curso c : cursosLista){
            s = s + c.toString()  + "\n";
        }
        return s;
    }

}
