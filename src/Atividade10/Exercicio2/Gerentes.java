package Atividade10.Exercicio2;

public class Gerentes extends Funcionario{
    private String usuario;
    private String senha;

    public Gerentes(String nome, double salario, String usuario, String senha){
        super(nome, salario);
        this.senha = senha;
        this.usuario = usuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public double calculaBonificacao(){
        return this.getSalario()*0.6 + 100;
    }
    public void mostrarDados(){
        System.out.println("Login: " + this.getUsuario());
        System.out.println("Senha: " + this.getSenha());
    }

}
