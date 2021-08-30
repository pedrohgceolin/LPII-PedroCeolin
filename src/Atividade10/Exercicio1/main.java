package Atividade10.Exercicio1;

public class main {
    public static void main(String[] args) {
        Pessoa a1 = new alunos("Pedro",123,"Ciencia da Computacao");

        Pessoa p1 = new Professores("Joao", 456, "Banco de dados");

        Pessoa t1 = new TAE("Paula", 432, "Tesouraria");

        Escola e = new Escola();
        e.adicionarItem(a1);
        e.adicionarItem(p1);
        e.adicionarItem(t1);

        e.imprimir();

    }
}
