package aula04.questao4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainTransacao {

    public static void main(String[] args) {
        List<Cliente> clientes = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        ContaBancaria conta = new ContaBancaria();

        String opcao;
        int opcaobanco;
        do {

        System.out.println("Bem vindo ao Banco 'FAZ O L'! \n");
        System.out.print("Qual operação que deseja fazer? \n 1 - (Cadastro)\n 2 - (Consultar saldo)\n 3 - (Depositar)\n 4 - (Transferir)\n 5 - (Sacar)\n -> ");
        opcaobanco = sc.nextInt();
        switch (opcaobanco) {
            case 1:
                System.out.println("Cadastro de cliente!\n");
                System.out.println("Digite o nome do cliente: ");
                String nome = sc.next();
                System.out.println("Digite o cpf do cliente: ");
                String cpf = sc.next();
                Cliente cliente = new Cliente(nome, cpf);
                clientes.add(cliente);
                conta.setCliente(cliente);
                break;
            case 2:
                System.out.println(conta.consultarSaldo());
                break;
            case 3:
                System.out.println("Valor a ser depositado: ");
                double valor = sc.nextDouble();
                conta.depositar(valor);
                break;
            case 4:
                System.out.println("Valor a ser transferido: ");
                double valorTranferencia = sc.nextDouble();
                conta.transferir(valorTranferencia);
                break;
            case 5:
                System.out.println("valor a ser sacado: ");
                double valorSaque = sc.nextDouble();
                conta.sacar(valorSaque);
            default:
                System.out.println("nenhuma opção encontrada!");
                break;
        }
            System.out.print("Deseja realizar outra operação -> (y/n): ");
            opcao = sc.next();
        }while(opcao.equalsIgnoreCase("y"));

        sc.close();
    }
}
