package Atividade10.Exercicio3;

public class Triangulo extends FormaBidimensional{
    public int base;
    public int altura;

    public void Triangulo(int base, int altura){
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
}
