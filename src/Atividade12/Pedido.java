package Atividade12;

import java.util.ArrayList;

public class Pedido {
    public ArrayList<ItensProduto> itensProdutos = new ArrayList<>();
    public HorarioDaCompra horaDaCompra;
    public double valorFinal = 0;

    public ArrayList<ItensProduto> getItensProdutos() {
        return itensProdutos;
    }

    public void setItensProdutos(ArrayList<ItensProduto> itensProdutos) {
        this.itensProdutos = itensProdutos;
    }

    public HorarioDaCompra getHoraDaCompra() {
        return horaDaCompra;
    }

    public void setHoraDaCompra(HorarioDaCompra horaDaCompra) {
        this.horaDaCompra = horaDaCompra;
    }

    public double getValorFinal() {
        return valorFinal;
    }

    public void setValorFinal(double valorFinal) {
        this.valorFinal = valorFinal;
    }

    public Pedido() {
        this.itensProdutos = new ArrayList<ItensProduto>();
    }

    public void adicionarItem(ItensProduto f) {
        this.itensProdutos.add(f);

    }
    public double calcularPrecoFinal(){
        valorFinal=0;
        for(ItensProduto i : this.itensProdutos){
            valorFinal = valorFinal + i.valorUnitario*i.quantidade*(1-i.percentualDesconto);
        }
        return valorFinal;
    }

    public void imprimirNota() {
        System.out.println("     Item        Valor Unitario  % desconto   Quantidade   Valor total");
        System.out.println(" " + this.itensProdutos);
        System.out.println("Total da compra com desconto: " + calcularPrecoFinal());
    }
}
