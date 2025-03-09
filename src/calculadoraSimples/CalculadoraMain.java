package calculadoraSimples;

import java.util.Scanner;

public class CalculadoraMain {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        double n1= 2;
        double n2= 2;

        System.out.println("Calculadora simples! ");

        System.out.println("digite o primeiro numero: ");
        calculadora.setNum1(sc.nextInt());
        System.out.println("digite o segundo numero: ");
        calculadora.setNum2(sc.nextInt());

        System.out.println("qual operação: so -> (soma), su (subtração), mu -> (multiplicação), di -> (divisão)");
        String calcula = sc1.nextLine();

        switch (calcula) {
            case "so":
                System.out.println("soma: " + calculadora.somar());
                break;
            case "su":
                System.out.println("subtração: " + calculadora.subtrair());
                break;
            case "mu":
                System.out.println("multiplicação: " + calculadora.multiplicar(n1, n2));
                break;
            case "di":
                System.out.println("divisão: " + calculadora.dividir());
                break;
            default:
                System.out.println("obrigado!");
        }

        sc.close();

    }
}
