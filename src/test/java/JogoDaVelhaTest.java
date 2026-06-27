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

        // Casa vazia
        assertTrue(tabuleiro.casaLivre("A3"));

        // Casa ocupada
        assertFalse(tabuleiro.casaLivre("A1"));
    }