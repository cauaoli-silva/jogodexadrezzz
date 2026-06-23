public abstract class Jogador implements JogadorInterface {

    protected char cor;

    public Jogador(char cor) {

        if (cor != 'b' && cor != 'p') {
            System.out.println("Cor deve ser b ou p");
        }

        this.cor = cor;
    }

    public char getCor() {
        return cor;
    }