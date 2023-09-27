import java.text.DecimalFormat;
import java.util.Scanner;

public class BancoApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double valorInicial = scanner.nextDouble();

        double taxaJuros = scanner.nextDouble();

        int periodo = scanner.nextInt();
        scanner.close();

        double juros = 1 + taxaJuros;
        double jurosEmAnos = Math.pow(juros, periodo); // juros^periodo
        double valorFinal = valorInicial * jurosEmAnos;

        DecimalFormat df = new DecimalFormat("###0.00");
        System.out.println("Valor final do investimento: R$ " + df.format(valorFinal));

    }
}