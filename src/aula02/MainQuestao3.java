package aula02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainQuestao3 {
    public static void main(String[] args) {
        String pare;
        List<Double> notas = new ArrayList<>();
        double soma = 0;
        double media = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Bem-vindo ao calculador de média do aluno!");

        do {
            System.out.print("Digite uma nota do aluno: ");
            double nota = sc.nextDouble();
            notas.add(nota);
            System.out.print("Deseja inserir outra nota? (Digite 'N' para Sim ou 'N' para Não): ");
            pare = sc.next();
        } while (pare.equalsIgnoreCase("s"));

        for (double nota : notas) {
            soma += nota;
        }

        media = soma / notas.size();
        System.out.printf("Media das notas: %.2f%n", media);
        System.out.println();
        System.out.println("Obrigado por usar o programa!");


        sc.close();
    }
}
