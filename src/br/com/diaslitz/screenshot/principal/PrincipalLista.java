package br.com.diaslitz.screenshot.principal;

import br.com.diaslitz.screenshot.models.Filme;
import br.com.diaslitz.screenshot.models.Serie;
import br.com.diaslitz.screenshot.models.Titulo;

import java.util.*;

public class PrincipalLista {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("Homem-Aranha", 2005);
        meuFilme.avalia(10);

        Filme filme = new Filme("Matrix", 1998);
        filme.avalia(6);

        var outroFilme = new Filme("Ilha do Medo", 2007);
        outroFilme.avalia(9);

        Serie serie = new Serie("Breaking Bad", 2000);

        List<Titulo> lista = new LinkedList<>();
        lista.add(meuFilme);
        lista.add(filme);
        lista.add(outroFilme);
        lista.add(serie);

        System.out.println(lista);


        for (Titulo item : lista) {
            System.out.println(item);
            if (item instanceof Filme filmeAux && filmeAux.getClassificacao() > 3) {
                System.out.println("Avaliação do Filme: " + filmeAux.getClassificacao());
            }
        }

        System.out.println("Ordenando por ordem alfabética: ");
        Collections.sort(lista);
        System.out.println(lista);

        System.out.println("Ordenando por ano de lançamento: ");
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println(lista);
    }
}
