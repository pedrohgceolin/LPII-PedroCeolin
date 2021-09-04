package Atividade12;

public class ItensProduto{
    public int codigo;
    public String descricao;
    public String setor;
    public double valorUnitario;
    public double percentualDesconto;
    public int quantidade;

    public int getCodigo(){
        return codigo;
    }
    public String getDescricao(){
        return descricao;
    }
    public String getSetor(){
        return setor;
    }
    public double getValorUnitario(){
        return valorUnitario;
    }
    public double getPercentualDesconto(){
        return percentualDesconto;
    }
    public int getQuantidade(){
        return quantidade;
    }
    public void setCodigo(int codigo){
        this.codigo=codigo;
    }
    public void setDescricao(String descricao){
        this.descricao=descricao;
    }
    public void setSetor(String setor){
        this.setor=setor;
    }
    public void setValorUnitario(double valorUnitario){
        this.valorUnitario=valorUnitario;
    }
    public void setPercentualDesconto(double percentualDesconto){
        this.percentualDesconto=percentualDesconto;
    }
    public void setQuantidade(int quantidade){
        this.quantidade=quantidade;
    }

    public ItensProduto(int codigo,String descricao,String setor,double valorUnitario,double percentualDesconto,int quantidade){
        this.codigo=codigo;
        this.descricao=descricao;
        this.setor=setor;
        this.valorUnitario=valorUnitario;
        this.percentualDesconto=percentualDesconto;
        this.quantidade=quantidade;
    }

    @Override
    public  String  toString () {

        return "" + descricao+"       " +
                "R$ "+valorUnitario
                +"       "+(percentualDesconto*100) +"            "+quantidade+"           R$ "+
                (quantidade*valorUnitario*(1-percentualDesconto)) + "\n";
    }
}
