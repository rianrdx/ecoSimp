package br.com.ecosimp;
import java.util.Date;
public class Recebimento {
    private int id;
    private Conta conta;
    private double valor;
    private String descricaoRecebimento;
    public String getDescricaoRecebimento() {
        return descricaoRecebimento;
    }
    public void setDescricaoRecebimento(String descricaoRecebimento) {
        this.descricaoRecebimento = descricaoRecebimento;
    }
    private Date data;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public Conta getConta() {
        return conta;
    }
    public void setConta(Conta conta) {
        this.conta = conta;
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
    public Date getData() {
        return data;
    }
    public void setData(Date data) {
        this.data = data;
    }

}