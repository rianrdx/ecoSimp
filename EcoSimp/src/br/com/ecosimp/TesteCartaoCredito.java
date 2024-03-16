package br.com.ecosimp;

import java.util.Date;

public class TesteCartaoCredito {
	public static void main(String[] args) {
		 
		 CartaoCredito cartaoCredito = new CartaoCredito();
		 
		 cartaoCredito.setNroCartao(876);
		 cartaoCredito.setDataVencimento(new Date());
		 
		 cartaoCredito.setTipoCartao("Credito");
		 cartaoCredito.setTarifas(10.5);
		 cartaoCredito.setDataCartao(new Date());
		 cartaoCredito.setCvv(623);
		 cartaoCredito.setSenhaCartao(12988);
		 
		 
		 System.out.println("Número do cartão: " + cartaoCredito.getNroCartao());
		 System.out.println("Data de Vencimento do Cartão: " + cartaoCredito.getDataVencimento());
		 
	     System.out.println("Tipo do Cartão: " + cartaoCredito.getTipoCartao());
	     System.out.println("Tarifas: " + cartaoCredito.getTarifas());
	     System.out.println("Data do Cartão: " + cartaoCredito.getDataCartao());
	     System.out.println("CVV: " + cartaoCredito.getCvv());
	     System.out.println("Senha do Cartão: " + cartaoCredito.getSenhaCartao());
	 }
}
