package Atividade11.Exercicio5ao11;

import java.util.ArrayList;

public class Empresa {
    public double custosTotais = 0.0;
    public double custosBas = 0.0;
    public double custosMed = 0.0;
    public double custosUniv = 0.0;
    public double custosSemEsc = 0.0;

    ArrayList<Funcionario> listaFuncionarios = new ArrayList<>();

    public Empresa() {
        this.listaFuncionarios = new ArrayList<Funcionario>();
    }

    public void adicionarItem(Funcionario f) {
        this.listaFuncionarios.add(f);
    }

    public void CustosTotais() {
        for (Funcionario a : this.listaFuncionarios) {
            if (a.universidade != null) {
                custosUniv = custosUniv + a.salario;
            } else {
                if (a.escolaEnsMed != null) {
                    custosMed = custosMed + a.salario;
                    } else { if (a.escolaEnsBas != null) {
                        custosBas = custosBas + a.salario;
                        } else {
                        custosSemEsc = custosSemEsc + a.salario;
                        }
                    custosTotais = custosTotais + a.salario;
                }
            }
        }
    }

    @Override
    public String toString() {
        return "Empresa{" +
                " \nFuncionarios=" + listaFuncionarios +
                "}\n";
    }
}
