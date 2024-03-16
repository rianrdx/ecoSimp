package br.com.ecosimp;

public class TesteConta {

    public static void main(String[] args) {
    	Conta conta = new Conta(10, 100, null, 0, null);

        System.out.println("ID da conta: " + conta.getId());
        System.out.println("Saldo da conta: " + conta.getSaldo());

    }
}

