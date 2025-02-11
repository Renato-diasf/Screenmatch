package br.com.diaslitz.screenshot.principal;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import br.com.diaslitz.screenshot.models.Filme;
import br.com.diaslitz.screenshot.calculo.FiltroRecomendacao;

public class FiltroRecomendacaoTest {
    @Test
    void testFiltroRecomendacao() {
        Filme filme = new Filme("Alunos do Delano", 2023);
        filme.avalia(8);
        filme.avalia(10);

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(filme);

        assertEquals(4, filme.getClassificacao());
    }
}
