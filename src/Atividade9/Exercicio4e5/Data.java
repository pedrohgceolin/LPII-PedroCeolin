package Atividade9.Exercicio4e5;

class Data {
    int dia;
    int mes;
    int ano;

    public String formatada(){
        return dia + "/" + mes + "/" + ano;
    }

    Data(){
    }

    Data(int d, int m, int a){
        this.inicializaDataSimples(d,m,a);
    }

    void inicializaDataSimples(int d, int m, int a){
        if(this.dataEhValida(d,m,a) == true){
            this.dia = d;
            this.mes = m;
            this.ano = a;
        }else{
            this.dia = 0;
            this.mes = 0;
            this.ano = 0;
        }
    }

    boolean dataEhValida(int d, int m, int a){
        if(d >= 1 && d<=31 && m>=1 && m <= 12){
            return true;
        }else {
            return false;
        }
    }
}
