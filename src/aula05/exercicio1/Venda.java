package aula05.exercicio1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Venda implements Pagamento {

    private int quantidadeVenda;
    private double totalVenda;

   private final List<Produto> produtos;

   public Venda() {
       this.quantidadeVenda = 1;
       this.produtos = new ArrayList<Produto>();
       this.totalVenda = 0;
   }

    @Override
    public double pagarPix() {
      return totalVenda - (totalVenda * 0.05);
    }

    @Override
    public void pagarDinheiro(double valor) {
      double total = totalVenda - (totalVenda * 0.05);
      if (valor > total) {
          double troco = valor - total;
          System.out.println("seu troco é: " + troco);
      }else {
          System.out.println("total pago: " + total);
      }

    }

    @Override
    public double pagarTransfer() {
        return totalVenda - (totalVenda * 0.05);
    }

    @Override
    public void pagarCredito() {
       int parcela = 3;
       double parcelaCredito = totalVenda /  parcela;
       double[] parcelas= new double[parcela];
        Arrays.fill(parcelas, parcelaCredito);
        for (double parc : parcelas) {
            System.out.printf("Pagamento parcelas " + " 1 " + "x de : R$ %.2f\n", parc);
        }

    }

    public boolean removerProduto(String nome) {
       for (Produto produto : produtos) {
           if (produto.getNome().equalsIgnoreCase(nome)) {
               this.produtos.remove(produto);
               return true;
           }

       }
        return false;
    }

    public boolean adicionarQuantidadeProdutoExistente(String nome, int adiciona) {
       for (Produto produto : produtos) {
           if (produto.getNome().equalsIgnoreCase(nome)) {
               produto.AdicionarQuantidadeEstoque(adiciona);
               return true;
           }

       }
        return false;
    }

    public boolean diminuirQuantidadeProdutoExistente(String nome, int subtracao) {
        for (Produto produto : produtos) {
            if (produto.getNome().equalsIgnoreCase(nome)) {
                produto.RemoverQuantidadeEstoque(subtracao);
                return true;
            }

        }
        return false;
    }

    private Produto buscarProduto(){
       Produto auxProduto  = null;
       for (Produto produto : produtos){
           auxProduto = produto;
       }
       return auxProduto;
    }


    private void calcularTotalVenda(){
       if (buscarProduto() != null) {
           totalVenda = quantidadeVenda * buscarProduto().getValor();
       }else{
           totalVenda = 0;
       }

    }

    public int getQuantidadeVenda() {
        return quantidadeVenda;
    }

    public void setQuantidadeVenda(int quantidadeVenda) {
        this.quantidadeVenda = quantidadeVenda;
    }

    public double getTotalVenda() {
        return totalVenda;
    }

    public void setTotalVenda(double totalVenda) {
        this.totalVenda = totalVenda;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void addProduto(Produto produto) {
        this.produtos.add(produto);
        this.calcularTotalVenda();
    }
}
