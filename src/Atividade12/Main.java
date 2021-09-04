package Atividade12;

public class Main {
    public static void main(String[] args) {
        ItensProduto arroz = new ItensProduto(001,"Arroz branco","Alimentos", 8.50,0,3);
        ItensProduto cerveja = new ItensProduto(002,"Cerveja","Bebidas", 10.80,0,10);
        ItensProduto sabao = new ItensProduto(003,"Sabao em po","Limpeza", 15.00,0,1);

        HorarioDaCompra horaDaCompra = new HorarioDaCompra("22/08/21", 10, 45);

        Pedido p1 = new Pedido();

        p1.adicionarItem(arroz);
        p1.adicionarItem(cerveja);
        p1.adicionarItem(sabao);
        p1.horaDaCompra = horaDaCompra;
        p1.imprimirNota();

        Descontador d1 = new Descontador(p1);
        d1.descontao();
        p1.imprimirNota();
        System.out.println(d1.descontao());

    }
}
