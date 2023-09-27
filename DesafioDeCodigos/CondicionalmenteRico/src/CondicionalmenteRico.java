import java.util.Scanner;

public class CondicionalmenteRico {
  public static void main(String[] args) {

    // Entrada de dados
    Scanner scanner = new Scanner(System.in);
    int saldoTotal = scanner.nextInt();
    int valorSaque = scanner.nextInt();
    scanner.close();

    if (valorSaque > saldoTotal) {
      System.out.println("Saldo insuficiente. Saque nao realizado!");
    } else {
      int saldoAtual = saldoTotal - valorSaque;
      System.out.println("Saque realizado com sucesso. Novo saldo: " + saldoAtual);
    }
  }
}