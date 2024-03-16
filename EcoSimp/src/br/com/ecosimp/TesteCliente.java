package br.com.ecosimp;

public class TesteCliente {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();

        cliente.setId(2);
        cliente.setNome("jorgin");
        cliente.setEmail("emaildojorgin");
        cliente.setSenha("123");
        cliente.setTelefone(4002);
        cliente.setConta(null);

        System.out.println(cliente.getId());
        System.out.println(cliente.getNome());
        System.out.println(cliente.getEmail());
        System.out.println(cliente.getSenha());
        System.out.println(cliente.getTelefone());
        System.out.println(cliente.getConta());
    }
}
