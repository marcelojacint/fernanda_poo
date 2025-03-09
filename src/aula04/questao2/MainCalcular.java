package aula04.questao2;

import java.util.Scanner;

public class MainCalcular {
    public static void main(String[] args) {
        Matematica mat = new Matematica();
        Scanner sc = new Scanner(System.in);

        String continua;

        System.out.println("Calculadora simples!\n");

        do {
            int operacao;
            System.out.print("Digite o primeiro valor: ");
            mat.setNum1(sc.nextInt());
            System.out.print("Digite o segundo valor: ");
            mat.setNum2(sc.nextInt());

            System.out.print("qual operação deseja calcular?:\n 1 - (soma)\n 2 - (subtracao)\n 3 - (multiplicacao)\n 4 - (divisao))\n -> ");
            operacao = sc.nextInt();

            switch (operacao) {
                case 1:
                    System.out.println("Resultado = " + mat.soma());
                    break;
                case 2:
                    System.out.println("Resultado = " + mat.subtracao());
                    break;
                case 3:
                    System.out.println("Resultado = " + mat.multiplicacao());
                    break;
                case 4:
                    System.out.println("Resultado = " + mat.divisao());
                    break;
                default:
                    System.out.println("esolha uma opção válida!");
                    break;
            }
            System.out.print("Deseja realizar mais operações? : y/n");
            continua = sc.next();
        }while (continua.equalsIgnoreCase("y"));

        System.out.println("Obrigado por usar a programa!");

        sc.close();

    }
}
