package Atividade10.Exercicio2;

public class Telefonistas extends Funcionario{
    private int estacaoDeTrabalho;
    public Telefonistas(String nome, double salario, int estacaoDeTrabalho){
        super(nome, salario);
        this.estacaoDeTrabalho = estacaoDeTrabalho;
    }

    public int getEstacaoDeTrabalho() {
        return estacaoDeTrabalho;
    }

    public void setEstacaoDeTrabalho(int estacaoDeTrabalho) {
        this.estacaoDeTrabalho = estacaoDeTrabalho;
    }
    public void mostrarDados(){
        System.out.println("estacaoDeTrabalho: " + this.getEstacaoDeTrabalho());
    }
}
