package Atividade10.Exercicio2;

public class Gerentes extends Funcionario{
    private String usuario;
    private String senha;

    public Gerentes(String nome, double salario, String usuario, String senha){
        super(nome, salario);
        this.senha = senha;
        this.usuario = usuario;
    }

}
