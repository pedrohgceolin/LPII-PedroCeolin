package Atividade12;

public class HorarioDaCompra extends Pedido{
    public String dia;
    public int hora;
    public int minuto;

    public String getDia(){
        return dia;
    }
    public int getHora(){
        return hora;
    }
    public int getMinuto(){
        return minuto;
    }
    public void setDia(String dia){
        this.dia=dia;
    }
    public void setHora(int hora){
        this.hora=hora;
    }
    public void setMinuto(int minuto){
        this.minuto=minuto;
    }

    public HorarioDaCompra(String dia, int hora, int minuto){
        this.dia=dia;
        this.hora=hora;
        this.minuto=minuto;
    }

    @Override
    public String toString(){
        return "\n Dia: " + dia + "\nHora: " + hora + "\nMinuto: " + minuto;
    }
}
