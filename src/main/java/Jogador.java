public abstract class Jogador implements JogadorInterface {

    protected String nome;

    public Jogador(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}