package Atividade10.Exercicio2;

public class Telefonistas extends Funcionario{
    private int codigo;
    public Telefonistas(String nome, double salario, int codigo){
        super(nome, salario);
        this.codigo = codigo;
    }

}
