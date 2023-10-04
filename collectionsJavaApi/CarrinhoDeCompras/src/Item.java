public class Item {
    String nome;
    float preco;
    int quantidade;

    public Item(String nome, float preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public float getPreco() {
        return preco;
    }

    public String getNome() {
        return nome;
    }
}
