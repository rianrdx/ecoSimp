package br.com.ecosimp;

import java.util.Date;

public class TesteCartao {
	 public static void main(String[] args) {
		 
		 Cartao cartao = new Cartao();
		 
		 cartao.setTipoCartao("Credito");
		 cartao.setTarifas(13.5);
		 cartao.setDataCartao(new Date());
		 cartao.setCvv(643);
		 cartao.setSenhaCartao(128988);
		 
	     System.out.println("Tipo do Cartão: " + cartao.getTipoCartao());
	     System.out.println("Tarifas: " + cartao.getTarifas());
	     System.out.println("Data do Cartão: " + cartao.getDataCartao());
	     System.out.println("CVV: " + cartao.getCvv());
	     System.out.println("Senha do Cartão: " + cartao.getSenhaCartao());
	 }
}
