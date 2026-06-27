public class Tabuleiro {

    private String[][] casas = new String[8][8];

    public Tabuleiro() {

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                casas[i][j] = "   ";
            }
        }

        colocarPecas();
    }

    public void colocarPecas() {

        // Pretas
        casas[0][0] = "T1p";
        casas[0][1] = "C1p";
        casas[0][2] = "B1p";
        casas[0][3] = "D0p";
        casas[0][4] = "K0p";
        casas[0][5] = "B2p";
        casas[0][6] = "C2p";
        casas[0][7] = "T2p";

        for (int i = 0; i < 8; i++) {
            casas[1][i] = "P" + (i + 1) + "p";
        }

        // Brancas
        casas[7][0] = "T1b";
        casas[7][1] = "C1b";
        casas[7][2] = "B1b";
        casas[7][3] = "D0b";
        casas[7][4] = "K0b";
        casas[7][5] = "B2b";
        casas[7][6] = "C2b";
        casas[7][7] = "T2b";

        for (int i = 0; i < 8; i++) {
            casas[6][i] = "P" + (i + 1) + "b";
        }
    }

    public boolean casaLivre(String casa) {

        int coluna = Character.toUpperCase(casa.charAt(0)) - 'A';
        int linha = 8 - Character.getNumericValue(casa.charAt(1));

        return casas[linha][coluna].equals("   ");
    }

    public boolean moverPeca(String nomePeca, String casaDestino) {

        int coluna = Character.toUpperCase(casaDestino.charAt(0)) - 'A';
        int linha = 8 - Character.getNumericValue(casaDestino.charAt(1));

        if (!casaLivre(casaDestino)) {
            return false;
        }

        for (int i = 0; i < 8; i++) {

            for (int j = 0; j < 8; j++) {

                if (casas[i][j].equals(nomePeca)) {

                    casas[linha][coluna] = nomePeca;
                    casas[i][j] = "   ";

                    return true;
                }
            }
        }

        return false;
    }

    public boolean acabouOJogo() {
        return false;
    }

    public void mostrar() {

        System.out.println("   A    B    C    D    E    F    G    H");

        for (int i = 0; i < 8; i++) {

            System.out.print((8 - i) + " ");

            for (int j = 0; j < 8; j++) {

                System.out.print("[" + casas[i][j] + "]");
            }

            System.out.println();
        }
    }
}