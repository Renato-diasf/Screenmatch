package br.com.diaslitz.screenshot.principal;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import br.com.diaslitz.screenshot.models.Serie;

public class SerieTest {
    @Test
    void testCalculoDuracaoTotal() {
        Serie serie = new Serie("Engenharia de Software 1", 2024);
        serie.setTemporadas(3);
        serie.setEpisodiosPorTemporada(10);
        serie.setDuracaoPorEpisodio(50);

        assertEquals(1500, serie.getDuracao());
    }
}
