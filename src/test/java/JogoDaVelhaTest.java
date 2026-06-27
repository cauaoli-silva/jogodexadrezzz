import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class JogoDaVelhaTest {

    @Test
    public void testeCriarTabuleiro() {
        Tabuleiro tabuleiro = new Tabuleiro();
        assertNotNull(tabuleiro);
    }

    @Test
    public void testeCasaLivre() {
        Tabuleiro tabuleiro = new Tabuleiro();

        assertTrue(tabuleiro.casaLivre("A3"));
        assertFalse(tabuleiro.casaLivre("A1"));
    }
}