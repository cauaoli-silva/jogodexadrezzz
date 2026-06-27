public abstract class Jogador implements JogadorInterface {

    protected char cor;

    public Jogador(char cor) {
        this.cor = cor;
    }

    public char getCor() {
        return cor;
    }
}