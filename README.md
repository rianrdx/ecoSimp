# EcoSimp

## Descrição

O EcoSimp é um projeto Java desenvolvido para simular as operações básicas de uma fintech com foco em práticas sustentáveis. Este projeto inclui classes que representam diferentes elementos de uma aplicação financeira, como contas bancárias, transações e clientes, bem como cartões de crédito e débito. Além disso, são fornecidos testes unitários para garantir a funcionalidade correta das classes.

## Funcionalidades Principais

- **Conta:** Uma classe que representa uma conta bancária.
- **Cliente:** Uma classe que define um cliente da fintech, com informações pessoais do cliente.
- **Cartao:** Uma classe abstrata que define a estrutura básica de um cartão, contendo informações como número do cartão e titular.
- **CartaoCredito:** Uma subclasse de Cartao que representa um cartão de crédito, incluindo limites de crédito e saldo.
- **CartaoDebito:** Uma subclasse de Cartao que representa um cartão de débito, ligado diretamente à conta bancária do cliente.
- **Gasto:** Uma classe que modela um gasto realizado, registrando o valor, data e informações do gasto.
- **Recebimento:** Uma classe que modela um recebimento realizado, registrando o valor, data e informações do recebimento.

## Como Utilizar

1. Clone o repositório para o seu ambiente de desenvolvimento:

   ```
   git clone https://github.com/rianrdx/ecoSimp.git
   ```

2. Abra o projeto em sua IDE Java preferida.

3. Explore as diferentes classes disponíveis na estrutura do projeto.

4. Execute os testes unitários para garantir a integridade do código. Os testes estão localizados no diretório `src/` e podem ser executados individualmente ou em conjunto.

## Autores

- Desenvolvido por [Ana Eliza Gonçalves](https://github.com/Neliza96)
- Desenvolvido por [Carolina Poluboiarinov](https://github.com/carolpoluba)
- Desenvolvido por [Lucas Azevedo](https://github.com/LucasAzevedoS)
- Desenvolvido por [Maria Eduarda Ciarini](https://github.com/MariaEduarda-Ciarini)
- Desenvolvido por [Rian Guedes](https://github.com/rianrdx)

## Licença

Este projeto está licenciado sob a [Licença MIT](LICENSE).
