package aula04.questao3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainProduto {
    public static void main(String[] args) {
        List<Produto> produtos = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String opcao;

        do {
            String opcaoProduto;
            System.out.println("Bem vindo ao controle de estoque e vendas\n");
            System.out.print("qual operacão deseja realizar estoque ?:\n 1 -> (Adicionar Produto)\n 2 -> (Vender Produtos)\n 3 -> (Exibir Estoque)\n -> ");
            int opcaoEstoque = sc.nextInt();

            switch (opcaoEstoque) {
                case 1:
                    do {
                        System.out.println("Cadastro de Produtos!\n");
                        System.out.println("Digite o nome do produto: ");
                        String nome = sc.next();
                        System.out.println("Digite o preço do produto:");
                        double preco = sc.nextDouble();
                        System.out.println("Digite a quantidade do produto: ");
                        int quantidade = sc.nextInt();
                        Produto produto = new Produto(nome, preco, quantidade);
                        produtos.add(produto);

                        System.out.print("Deseja cadastrar outro produto -> y/n: ");
                        opcaoProduto = sc.next();
                    }while (opcaoProduto.equalsIgnoreCase("y"));
                    break;
                case 2:
                    String opcaoVenda;
                    do {
                        System.out.println("Nome do produto:");
                        String nomeProduto = sc.next();
                        boolean encontrado = false;

                        for (Produto produto1 : produtos) {
                            if (produto1.getNome().equalsIgnoreCase(nomeProduto)) {
                                encontrado = true;

                                System.out.println("quantos itens serão vendidos?: ");
                                int quantidadeProduto = sc.nextInt();
                                if (produto1.getQuantidade() >= quantidadeProduto) {
                                    produto1.vender(quantidadeProduto);
                                    System.out.println("realizadas " + quantidadeProduto + ", vendas do produto: " + produto1.getNome());
                                }else {
                                    System.out.println("quantidade inválida!");
                                }
                                break;

                            }

                        }
                        if (!encontrado) {
                            System.out.println("produto não encontrado no estoque!");
                        }
                        System.out.println("Deseja vender outro produto? (y/n)");
                        opcaoVenda = sc.next();
                    }while(opcaoVenda.equalsIgnoreCase("y"));
                    break;
                case 3:
                    exibirEstoque(produtos);
            }
            System.out.println("Deseja fazer mais alguma alteração no estoque?: y/n");
            opcao = sc.next();

        }while(opcao.equalsIgnoreCase("y"));



        sc.close();
    }


    public static void exibirEstoque(List<Produto> produtos) {
        for (Produto produto : produtos) {
            System.out.println(produto);
        }
    }
}
