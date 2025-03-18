package aula05.exercicio2;

import java.util.Scanner;

public class MainPessoa {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();

        Scanner sc = new Scanner(System.in);

        System.out.println("digite seu peso: ");
        p1.setPeso(sc.nextDouble());
        System.out.println("digite seu altura: ");
        p1.setAltura(sc.nextDouble());

        System.out.println("seu icm é: " + p1.calcularImc());
    }
}
