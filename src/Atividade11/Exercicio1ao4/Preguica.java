package Atividade11.Exercicio1ao4;

public class Preguica {
    public boolean isSobeArvore() {
        return sobeArvore;
    }

    public void setSobeArvore(boolean sobeArvore) {
        this.sobeArvore = sobeArvore;
    }

    boolean sobeArvore;

    public Preguica(String nome,int idade, boolean emiteSom, boolean sobeArvore){

        this.sobeArvore = sobeArvore;
    }
}
