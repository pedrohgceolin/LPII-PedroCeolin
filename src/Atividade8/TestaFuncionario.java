package Atividade8;

public class TestaFuncionario {

    public static void main(String[] args){

        Funcionario f1 = new Funcionario();

        Data d1 = new Data();
        d1.dia = 03;
        d1.mes = 8;
        d1.ano = 2020;

        f1.setNome("Hugo");
        f1.setDepartamento("Logistica");
        f1.setSalario(100);
        f1.setDataEntrada(d1);
        f1.setRG("321123321");

        Funcionario f2 = new Funcionario();

        Data d2 = new Data();
        d2.dia = 24;
        d2.mes = 03;
        d2.ano = 2019;

        f2.setNome("Hugo");
        f2.setDepartamento("Logistica");
        f2.setSalario(100);
        f2.setDataEntrada(d2);
        f2.setRG("321123321");

        System.out.println("Primeira comparacao:");
        if (f1==f2){
            System.out.println("iguais");
        }else{
            System.out.println("diferentes");
        }
// 6) Sempre vai aparecer diferente, pois a variavel aponta para lugares diferentes

        Funcionario f3 = new Funcionario();

        f3 = f1;

        System.out.println("Segunda comparacao:");
        if (f1==f3){
            System.out.println("iguais");
        }else{
            System.out.println("diferentes");
        }
// Vai dar iguais pois a variavel aponta para o mesmo objeto na memoria

        f1.mostra();
    }

}
