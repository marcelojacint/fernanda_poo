public class Mainq3 {

    public static void main(String[] args) {

        double[] notas = {7.0, 9.5, 10.0};

        double soma = notas[0] + notas[1] + notas[2];

        double media = soma / notas.length;

        if (media >= 7.0) {
            System.out.println("aprovado! média: " + media);
        }else{
            System.out.println("reprovado! media: " + media);
        }

    }
}
