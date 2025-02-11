package br.com.diaslitz.screenshot.principal;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import br.com.diaslitz.screenshot.models.Filme;

public class FilmeTest {
    @Test
    void testCalculoMediaAvaliacao() {
        Filme filme = new Filme("Avatar", 2009);
        filme.avalia(8);
        filme.avalia(10);
        filme.avalia(6);

        assertEquals(8.0, filme.pegaMedia(), 0.01);
    }
}
