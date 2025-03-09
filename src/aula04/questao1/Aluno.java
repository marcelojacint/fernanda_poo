package aula04.questao1;

import java.util.ArrayList;
import java.util.List;

public class Aluno {

    private String nome;
    private List<Double> notas;
    private double media;

    public Aluno() {
        this.notas = new ArrayList<>();
    }

    public void addNotas(double nota) {
        this.notas.add(nota);
        calcularMedia();
    }

    private void calcularMedia() {
        if (notas.isEmpty()) {
            media = 0;
        }else{
            double soma = 0;
            for (double nota : notas) {
                soma += nota;
            }
            media = soma / notas.size();
        }
    }

    public List<Double> getNotas() {
        return notas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }


}
