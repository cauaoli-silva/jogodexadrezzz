import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class JogoDaVelhaTest {

    @Test
    void criarTabuleiro() {

        Tabuleiro tabuleiro = new Tabuleiro();

        assertNotNull(tabuleiro);
    }
}