package aula05.exercicio1;

public class Produto {

    private int codigo;
    private String nome;
    private String cor;
    private double valor;
    private int tamanho;
    private double peso;
    private int quantidadeEstoque;

    public Produto() {
    }

    public Produto(String nome, String cor, double valor, int tamanho, double peso, int quantidadeEstoque) {
        this.codigo ++;
        this.nome = nome;
        this.cor = cor;
        this.valor = valor;
        this.tamanho = tamanho;
        this.peso = peso;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public void AdicionarQuantidadeEstoque(int quantidade) {
        this.quantidadeEstoque += quantidade;
    }

    public void RemoverQuantidadeEstoque(int quantidade) {
        this.quantidadeEstoque -= quantidade;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "codigo=" + codigo +
                ", nome='" + nome + '\'' +
                ", cor='" + cor + '\'' +
                ", valor=" + valor +
                ", tamanho=" + tamanho +
                ", peso=" + peso +
                ", quantidadeEstoque=" + quantidadeEstoque +
                '}';
    }
}
