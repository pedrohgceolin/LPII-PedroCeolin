package Atividade8;

class Funcionario {
    String nome = new String();

    String departamento = new String();

    double salario;

    Data dataEntrada;

    String RG = new String();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        System.out.println("Nome armazenado.");
        this.nome = nome;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        System.out.println("Departamento do funcionario armazenado.");
        this.departamento = departamento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        System.out.println("Salario armazenado.");
        this.salario = salario;
    }

    public Data getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(Data dataEntrada) {
        System.out.println("Data de entrada armazenada.");
        this.dataEntrada = dataEntrada;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        System.out.println("RG armazenado.");
        this.RG = RG;
    }

    void recebeAumento (double PercAumento){
        System.out.println("Salario atual: "+ this.salario);
        this.salario = this.salario + this.salario*(PercAumento/100);
        System.out.println("Salario com aumento: " + this.salario);
    }

    double calculaGanhoAnual(){
        return this.salario*12;
    }

    void mostra(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Departamento: " + this.departamento);
        System.out.println("Salario: " + this.salario);
        System.out.println("Data de entrada: " + this.dataEntrada.formatada());
        System.out.println("RG: " + this.RG);
    }
}
