package Atividade11.Exercicio1ao4;

public class Cachorro extends Animal{
    boolean corre;

    public Cachorro(String nome,int idade,boolean emiteSom, boolean corre){
        super(nome, idade, emiteSom);
        this.corre = corre;
    }

    public boolean isCorre() {
        return corre;
    }

    public void setCorre(boolean corre) {
        this.corre = corre;
    }

    public void correr(){
        if(this.corre = true){
            System.out.println("o animal " + this.nome + " esta correndo!!!");
        }
    }

    public void emitirSom(){
        System.out.println("Auuuu");
    }
}
