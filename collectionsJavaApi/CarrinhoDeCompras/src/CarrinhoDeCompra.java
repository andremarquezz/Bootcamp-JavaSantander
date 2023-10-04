import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompra {
    List<Item> carrinhoDeCompras;

    CarrinhoDeCompra() {
        this.carrinhoDeCompras = new ArrayList<>();
    }

    public void adicionarItem(String nome, float preco, int quantidade){
        carrinhoDeCompras.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome){
        carrinhoDeCompras.removeIf(i -> i.getNome().equalsIgnoreCase(nome));
    }

    public float calcularValorTotal(){
        float valorTotal = 0;
        for (Item i :
                carrinhoDeCompras) {
                valorTotal += i.getPreco();
        }
        return valorTotal;
    }

    public void exibirItens(){
        for (Item i :
                carrinhoDeCompras) {
            System.out.println("O nome do item é " + i.getNome()
                    + " o valor deste item é R$ " + i.getPreco()
                    + " e a quantidade que você possui é " + i.getQuantidade());
        }
    }
}
