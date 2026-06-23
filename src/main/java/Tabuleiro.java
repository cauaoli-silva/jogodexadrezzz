public class Tabuleiro {

    private String[][] casas = new String[8][8];

    public Tabuleiro() {

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                casas[i][j] = "   ";
            }
        }

        colocarPecas();

        mostrar();
    }

    public void colocarPecas() {

        Peca reiBranco = new Peca("K0b");
        Peca reiPreto = new Peca("K0p");

        casas[0][4] = reiPreto.getNome();
        casas[7][4] = reiBranco.getNome();
    }

    public boolean acabouOJogo() {
        return false;
    }

    public void mostrar() {

        for (int i = 0; i < 8; i++) {

            for (int j = 0; j < 8; j++) {
                System.out.print("[" + casas[i][j] + "]");
            }

            System.out.println();
        }
    }
}