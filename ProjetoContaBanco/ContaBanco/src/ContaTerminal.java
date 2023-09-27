import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Por favor, digite o número da Conta !");
        int numero = scanner.nextInt();

        System.out.print("Por favor, digite o número da Agência !");
        String agencia = scanner.nextLine();

        System.out.print("Por favor, digite o Nome do cliente !");
        String nomeCLiente = scanner.nextLine();

        System.out.print("Por favor, digite o Saldo da conta !");
        Float saldo = scanner.nextFloat();

        System.out.println("Olá " + nomeCLiente 
        + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");


        scanner.close();
}
}
