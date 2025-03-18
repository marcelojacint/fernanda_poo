package aula05.exercicio2;

public class Pessoa {
    private double peso;
    private double altura;

    public double calcularImc() {
        return (altura * altura) / peso;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
