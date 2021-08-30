package Atividade9.Exercicio3;

public class Pessoa {
    public String nome;
    public Pessoa pai;
    public Pessoa mae;

    public Pessoa(String nome, Pessoa pai, Pessoa mae){
        this.nome = nome;
        this.pai = pai;
        this.mae = mae;
    }

    public boolean mesmoPessoa(Pessoa comparador){
        if(this.nome.equals(comparador.nome) && this.mae == comparador.mae){
            return true;
        }else {
            return false;
        }
    }

    public boolean irmao(Pessoa comparador){
        if(this.mae == comparador.mae || this.pai == comparador.pai){
            return true;
        }else {
            return false;
        }
    }

    public boolean antecessor(Pessoa comparador){

        if(     comparador == this.mae ||
                comparador == this.pai ||
                comparador == this.mae.pai ||
                comparador == this.mae.mae ||
                comparador == this.pai.mae ||
                comparador == this.pai.pai){
            return true;
        }else {
            return false;
        }
    }

}
