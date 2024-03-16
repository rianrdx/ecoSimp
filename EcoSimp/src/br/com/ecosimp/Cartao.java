package br.com.ecosimp;
import java.io.Serializable;
import java.util.Date;

public class Cartao implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String tipoCartao;
	private double tarifas;
	private Date dataCartao;
	private int cvv;
	private int senhaCartao;
	
	
	public String getTipoCartao() {
		return tipoCartao;
	}
	
	public void setTipoCartao(String tipoCartao) {
		this.tipoCartao = tipoCartao;
	}
	
	public double getTarifas() {
		return tarifas;
	}
	
	public void setTarifas(double tarifas) {
		this.tarifas = tarifas;
	}
	
	public Date getDataCartao() {
		return dataCartao;
	}
	
	public void setDataCartao(Date dataCartao) {
		this.dataCartao = dataCartao;
	}
	
	public int getCvv() {
		return cvv;
	}
	
	public void setCvv(int cvv) {
		this.cvv = cvv;
	}
	
	public int getSenhaCartao() {
		return senhaCartao;
	}
	
	public void setSenhaCartao(int senhaCartao) {
		this.senhaCartao = senhaCartao;
	}
	
	
}
