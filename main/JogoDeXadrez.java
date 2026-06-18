package main;

public class JogoDeXadrez implements Jogo {

    @Override
    public void iniciar() {

        Tabuleiro tabuleiro = new Tabuleiro();
        JogadorHumano jogadorHumano = new JogadorHumano('b');
        JogadorSintetico jogadorSintetico = new JogadorSintetico('p');
        System.out.println("Iniciando o jogo de xadrez");
        while (!tabuleiro.acabouOJogo()) {
            jogadorHumano.jogar(tabuleiro, "Peão", 1);
            jogadorSintetico.jogar(tabuleiro, "Peão", 1);

        }
    }

    public static void main(String[] args) {
        System.out.println("Caua da Silva Oliveira");
    }
}
