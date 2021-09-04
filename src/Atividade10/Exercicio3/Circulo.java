package Atividade10.Exercicio3;

public class Circulo extends FormaBidimensional{
    public int raio;
    public int area;

    public Circulo(char preenchimento) {
        super(preenchimento);
    }

    public Circulo(char preenchimento, int raio){
        super(preenchimento);
        this.raio = raio;
    }

    public int getRaio() {
        return raio;
    }

    public void setRaio(int raio) {
        this.raio = raio;
    }

    public int getArea(){
            area = (int) (3.14*((Circulo) this).raio);
        return (int) area;
    }

    public void desenhar(){
        System.out.println("\n  "+this.c+this.c+"\n"+this.c+this.c+this.c+this.c+this.c+"\n  "+this.c+this.c);
    }
    

}
