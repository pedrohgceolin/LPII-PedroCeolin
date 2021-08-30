package Atividade10.Exercicio3;

public class Circulo extends FormaBidimensional{
    public int raio;

    public Circulo(int i) {
        super();
        this.raio = i;
    }

    public void Circulo(int raio){
        this.raio = raio;
    }

    public int getRaio() {
        return raio;
    }

    public void setRaio(int raio) {
        this.raio = raio;
    }


}
