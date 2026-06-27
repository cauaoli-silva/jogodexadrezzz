import java.util.Scanner;

public class JogoDeXadrez implements Jogo {

    @Override
    public void iniciar() {

        Tabuleiro tabuleiro = new Tabuleiro();
        Scanner sc = new Scanner(System.in);

        String resposta = "S";

        while (resposta.equalsIgnoreCase("S")) {

            tabuleiro.mostrar();

            System.out.print("Qual peça você quer mover? ");
            String peca = sc.nextLine();

            System.out.print("Para qual casa você deseja mover? ");
            String casa = sc.nextLine();

            if (tabuleiro.moverPeca(peca, casa)) {

                System.out.println("Peça movida com sucesso!");

            } else {

                System.out.println("Não foi possível mover a peça. A casa já está ocupada ou a peça não existe.");
            }

            tabuleiro.mostrar();

            System.out.print("Deseja continuar jogando? (S/N): ");
            resposta = sc.nextLine();
        }

        sc.close();

        System.out.println("Jogo encerrado.");
    }

    public static void main(String[] args) {

        JogoDeXadrez jogo = new JogoDeXadrez();

        jogo.iniciar();
    }
}