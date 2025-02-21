package aula02;

import java.util.Scanner;

public class MainExemplo2 {
    public static void main(String[] args) {
        String r;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("digite uma opção de compra->(0 - pc gamer/ 1 - notebook gamer): ");
            int item = sc.nextInt();
            switch (item) {
                case 0:
                    System.out.println("escolheu pc gamer!");
                    break;
                case 1:
                    System.out.println("escolheu notebook gamer!");
                    break;
                default:
                    System.out.println("item inválido!");
            }
            System.out.println("deseja continuar? (y - sim/ N - não)");
            r = sc.next();
        }while (r.equalsIgnoreCase("y"));
    }
}
