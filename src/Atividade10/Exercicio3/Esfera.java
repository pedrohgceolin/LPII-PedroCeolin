package Atividade10.Exercicio3;

public class Esfera extends FormaTridimensional {
    int raio;
    int volume;
    int area;

    public Esfera(char c, int raio) {
        super(c);
        this.raio = raio;
    }

    public int getRaio() {
        return raio;
    }

    public void setRaio(int raio) {
        this.raio = raio;
    }

    public double getVolume(){
        this.volume = (int) (4/3*3.14*((Esfera) this).raio*((Esfera) this).raio*((Esfera) this).raio);
        return this.volume;
    }
    public double getArea(){
        this.area = (int) (4*3.14*((Esfera) this).raio*((Esfera) this).raio);
        return this.area;
    }
}
