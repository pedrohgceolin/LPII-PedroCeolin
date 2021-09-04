package Atividade10.Exercicio3;

public class Triangulo extends FormaBidimensional{
    public int base;
    public int altura;
    public int area;

    public Triangulo(char preenchimento, int base, int altura) {
        super(preenchimento);
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getArea(){
        area = (((Triangulo) this).base* ((Triangulo) this).altura)/2;
        return (int) area;
    }

    public void desenhar(){
        System.out.println("\n "+this.c+"\n"+this.c+this.c+"\n"+this.c+this.c+this.c);
    }
}
