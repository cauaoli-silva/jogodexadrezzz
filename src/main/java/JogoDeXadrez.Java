import java.util.Scanner;

public class JogoDeXadrez implements Jogo {

    @Override
    public void iniciar() {

        Tabuleiro tabuleiro = new Tabuleiro();
        Scanner scanner = new Scanner(System.in);

        tabuleiro.mostrar();

        String continuar = "S";

        while (continuar.equalsIgnoreCase("S")) {

            System.out.print("Qual peça você quer mover? ");
            String peca = scanner.nextLine();

            System.out.print("Para qual casa você deseja mover? ");
            String casa = scanner.nextLine();

            if (tabuleiro.casaLivre(casa)) {
                System.out.println("Movimento realizado.");
            } else {
                System.out.println("Não pode mover. A casa está ocupada.");
            }

            tabuleiro.mostrar();

            System.out.print("Deseja continuar jogando? (S/N) ");
            continuar = scanner.nextLine();
        }

        scanner.close();
    }

    public static void main(String[] args) {

        JogoDeXadrez jogo = new JogoDeXadrez();

        jogo.iniciar();

        System.out.println("Cauã da Silva Oliveira");
    }
}