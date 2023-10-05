public class Main {
    public static void main(String[] args) {
        SomaNumero somaNumero = new SomaNumero();

        somaNumero.adicionarNumero(5);
        somaNumero.adicionarNumero(8);
        somaNumero.adicionarNumero(3);
        somaNumero.adicionarNumero(9);

        somaNumero.exibirNumeros();

        Integer maiorNumero = somaNumero.encontrarMaiorNumero();
        System.out.println(maiorNumero);

        Integer menorNumero = somaNumero.encontrarMenorNumero();
        System.out.println(menorNumero);

        Integer valorTotal = somaNumero.calcularSoma();
        System.out.println(valorTotal);

    }
}