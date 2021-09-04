package Atividade12;

public class Descontador {
    public Pedido p;
    public double valorDescontado=0;

    public Pedido getP() {
        return p;
    }

    public void setP(Pedido p) {
        this.p = p;
    }

    public double getValorDescontado() {
        return valorDescontado;
    }

    public void setValorDescontado(double valorDescontado) {
        this.valorDescontado = valorDescontado;
    }

    public Descontador(Pedido p){
         this.p = p;
    }

    public String descontao(){
        for (ItensProduto itens : p.getItensProdutos()){
            if(p.horaDaCompra.getHora() > 20 && itens.setor.equals("Fruteira")){
                itens.percentualDesconto = 0.1;
                valorDescontado = valorDescontado + itens.valorUnitario*itens.quantidade*itens.percentualDesconto;
            }
            if(itens.setor.equals("Acougue")&&p.horaDaCompra.dia.equals("Segunda")){
                itens.percentualDesconto = 0.15;
                valorDescontado = valorDescontado + itens.valorUnitario*itens.quantidade*itens.percentualDesconto;
            }
            if(itens.setor.equals("Bebidas")&&itens.quantidade >= 10) {
                itens.percentualDesconto = .2;
                valorDescontado = valorDescontado + itens.valorUnitario * itens.quantidade * itens.percentualDesconto;
            }
        }
        return "Valor descontado: R$ " + valorDescontado;
    }
}
