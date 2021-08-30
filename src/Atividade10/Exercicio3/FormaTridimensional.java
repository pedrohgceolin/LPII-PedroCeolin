package Atividade10.Exercicio3;

import static java.lang.Math.sqrt;

public class FormaTridimensional extends Forma{
    public double volume;
    public double area;

    public void getArea(){
        if(this instanceof Esfera){
            this.area = 4*3.14*((Esfera) this).raio*((Esfera) this).raio;
        }
        if(this instanceof Cubo){
            this.area = 6* ((Cubo) this).lado * ((Cubo) this).lado;
        }
        if(this instanceof Tetraedro){
            this.area = ((Tetraedro) this).lado*((Tetraedro) this).lado*sqrt(3);
        }
    }

    public void getVolume(){
        if(this instanceof Esfera){
            this.volume = 4/3*3.14*((Esfera) this).raio*((Esfera) this).raio*((Esfera) this).raio;
        }
        if(this instanceof Cubo){
            this.volume = ((Cubo) this).lado * ((Cubo) this).lado* ((Cubo) this).lado;
        }
        if(this instanceof Tetraedro){
            this.volume = ((Tetraedro) this).lado*((Tetraedro) this).lado*((Tetraedro) this).lado*sqrt(2)/12;
        }
    }
}
