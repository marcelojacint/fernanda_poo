package aula02;

import java.util.Locale;
import java.util.Scanner;

public class MainAula02 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);

        System.out.println("Digite um nome: ");
        String nome = sc1.nextLine();

        System.out.println("digite altura: ");
        double altura = sc.nextDouble();

        System.out.println("Digite seu salário: ");
        double salario = sc.nextDouble();

        System.out.println("Digite sua idade: ");
        int idade = sc1.nextInt();
        sc.nextLine();

        sc.close();

        System.out.println("Seu nome é " + nome + " sua altura: " + altura
                + " seu salário: " + salario + " sua idade: " + idade);
    }
}
