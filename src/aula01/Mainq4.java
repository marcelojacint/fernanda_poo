package aula01;

public class Mainq4 {
    public static void main(String[] args) {

    double salario = 900.00;

    if (salario <= 900.00) {
        System.out.println("insento!");

    } else if (salario >= 901.00 && salario <= 1500.00) {
        System.out.println("desconto de 5%!");

    } else if (salario >= 1501.00 && salario <= 2500.00) {
        System.out.println("desconto de 10%!");

    }else {
        System.out.println("desconto de 20%!");
    }


    }
}
