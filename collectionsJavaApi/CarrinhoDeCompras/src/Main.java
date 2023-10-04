
public class Main {
    public static void main(String[] args) {
        CarrinhoDeCompra carrinhoDeCompra = new CarrinhoDeCompra();

        carrinhoDeCompra.adicionarItem("Laranja", 4.99F, 5);
        carrinhoDeCompra.adicionarItem("Cebola", 1.99F, 3);
        carrinhoDeCompra.adicionarItem("Picanha", 25.45F, 29);
        carrinhoDeCompra.adicionarItem("Lasanha", 10F, 2);

        carrinhoDeCompra.exibirItens();

        carrinhoDeCompra.removerItem("Lasanha");

        System.out.println("-----------------------");

        carrinhoDeCompra.exibirItens();

        System.out.println("O valor total do seu carrinho é R$ " + carrinhoDeCompra.calcularValorTotal());



    }
}
