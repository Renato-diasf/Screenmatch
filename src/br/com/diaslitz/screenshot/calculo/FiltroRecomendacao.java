package br.com.diaslitz.screenshot.calculo;

public class FiltroRecomendacao {

    public void filtra(Classificavel classificavel){
        if (classificavel.getClassificacao() >= 4) {
            System.out.println("POGGERS!");
        }
        else if (classificavel.getClassificacao() >= 2){
            System.out.println("Froggers");
        }
        else {
            System.out.println("NOGGERS!");
        }
    }
}
