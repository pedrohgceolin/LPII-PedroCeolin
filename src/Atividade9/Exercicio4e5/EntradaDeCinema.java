package Atividade9.Exercicio4e5;

import Atividade9.Data;

public class EntradaDeCinema {
    Atividade9.Data dataDoFilme;
    float horario;
    int sala;
    float valor;

    public EntradaDeCinema(Atividade9.Data data, float horario, int sala, float valor) {
        this.dataDoFilme = data;
        this.horario = horario;
        this.sala = sala;
        this.valor = valor;
    }

    public Atividade9.Data getDataDoFilme() {
        return dataDoFilme;
    }

    public void setDataDoFilme(Atividade9.Data dataDoFilme) {
        this.dataDoFilme = dataDoFilme;
    }

    public float getHorario() {
        return horario;
    }

    public void setHorario(float horario) {
        this.horario = horario;
    }

    public int getSala() {
        return sala;
    }

    public void setSala(int sala) {
        this.sala = sala;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public void desconto(Atividade9.Data nascimento) {
        int idade = this.dataDoFilme.ano - nascimento.ano;
        if (idade < 12) {
            this.valor = (float) (this.valor * 0.5);
            System.out.println("Desconto de 50% aplicado!");
        }
    }

    public void desconto(Atividade9.Data nascimento, int carteirinha) {
        int idade = this.dataDoFilme.ano - nascimento.ano;
        if (idade >= 12 && idade < 15) {
            this.valor = (float) (this.valor * 0.6);
            System.out.println("Desconto de 40% aplicado!");
        } else {
            if (idade >= 15 && idade < 20) {
                this.valor = (float) (this.valor * 0.7);
                System.out.println("Desconto de 30% aplicado!");
            } else {
                if (idade >= 20) {
                    this.valor = (float) (this.valor * 0.8);
                    System.out.println("Desconto de 20% aplicado!");
                }
            }
        }
    }

    public void descontoHorario (){
        if(this.horario <16){
            this.valor = (float) (this.valor * 0.9);
            System.out.println("Desconto de 10% aplicado!");
        }
    }

    public String toString(){
        return "Entrada de cinema{" +
                "dataDoFilme" + dataDoFilme +
                ", horario" + horario +
                "sala" +sala +
                "valor" + valor + "}";
    }
}

