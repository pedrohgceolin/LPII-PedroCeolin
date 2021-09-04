package Atividade11.Exercicio5ao11;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        System.out.println("ok");
        Funcionario f1 = new Funcionario("Pedro", "001", "Tia Teteia", "Gerente");
        Funcionario f2 = new Funcionario("Joao", "002", "Tia Teteia", "Vendedor");
        Funcionario f3 = new Funcionario("Carol", "003", "Tia Teteia","Supervisor");
        Funcionario f4 = new Funcionario("Paulo", "004", "Tia Teteia","Vendedor");
        Funcionario f5 = new Funcionario("Rodrigo", "123", "Tia Teteia", "Mace","Vendedor");
        Funcionario f6 = new Funcionario("Renata", "123", "Tia Teteia", "Mace","Vendedor");
        Funcionario f7 = new Funcionario("Roger", "123", "Tia Teteia", "Mace","Vendedor");
        Funcionario f8 = new Funcionario("Ana", "123", "Tia Teteia", "Mace","Vendedor");
        Funcionario f9 = new Funcionario("Paula", "123", "Tia Teteia", "Mace", "Unigran","Vendedor");
        Funcionario f10 = new Funcionario("Cristina", "123", "Tia Teteia", "Mace","Unigran", "Supervisor");

        Empresa empresa = new Empresa();
        empresa.adicionarItem(f1);
        empresa.adicionarItem(f2);
        empresa.adicionarItem(f3);
        empresa.adicionarItem(f4);
        empresa.adicionarItem(f5);
        empresa.adicionarItem(f6);
        empresa.adicionarItem(f7);
        empresa.adicionarItem(f8);
        empresa.adicionarItem(f9);
        empresa.adicionarItem(f10);

        System.out.println(empresa.toString());



    }
}
