package br.com.ecosimp;

import java.util.Date;

public class TesteCartaoDebito {
	public static void main(String[] args) {
		 
		 CartaoDebito cartaoDebito = new CartaoDebito();
		 
		 cartaoDebito.setNroCartao(321);
		 cartaoDebito.setDataVencimento(new Date());
		 
		 cartaoDebito.setTipoCartao("Débito");
		 cartaoDebito.setTarifas(17.5);
		 cartaoDebito.setDataCartao(new Date());
		 cartaoDebito.setCvv(643);
		 cartaoDebito.setSenhaCartao(128988);
		 
		 
		 System.out.println("Número do cartão: " + cartaoDebito.getNroCartao());
		 System.out.println("Data de Vencimento do Cartão: " + cartaoDebito.getDataVencimento());
		 
	     System.out.println("Tipo do Cartão: " + cartaoDebito.getTipoCartao());
	     System.out.println("Tarifas: " + cartaoDebito.getTarifas());
	     System.out.println("Data do Cartão: " + cartaoDebito.getDataCartao());
	     System.out.println("CVV: " + cartaoDebito.getCvv());
	     System.out.println("Senha do Cartão: " + cartaoDebito.getSenhaCartao());
	 }
}
