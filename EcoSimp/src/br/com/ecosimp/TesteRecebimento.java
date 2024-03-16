package br.com.ecosimp;

import java.util.Date;

public class TesteRecebimento {
  public static void main(String[] args) {

        Recebimento recebimento = new Recebimento();
        
        recebimento.setId(3);
        recebimento.setConta(null);
        recebimento.setValor(1000);
        recebimento.setData(new Date());
        recebimento.setDescricaoRecebimento("mercado");

        System.out.println("O identificador da sua conta é: " + recebimento.getId());
        System.out.println("O valor do recebimento é:R$ " + recebimento.getValor());
        System.out.println("A data do recebimento é: " + recebimento.getData());
        System.out.println("Descrição gasto: " + recebimento.getDescricaoRecebimento());

    }
}
