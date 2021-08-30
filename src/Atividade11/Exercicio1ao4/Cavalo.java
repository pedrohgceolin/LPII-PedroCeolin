package Atividade11.Exercicio1ao4;

public class Cavalo {
    boolean corre;

    public Cavalo(String nome,int idade,boolean emiteSom, boolean corre){
        super(nome, idade, emiteSom);
        this.corre = corre;
    }

    public boolean isCorre() {
        return corre;
    }

    public void setCorre(boolean corre) {
        this.corre = corre;
    }
}
