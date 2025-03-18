package aula05.exercicio1;

import java.util.Scanner;

public class VendaMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Venda venda = new Venda();
        System.out.println("Sistema de vendas e cadastro de produtos!\n");
        int opcaoVenda;
        do {
            System.out.print("Qual o peração deseja fazer?\n 1 - (cadastrar produto)\n 2 - (Realizar venda)\n 3 - (Controle de Estoque)\n ===> ");
            int opcao = sc.nextInt();
            switch (opcao){
                case 1:
                    System.out.println("Digite o nome do produto: ");
                    String nome = sc.next();
                    System.out.println("Digite o cor do produto: ");
                    String cor = sc.next();
                    System.out.println("Digite o valor do produto: ");
                    double valor = sc.nextDouble();
                    System.out.println("Digite o tamanho do produto: ");
                    int quantidade = sc.nextInt();
                    System.out.println("Digite o peso do produto: ");
                    double peso = sc.nextDouble();
                    System.out.println("Digite a quantidade do produto: ");
                    int quantidadeProduto = sc.nextInt();
                    Produto produto = new Produto(nome, cor, valor, quantidade, peso, quantidadeProduto);
                    venda.addProduto(produto);
                    System.out.println("----------------");
                    System.out.println(produto + "\n cadastrado com sucesso!");

                    break;

                case 2:
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
                System.out.println("escolha a opção de venda:\n 1 - (pix)\n 2 - (avista)\n 3 - (transferência)\n 4 - (cartão de crédito)\n ==> ");
                opcao = sc.nextInt();
                switch (opcao){
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
                    break;
                case 3:
                    if (!venda.getProdutos().isEmpty()) {
                        int opcaoControl;
                        do {
                            System.out.println("controle de estoque! 1-remover produto, 2-adiciona mais de um produto: ");
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
                                    System.out.println("Porduto não emcontrado!");
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
                                        else{
                                            return;
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
            System.out.println("deseja outra operação? 1 - sim ou 2 - não");
            opcaoVenda = sc.nextInt();
        }while(opcaoVenda == 1);


        sc.close();
    }
}
