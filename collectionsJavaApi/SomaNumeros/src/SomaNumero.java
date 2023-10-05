import java.util.ArrayList;
import java.util.List;

public class SomaNumero {
    List<Integer> listaNumeros;

    public SomaNumero(){
        this.listaNumeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        this.listaNumeros.add(numero);
    }

    public Integer calcularSoma(){
        Integer valorTotal = 0;
        for (Integer number : listaNumeros) {
            valorTotal += number;
        }
        return valorTotal;
    }

    public Integer encontrarMaiorNumero(){
        Integer maiorNumero = 0;
        for (Integer number : listaNumeros) {
            if (number > maiorNumero){
                maiorNumero = number;
            }

        }
        return maiorNumero;
    }

    public Integer encontrarMenorNumero(){
        Integer menorNumero = 0;
        for (Integer number : listaNumeros) {
            if (number < menorNumero){
                menorNumero = number;
            }

        }
        return menorNumero;
    }

    public void exibirNumeros(){
        for (Integer number : listaNumeros) {
            System.out.println(number);
        }
    }
}