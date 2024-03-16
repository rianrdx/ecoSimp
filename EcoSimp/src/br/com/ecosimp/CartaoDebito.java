package br.com.ecosimp;

import java.util.Date;

public class CartaoDebito extends Cartao {
	private static final long serialVersionUID = 1L;
	
	private int nroCartao;
	private Date dataVencimento;
	 
	 
	public int getNroCartao() {
		return nroCartao;
	}
	public void setNroCartao(int nroCartao) {
		this.nroCartao = nroCartao;
	}
	public Date getDataVencimento() {
		return dataVencimento;
	}
	public void setDataVencimento(Date dataVencimento) {
		this.dataVencimento = dataVencimento;
	}
	 
	 
}
