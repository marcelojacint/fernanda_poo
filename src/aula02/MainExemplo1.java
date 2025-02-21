package aula02;

import java.util.Locale;
import java.util.Scanner;

public class MainExemplo1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int repetir = 0;
        do {
            System.out.println("digite uma opção->(0 - notebook/1 - pc/2 -macbook): ");
            int x = sc.nextInt();
            System.out.println("deseja continuar?(0 - sim, 1 - não.)");
            repetir = sc.nextInt();
            switch (x) {
                case 0:
                    System.out.println("vc escolheu notebook!");
                    break;
                case 1:
                    System.out.println("vc eccolheu pc!");
                    break;
                case 2:
                    System.out.println("vc escolheu macbook!");
                    break;
                default:
                    System.out.println("escolha invalida!");
            }
        } while (repetir == 0);





        sc.close();

    }
}
