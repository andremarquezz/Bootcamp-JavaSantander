import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    private final List<Integer> numberList;

    public OrdenacaoNumeros() {
        this.numberList = new ArrayList<>();
    }

    public List<Integer> ordenarAscendente() {
        List<Integer> ordenacaoAscendente = new ArrayList<>(numberList);
        if(!ordenacaoAscendente.isEmpty()){
            Collections.sort(ordenacaoAscendente);
            return ordenacaoAscendente;
        }else{
            throw new RuntimeException("A lista está vazia!");
        }

    }

    public List<Integer> ordenarDescendente() {
        List<Integer> numerosDescendente = new ArrayList<>(this.numberList);
        if (!numberList.isEmpty()) {
            numerosDescendente.sort(Collections.reverseOrder());
            return numerosDescendente;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public void exibirNumeros() {
        if (!numberList.isEmpty()) {
            System.out.println(this.numberList);
        } else {
            System.out.println("A lista está vazia!");
        }
    }

    public void adicionarNumero(int numero){
        this.numberList.add(numero);
    }

}
