package Atividade10.Exercicio2;

public class Main {
    public static void main(String[] args) {
        System.out.println("Rodou");
        Funcionario g1 = new Gerentes("Neila", 1000.02, "Neila123", "Neila123@");
        Funcionario t1 = new Telefonistas("Joao", 900.25, 12);
        Funcionario s1 = new Secretarias("Guilherme", 850.50, 4);

        g1.mostrarDados();
        t1.mostrarDados();
        s1.mostrarDados();

    }
}
