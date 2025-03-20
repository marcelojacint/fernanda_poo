package aula05.exercicio1;

import java.util.Scanner;

public class VendaMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Venda venda = new Venda();
        System.out.println("\nSistema de vendas - cadastro de produtos e controle de estoque!\n");
        int opcaoVenda;
        do {
            System.out.print("Qual o peração deseja fazer?\n" +
                    " 1 - (cadastrar produto)\n " +
                    "2 - (Realizar venda)\n " +
                    "3 - (Controle de Estoque)\n " +
                    "===> ");
            int opcao = sc.nextInt();
            switch (opcao){
                case 1:
                    cadastrarProduto(sc, venda);
                    break;
                case 2:
                    realizarVenda(sc, venda);
                    break;
                case 3:
                  controlarEstoque(sc, venda);
                    break;
            }
            System.out.print("deseja outra operação? 1-(sim) ou 2-(não)\n ===>");
            opcaoVenda = sc.nextInt();
        }while(opcaoVenda == 1);

        sc.close();
    }
    private static void cadastrarProduto(Scanner sc, Venda venda) {
        System.out.print("Digite o nome do produto: ");
        String nome = sc.next();
        System.out.print("Digite a cor do produto: ");
        String cor = sc.next();
        System.out.print("Digite o valor do produto: ");
        double valor = sc.nextDouble();
        System.out.print("Digite o tamanho do produto: ");
        int tamanho = sc.nextInt();

        System.out.print("Digite o peso do produto: ");
        double peso = sc.nextDouble();
        System.out.print("Digite a quantidade em estoque: ");
        int quantidade = sc.nextInt();
        sc.nextLine();

        Produto produto = new Produto(nome, cor, valor, tamanho, peso, quantidade);
        venda.addProduto(produto);
        System.out.println("\nProduto cadastrado com sucesso: " + produto);
    }

    public static void realizarVenda(Scanner sc, Venda venda) {
        if (!venda.getProdutos().isEmpty()) {
            System.out.println("Digite o nome do produto para a venda: ");
            String produtoNome = sc.next();
            System.out.println("Digite a quantidade a ser vendido: ");
            int quantidadeVenda = sc.nextInt();

            for (Produto auxProduto : venda.getProdutos()) {
                if (produtoNome.equals(auxProduto.getNome())) {
                    System.out.println("produto: " + auxProduto);
                    auxProduto.RemoverQuantidadeEstoque(quantidadeVenda);
                    System.out.println("quantidade: " + quantidadeVenda);
                }else {
                    System.out.println("produto não encontrado!");
                }

            }
            int continuar;
            System.out.print("escolha a opção de venda:\n 1 - (pix)\n 2 - (avista)\n 3 - (transferência)\n 4 - (cartão de crédito)\n ==> ");
            int opcaoVenda = sc.nextInt();
            switch (opcaoVenda){
                case 1:
                    venda.pagarPix();
                    break;
                case 2:
                    System.out.println("valor pago: ");
                    double valorDinheiro = sc.nextDouble();
                    venda.pagarDinheiro(valorDinheiro);
                    break;
                case 3:
                    venda.pagarTransfer();
                    break;
                case 4:
                    venda.pagarCredito();
            }
        }
        else {
            System.out.println("Não existem produtos cadastrados!");
        }
    }
    private static void controlarEstoque(Scanner sc, Venda venda) {
        if (!venda.getProdutos().isEmpty()) {
            int opcaoControl;
            do {
                System.out.print("controle de estoque!\n 1-(remover produto existente)\n 2-(adicionar mais a um produto)\n 3-(subtrair de um produto existente)\n ===> ");
                int opcaoEstoque = sc.nextInt();
                if (opcaoEstoque == 1) {
                    System.out.println("Digite o nome do produto para remoção: ");
                    String nomeRemocao = sc.next();
                    if(venda.removerProduto(nomeRemocao)) {
                        System.out.println("removido com sucesso!");
                    }
                    else {
                        System.out.println("produto não encontrado!");
                    }
                }
                else if (opcaoEstoque == 2) {
                    System.out.println("Digite o nome do produto para adicionar: ");
                    String nomeAdicao = sc.next();
                    System.out.println("Digite a quantidade a ser adicionado: ");
                    int quantidadeAdicao = sc.nextInt();
                    if(venda.adicionarQuantidadeProdutoExistente(nomeAdicao, quantidadeAdicao)) {
                        for (Produto auxProduto : venda.getProdutos()) {
                            if (auxProduto.getNome().equalsIgnoreCase(nomeAdicao)) {
                                System.out.printf("adicionado: %d, no produto: %s, total do estoque atual: %d!\n",
                                        quantidadeAdicao, auxProduto.getNome(), auxProduto.getQuantidadeEstoque());
                            }
                            else{
                                return;
                            }
                        }
                    }
                    else {
                        System.out.println("Porduto não encontrado!");
                    }
                }

                else if (opcaoEstoque == 3) {
                    System.out.println("Digite o nome do produto para diminuir a quantidade: ");
                    String nomeAdicao = sc.next();
                    System.out.println("Digite a quantidade a ser diminuido: ");
                    int quantidadeSubtracao = sc.nextInt();
                    if(venda.diminuirQuantidadeProdutoExistente(nomeAdicao, quantidadeSubtracao)) {
                        for (Produto auxProduto : venda.getProdutos()) {
                            if (auxProduto.getNome().equalsIgnoreCase(nomeAdicao)) {
                                System.out.printf("Diminuido: %d, no produto: %s, total do estoque atual: %d!\n",
                                        quantidadeSubtracao, auxProduto.getNome(), auxProduto.getQuantidadeEstoque());
                            }
                        }
                    }
                    else {
                        System.out.println("Porduto não emcontrado!");
                    }

                }


                System.out.println("deseja fazer outra operação: 1-sim, 2-não");
                opcaoControl = sc.nextInt();
            } while (opcaoControl == 1);
        }else {
            System.out.println("remoção inválida!");
        }
    }
}
