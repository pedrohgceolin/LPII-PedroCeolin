package Atividade13.Exercicio1;

public class Principal {
    public static void main(String[] args) {
        Pessoa p1= new Pessoa("Pedro");
        Triatleta t1 = new Triatleta(p1.nome);
        t1.correr();
        t1.nadar();
        t1.pedalar();
        // p1.correr();
        // p1.pedalar();
    }
}
