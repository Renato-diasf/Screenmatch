package br.com.diaslitz.screenshot.models;

import br.com.diaslitz.screenshot.calculo.Classificavel;

public class Episodio implements Classificavel {
    private String nome;
    private int numero;
    private Serie serie;
    private int numeroDeVisualizacoes;

    public int getNumeroDeVisualizacoes() {
        return numeroDeVisualizacoes;
    }

    public void setNumeroDeVisualizacoes(int numeroDeVisualizacoes) {
        this.numeroDeVisualizacoes = numeroDeVisualizacoes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    @Override
    public int getClassificacao() {
        if (numeroDeVisualizacoes > 200) {
            return 4;
        } else {
            return 2;
        }
    }
}
