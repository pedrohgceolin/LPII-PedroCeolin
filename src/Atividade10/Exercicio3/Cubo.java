package Atividade10.Exercicio3;

import static java.lang.Math.sqrt;

public class Cubo extends FormaTridimensional{
    public int lado;
    public int area;
    public int volume;

    public Cubo(int lado){
        this.lado = lado;
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    public double getArea(){
        this.area = 6* ((Cubo) this).lado * ((Cubo) this).lado;
        return this.area;
    }

    public double getVolume() {
        this.volume = ((Cubo) this).lado * ((Cubo) this).lado * ((Cubo) this).lado;
        return volume;
    }
}
