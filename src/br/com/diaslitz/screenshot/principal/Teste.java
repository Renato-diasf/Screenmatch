package br.com.diaslitz.screenshot.principal;

import br.com.diaslitz.screenshot.models.Filme;

import java.util.ArrayList;
import java.util.Collections;

public class Teste {
    public static void main(String[] args) {
        Filme filme1 = new Filme("Avatar", 2009);
        Filme filme2 = filme1;

        if (filme1 == filme2) {
            System.out.println("Iguais");
        } else {
            System.out.println("Diferentes");
        }

        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Renato");
        nomes.add("Chovy");
        nomes.add("Murilo");

        System.out.println(nomes);
        Collections.sort(nomes);
        System.out.println(nomes);
    }
}
