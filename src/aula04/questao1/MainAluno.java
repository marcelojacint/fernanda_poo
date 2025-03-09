package aula04.questao1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainAluno {
    public static void main(String[] args) {
        List<Aluno> notasAlunos = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
       int opcao;

        System.out.println("Calcular Média do Aluno!");

        do {
            Aluno aluno = new Aluno();

            System.out.println("Digite o nome do aluno: ");
            aluno.setNome(sc.nextLine());
            for (int i = 1; i <= 3; i++) {
                double nota;
                System.out.println("Digite a : " + i + "º do Aluno: ");
                nota = sc.nextDouble();
                if (nota > 0 && nota <= 10) {
                    aluno.addNotas(nota);
                }
                notasAlunos.add(aluno);
            }
            System.out.println("deseja outra colocar nota: 1 - (sim), 0 - (não) ");
            opcao = sc.nextInt();
        }while(opcao == 1);

        System.out.println("Média dos alunos e status de notas:");
        for (Aluno aluno : notasAlunos) {
            System.out.println("Aluno: " + aluno.getNome());
            System.out.println("Notas: " + aluno.getNotas());
            System.out.printf("Media : %.2f\n", aluno.getMedia());

            if (aluno.getMedia() >= 7) {
                System.out.println("Aluno aprovado!");
            }
            else if (aluno.getMedia() < 4) {
                System.out.println("Aluno reprovado!");
            }else{
                System.out.println("aluno está na final!");
            }
        }


        sc.close();
    }
}
