package Atividade10.Exercicio3;

public class Main {
    public static void main(String[] args) {
        System.out.println("ok");
        Circulo c1 = new Circulo('0',50);
        Quadrado q1 = new Quadrado('X', 10);
        Triangulo t1 = new Triangulo('A', 2, 4);
        System.out.println("Circulo de raio: " + c1.raio + ", area: " + c1.getArea());
        System.out.println("Quadrado de lado: " + q1.lado + ", area: " + q1.getArea());
        System.out.println("Triangulo de base: " + t1.base + " e altura: " + t1.altura + ", area: " + t1.getArea());
        q1.desenhar();
        c1.desenhar();
        t1.desenhar();

    }
}
