package aula03;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();

        Scanner sc = new Scanner(System.in);
        Scanner scNextLine = new Scanner(System.in);

        System.out.println("Digite o nome do aluno: ");
        p1.setNome(scNextLine.nextLine());

        System.out.println("Digite a idade do aluno: ");
        p1.setIdade(sc.nextInt());

        System.out.println("Digite o nome do altura: ");
        p1.setAltura(sc.nextDouble());

        System.out.println(p1);

        sc.close();

    }
}
