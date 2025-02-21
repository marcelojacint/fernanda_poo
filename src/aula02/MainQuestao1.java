package aula02;

import java.util.Scanner;

public class MainQuestao1 {
    public static void main(String[] args) {
        String pare;
        Scanner sc = new Scanner(System.in);
        Scanner espaco = new Scanner(System.in);

        do {
            System.out.println("Digite sua idade: ");
            int idade = sc.nextInt();
            if (idade < 18) {
                System.out.println("Menor de idade, não pode prosseguir!");
                break;
            }
            System.out.println("Digite seu nome: ");
            String nome = espaco.nextLine();
            System.out.println("seu nome é: " + nome + " e sua idade é: " + idade);

            System.out.println("deseja continuar->(s - sim/ n- não): ");
            pare = espaco.nextLine();
        } while (pare.equalsIgnoreCase("s"));

        sc.close();
    }
}
