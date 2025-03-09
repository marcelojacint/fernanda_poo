package calculadoraSimples;

public class Calculadora {
    private double num1;
    private double num2;
    private double num3;
    private double num4;

    public double somar() {
        return num1 + num2;
    }

    public double subtrair() {
        return num1 - num2;
    }

    public double multiplicar(double num3, double num4) {
        return num3 * num4;
    }

    public double dividir() {
        return num1 / num2;
    }

    public double getNum3() {
        return num3;
    }

    public void setNum3(double num3) {
        this.num3 = num3;
    }

    public double getNum4() {
        return num4;
    }

    public void setNum4(double num4) {
        this.num4 = num4;
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
}
