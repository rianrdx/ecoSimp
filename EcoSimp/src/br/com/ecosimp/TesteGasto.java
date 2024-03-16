package br.com.ecosimp;

import java.util.Date;

public class TesteGasto {
   public static void main(String[] args) {

        Gasto gasto = new Gasto();

        gasto.setId(3);
        gasto.setConta(null);
        gasto.setValor(1000);
        gasto.setData(new Date());
        gasto.setDescricaoGasto("mercado");

        
        System.out.println("O identificador da sua conta é: " + gasto.getId());
        System.out.println("O valor do recebimento é:R$ " + gasto.getValor());
        System.out.println("A data do recebimento é: " + gasto.getData());
        System.out.println("Descrição gasto: " + gasto.getDescricaoGasto());

    }

}
