package main;

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
        // Peças Brancas
        new Rei("K0b");
        new Rainha("Q0b");
        new Torre("T1b");
        new Torre("T2b");
        new Bispo("B1b");
        new Bispo("B2b");
        new Cavalo("H1b"); 
        new Cavalo("H2b"); 
        
         new Rei("K0p");
        new Rainha("Q0p");
        new Torre("T1p");
        new Torre("T2p");
        new Bispo("B1p");
        new Bispo("B2p");
        new Cavalo("H1p"); 
        new Cavalo("H2p");

       
        for (int i = 1; i <= 8; i++) {
            new Peao("P" + i + "b"); 
            new Peao("P" + i + "p"); 
        }
    }

   
    public void mostrar() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print("[" + casas[i][j] + "]");
            }
            System.out.println();
        }
    }


    public boolean acabouOJogo() {
        return false;
    }
}
