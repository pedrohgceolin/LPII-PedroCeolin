package Atividade11.Exercicio5ao11;

public class Funcionario {
    public String nome = new String();
    public String codigoFuncional = new String();
    public String escolaEnsBas = null;
    public String escolaEnsMed = null;
    public String universidade = null;
    public String comissao = new String();
    public double salario = 1000;

    public Funcionario(String nome, String codigoFuncional, String comissao){
        this.nome = nome;
        this.codigoFuncional = codigoFuncional;
        this.comissao = comissao;
        if (comissao == "Gerente"){
            salario = salario + 1500;
        }else {
            if(comissao == "Supervisor"){
                salario = salario + 600;
            }else{
                if(comissao == "Vendedor"){
                    salario = salario + 250;
                }
            }
        }
    }

    public Funcionario(String nome, String codigoFuncional, String escolaEnsBas, String comissao){
        this.nome = nome;
        this.codigoFuncional = codigoFuncional;
        this.escolaEnsBas = escolaEnsBas;
        salario = salario*1.1;
        this.comissao = comissao;
    }
    public Funcionario(String nome, String codigoFuncional, String escolaEnsBas, String escolaEnsMed, String comissao){
        this.nome = nome;
        this.codigoFuncional = codigoFuncional;
        this.escolaEnsBas = escolaEnsBas;
        this.escolaEnsMed = escolaEnsMed;
        salario = salario*1.1*1.5;
        this.comissao = comissao;
    }
    public Funcionario(String nome, String codigoFuncional, String escolaEnsBas, String escolaEnsMed, String universidade, String comissao){
        this.nome = nome;
        this.codigoFuncional = codigoFuncional;
        this.escolaEnsBas = escolaEnsBas;
        this.escolaEnsMed = escolaEnsMed;
        this.universidade = universidade;
        salario = salario*1.1*1.5*2;
        this.comissao = comissao;
    }

    @Override
    public String toString() {
        return "\nFuncionario{" +
                "nome='" + nome + '\'' +
                ", comissao='" + comissao + '\'' +
                ", salario=" + salario +
                '}';
    }
}
