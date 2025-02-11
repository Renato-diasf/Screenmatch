package br.com.diaslitz.screenshot.principal;

import br.com.diaslitz.screenshot.calculo.FiltroRecomendacao;
import br.com.diaslitz.screenshot.models.Episodio;
import br.com.diaslitz.screenshot.models.Filme;
import br.com.diaslitz.screenshot.models.Serie;
import br.com.diaslitz.screenshot.calculo.Calculadora;

import java.util.ArrayList;


public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("Homem-Aranha", 2005);
        meuFilme.setDuracao(124);

        meuFilme.exibeFilme();

        meuFilme.avalia(10);
        meuFilme.avalia(7);
        meuFilme.avalia(8);
        System.out.println("Existem " + meuFilme.getTotalDeAvaliacoes() + " avaliações");

        System.out.printf("A média de Avaliações é %.2f\n", meuFilme.pegaMedia());

        Serie serie = new Serie("Breaking Bad", 2000);
        serie.setTemporadas(5);
        serie.setEpisodiosPorTemporada(10);
        serie.setDuracaoPorEpisodio(45);
        System.out.println(serie.getDuracao());

        Calculadora calculadora = new Calculadora();
        calculadora.inclui(meuFilme);
        calculadora.inclui(serie);
        System.out.println("Você precisa de " + calculadora.getTempoTotal() + " minutos para maratonar essa playlist!");

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setSerie(serie);
        episodio.setNome("A mosca");
        episodio.setNumero(8);
        episodio.setNumeroDeVisualizacoes(200);

        filtro.filtra(episodio);

        Filme filme = new Filme("Matrix", 1998);
        filme.setDuracao(120);



        var outroFilme = new Filme("Ilha do Medo", 2007);
        outroFilme.setDuracao(130);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(filme);
        listaDeFilmes.add(outroFilme);

        System.out.println("Tamanho da Playlist: " + listaDeFilmes.size());
        System.out.println("Nome do primeiro filme: " + listaDeFilmes.get(0).getNome());
        System.out.println(listaDeFilmes);

    }
}