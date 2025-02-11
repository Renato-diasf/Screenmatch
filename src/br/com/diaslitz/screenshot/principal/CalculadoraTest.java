package br.com.diaslitz.screenshot.principal;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import br.com.diaslitz.screenshot.calculo.Calculadora;
import br.com.diaslitz.screenshot.models.Filme;
import br.com.diaslitz.screenshot.models.Serie;

public class CalculadoraTest {
    @Test
    void testCalculaTempoTotal() {
        Filme filme = new Filme("Jumanji", 2003);
        filme.setDuracao(120);
        Serie serie = new Serie("ITAC", 2023);
        serie.setTemporadas(2);
        serie.setEpisodiosPorTemporada(5);
        serie.setDuracaoPorEpisodio(45);

        Calculadora calculadora = new Calculadora();
        calculadora.inclui(filme);
        calculadora.inclui(serie);

        assertEquals(570, calculadora.getTempoTotal());
    }
}
