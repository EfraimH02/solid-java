# Trabalho: os princípios SOLID com Java e JUnit

**Disciplina:** Arquitetura e Projeto de Software  
**Curso:** Engenharia de Software — 6º período  
**Aluno:** Efraim Haniel Oliveira Moura  
**Professor:** Henrique Santiago  
**Faculdade:** UNIBRAS — Montes Belos  
**Data:** 16/11/2026

## Introdução

SOLID é um conjunto de cinco princípios da programação orientada a objetos. Eles ajudam a deixar o código organizado e mais fácil de modificar. Neste trabalho, fiz exemplos simples em Java mostrando um jeito que não segue cada princípio e outro jeito melhor.

## 1. S — Responsabilidade Única (SRP)

Uma classe deve ter uma função principal. No arquivo `SRP.java`, a classe `FuncionarioErrado` calcula e imprime o salário. Depois, separei isso em `CalculadoraSalario` e `ImpressoraSalario`. Assim, cada uma tem seu trabalho.

## 2. O — Aberto/Fechado (OCP)

O código deve aceitar novos comportamentos sem precisar ficar mudando o que já funciona. No arquivo `OCP.java`, o exemplo errado usa `if` para descobrir o tipo de cliente. Na versão melhor, usei a interface `Desconto`, com implementações diferentes para cliente VIP e normal.

## 3. L — Substituição de Liskov (LSP)

Uma classe filha precisa cumprir o que a classe base promete. No arquivo `LSP.java`, a conta bloqueada herda um método de saque, mas lança erro quando ele é chamado. Na versão melhor, criei a interface `ContaBancaria` com a operação de depósito, que as duas contas conseguem fazer.

## 4. I — Segregação de Interfaces (ISP)

Uma classe não deve implementar algo que não utiliza. No arquivo `ISP.java`, uma interface obriga o robô a ter o método `comer()`. Na versão melhor, separei as interfaces `Trabalhador` e `Alimentavel`. O robô implementa somente `Trabalhador`.

## 5. D — Inversão de Dependência (DIP)

É melhor depender de interfaces, e não diretamente de classes específicas. No arquivo `DIP.java`, o pedido usa a classe `Email` diretamente. Depois, criei a interface `Notificador`, que é recebida pelo `Pedido` no construtor. Assim, é possível trocar a forma de aviso.

## Testes unitários

Usei o **JUnit 5** para conferir os exemplos refatorados. Há um teste para cada princípio, na pasta `src/test/java/solid`. Os testes conferem valores de salário, desconto, depósito, funcionamento do robô e mensagem de pedido.

## Como executar

É necessário instalar Java 17 ou superior e Maven (o IntelliJ normalmente pode usar a integração Maven).

No terminal da pasta do projeto:

```bash
mvn test
```

Para executar a classe `Main`, abra `src/main/java/solid/Main.java` no IntelliJ e clique na seta verde do método `main`.

## Conclusão

Com esses exemplos, entendi que SOLID ajuda a separar responsabilidades, aproveitar interfaces e evitar alterações desnecessárias. Os exemplos são pequenos, mas mostram como aplicar as ideias em programas Java.

## Referências

MARTIN, Robert C. *Clean Code: A Handbook of Agile Software Craftsmanship*. Prentice Hall, 2008.

MARTIN, Robert C. *Clean Architecture: A Craftsman's Guide to Software Structure and Design*. Prentice Hall, 2017.

SILVA, Maurício Aniche. *Desbravando o SOLID: princípios da programação orientada a objetos*. Casa do Código, 2016. Disponível em: https://www.casadocodigo.com.br/products/livro-desbravando-solid.

Material da disciplina: *Trabalho Prático: Os Princípios SOLID com Java e JUnit*. UNIBRAS, 2026.
