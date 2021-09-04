package Atividade11.Exercicio1ao4;

public class Animal {
    String nome;
    int idade;
    boolean emiteSom;

    public Animal(String nome,int idade,boolean emiteSom){
        this.nome = nome;
        this.idade = idade;
        this.emiteSom = emiteSom;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public boolean isEmiteSom() {
        return emiteSom;
    }

    public void setEmiteSom(boolean emiteSom) {
        this.emiteSom = emiteSom;
    }

    public void emitirSom() {
    }

    public void correr(){
    }
}
