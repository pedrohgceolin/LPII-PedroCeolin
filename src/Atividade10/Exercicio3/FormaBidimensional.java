package Atividade10.Exercicio3;

public class FormaBidimensional extends Forma{
    public double area;

    public void FormaBidimensional(){

    }

    public void getArea(){
        if(this instanceof Circulo){
            area = 3.14*((Circulo) this).raio;
        }
        if(this instanceof Quadrado){
            area = (((Quadrado) this).getLado()*((Quadrado) this).getLado());
        }
        if(this instanceof Triangulo){
            area = (((Triangulo) this).base* ((Triangulo) this).altura)/2;
        }
    }


}
