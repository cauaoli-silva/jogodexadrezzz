public class Tabuleiro {

    private Peca[][] grid = new Peca[3][3];

    public void colocar(int x, int y, Peca peca) {
        grid[x][y] = peca;
    }

    public Peca get(int x, int y) {
        return grid[x][y];
    }

    public void mostrar() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (grid[i][j] == null) {
                    System.out.print("- ");
                } else {
                    System.out.print(grid[i][j].getSimbolo() + " ");
                }
            }
            System.out.println();
        }
    }
}