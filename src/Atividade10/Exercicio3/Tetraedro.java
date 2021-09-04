package Atividade10.Exercicio3;

import static java.lang.Math.sqrt;

public class Tetraedro extends FormaTridimensional{

    public int lado;
    public int area;
    public int volume;

    public Tetraedro(char c, int lado){
        super();
        this.lado = lado;
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    public double getArea(){
        this.area = (int) (((Tetraedro) this).lado*((Tetraedro) this).lado*sqrt(3));
        return this.area;
    }
    public double getVolume(){
        this.volume = (int) (((Tetraedro) this).lado*((Tetraedro) this).lado*((Tetraedro) this).lado*sqrt(2)/12);
        return this.volume;
    }
}
