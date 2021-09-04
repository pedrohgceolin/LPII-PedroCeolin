package Atividade11.Exercicio5ao11;

public class Comissoes extends Funcionario {
    public double Gerente = 1500;
    public double Supervisor = 600;
    public double Vendedor = 250;

    public Comissoes(String nome, String codigoFuncional, String comissao) {
        super(nome, codigoFuncional, comissao);
    }

    public Comissoes(String nome, String codigoFuncional, String escolaEnsBas, String comissao) {
        super(nome, codigoFuncional, escolaEnsBas, comissao);
    }

    public Comissoes(String nome, String codigoFuncional, String escolaEnsBas, String escolaEnsMed, String comissao) {
        super(nome, codigoFuncional, escolaEnsBas, escolaEnsMed, comissao);
    }

    public Comissoes(String nome, String codigoFuncional, String escolaEnsBas, String escolaEnsMed, String universidade, String comissao) {
        super(nome, codigoFuncional, escolaEnsBas, escolaEnsMed, universidade, comissao);
    }
}
