package br.com.diaslitz.screenshot.principal;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import br.com.diaslitz.screenshot.models.Episodio;

public class EpisodioTest {
    @Test
    void testClassificacaoEpisodio() {
        Episodio episodio = new Episodio();
        episodio.setNumeroDeVisualizacoes(250);

        assertEquals(4, episodio.getClassificacao());

        episodio.setNumeroDeVisualizacoes(150);
        assertEquals(2, episodio.getClassificacao());
    }
}
