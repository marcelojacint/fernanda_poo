package aula02;

import java.util.Scanner;

public class MainQuestao2 {
    public static void main(String[] args) {
        String pare;
        double salarioLiquido;
        double deducao = 0.15;

        Scanner sc = new Scanner(System.in);
        Scanner espaco = new Scanner(System.in);

        System.out.println("Digite sua matricula: ");
        long matricula = sc.nextLong();
        System.out.println("Digite seu nome: ");
        String nome = espaco.nextLine();
        System.out.println("Digite seu salário: ");
        double salario = espaco.nextDouble();
        salarioLiquido = salario - (salario * deducao);

        System.out.println("• Matricula: " + matricula);
        System.out.println("• Nome Completo: " + nome);
        System.out.println("• Salário Bruto: " + salario);
        System.out.println("• Dedução do INSS: " + deducao);
        System.out.println("• Salário Líquido: " + salarioLiquido);
        sc.close();
        espaco.close();
    }
}
