public class JogadorHumano extends Jogador {

    public JogadorHumano(String nome) {
        super(nome);
    }

    @Override
    public void jogar() {
        System.out.println(nome + " está jogando...");
    }
}