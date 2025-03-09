package aula04.questao3;

public class Produto {

    private String nome;
    private double preco;
    private int quantidade;

    public Produto() {
    }

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public int adicionarEstoque(int quantidade){

        return  this.quantidade += quantidade;
    }

    public int vender(int quantidade){

        return  this.quantidade -= quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return String.format(
                "Produto:\n" +
                        "Nome: %s\n" +
                        "Preço: %.2f\n" +
                        "Quantidade: %d Und\n" +
                        "------------------\n",
                nome, preco, quantidade
        );
    }
}
