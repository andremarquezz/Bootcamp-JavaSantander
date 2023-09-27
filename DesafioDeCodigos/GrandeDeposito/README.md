# Desafio: Realização de Depósitos Bancários

## Descrição

Você foi contratado por um banco para desenvolver um programa que auxilie seus clientes a realizar depósitos em suas contas. O programa deve solicitar ao cliente o valor do depósito e verificar se o valor é válido. Se o valor for maior do que zero, o programa deve adicionar o valor ao saldo da conta. Caso contrário, o programa deve exibir uma mensagem de erro. O programa deve solicitar apenas uma vez o valor de depósito.

## Entrada

O programa deve utilizar o Scanner para receber o valor de depósito digitado pelo cliente. O valor pode ser decimal, representando valor em reais.

## Saída

O programa deve exibir uma mensagem de sucesso quando um valor de depósito válido for informado e o saldo da conta for atualizado. Se o valor for "0", deverá imprimir uma mensagem encerrando o programa. Caso um valor inválido seja digitado, o programa deve exibir uma mensagem de erro solicitando um novo valor.

---

**Exemplo de Execução:**

```
Por favor, insira o valor do depósito (ou 0 para encerrar): 100.50
Depósito realizado com sucesso! Novo saldo: R$ 100.50

Por favor, insira o valor do depósito (ou 0 para encerrar): -50
Valor inválido. Por favor, insira um valor maior que zero.

Por favor, insira o valor do depósito (ou 0 para encerrar): 0
Encerrando o programa. Obrigado!
```

Neste exemplo, o programa solicita ao cliente que insira o valor do depósito. O cliente faz um depósito válido de R$ 100.50, e o programa exibe uma mensagem de sucesso com o novo saldo. Em seguida, o cliente tenta fazer um depósito inválido de -50, e o programa exibe uma mensagem de erro. Finalmente, o cliente encerra o programa digitando 0, e o programa exibe uma mensagem de encerramento.