# Desafio: Equilibrando o Saldo Bancário

## Descrição

Para esse desafio, você foi contratado por uma empresa bancária para auxiliar nas implementações e melhorias do sistema empresarial. Em uma análise inicial, foi identificado pela equipe financeira a necessidade de desenvolver uma solução que permita ao cliente equilibrar seu saldo bancário. Dessa forma, o programa deve solicitar uma entrada que representa o saldo atual do funcionário, e após, seja informado o valor de duas transações, sendo elas: um depósito e um saque. O programa deve atualizar o saldo com base nas transações e exibir o saldo final.

**Informação:** As transações de depósito e retirada devem ser tratadas como valores positivos e negativos, respectivamente, para garantir que o cálculo do saldo final seja realizado corretamente.

## Entrada

- `saldoAtual`: um número decimal representando o saldo atual da conta bancária.
- `valorDeposito`: um número decimal representando o valor a ser depositado na conta.
- `valorRetirada`: um número decimal representando o valor a ser retirado da conta.

**Regra de Formatação:** Considere apenas uma casa decimal para esse desafio.

## Saída

Um número decimal que representa o saldo atualizado na conta bancária após o processamento das transações.

---

**Exemplo:**

```
Entrada:
saldoAtual = 1000.0
valorDeposito = 500.5
valorRetirada = 200.3

Saída:
1300.2
```

Neste exemplo, o saldo atual da conta é de 1000.0. Um depósito de 500.5 é feito, aumentando o saldo para 1500.5. Em seguida, um saque de 200.3 é realizado, resultando em um saldo final de 1300.2. A saída é formatada com uma casa decimal, como especificado nas regras.