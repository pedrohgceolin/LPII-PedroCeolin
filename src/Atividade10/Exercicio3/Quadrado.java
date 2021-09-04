package Atividade10.Exercicio3;

public class Quadrado extends FormaBidimensional{
    public int lado;
    public int area;

    public Quadrado(char preenchimento, int lado) {
        super(preenchimento);
        this.lado = lado;
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    public int getArea(){
        area = (((Quadrado) this).getLado()*((Quadrado) this).getLado());
        return (int) area;
    }

    public void desenhar(){
        System.out.println("\n"+this.c+this.c+this.c+"\n"+this.c+this.c+this.c+"\n"+this.c+this.c+this.c);
    }
}
