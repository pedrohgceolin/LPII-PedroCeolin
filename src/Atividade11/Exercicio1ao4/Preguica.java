package Atividade11.Exercicio1ao4;

public class Preguica extends Animal{

    boolean sobeArvore;

    public boolean isSobeArvore() {
        return sobeArvore;
    }

    public void setSobeArvore(boolean sobeArvore) {
        this.sobeArvore = sobeArvore;
    }

    public Preguica(String nome,int idade, boolean emiteSom, boolean sobeArvore){
        super(nome, idade, emiteSom);
        this.sobeArvore = sobeArvore;
    }

    public void emitirSom(){
        System.out.println("uuuu");
    }
}
