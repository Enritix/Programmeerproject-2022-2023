package kdg.be.enrico.aaron.boterkaaseieren;

import kdg.be.enrico.aaron.boterkaaseieren.player.*;

import java.util.Scanner;

import static kdg.be.enrico.aaron.boterkaaseieren.Piece.Color.*;

public class BoterKaasEieren {
    private Board board;
    private Player[] players;
    private Scanner sc = new Scanner(System.in);

    public BoterKaasEieren() {
        this.board = new Board();
        board.toString();
        this.players = new Player[2];
    }

    public void playGame() {
        Piece.Color winnaar;
        System.out.println(board.toString());
        String exit;
            do {
                players[0].play(board);
                System.out.println(board.toString());
                winnaar = board.hasOXO();

                if (winnaar == null) {
                    players[1].play(board);
                    System.out.println(board.toString());
                    winnaar = board.hasOXO();
                }
            } while (winnaar == null && !board.isFull());

        if (board.isFull())
            System.out.println("Draw!");
        else if (winnaar == RED)
            System.out.println("O wins!");
        else
            System.out.println("X wins!");
    }

    public void TwoPlayers(String player1, String player2) {
        players[0] = new HumanPlayer(player1,RED);
        players[1] = new HumanPlayer(player2, BLACK);
    }

    public void OnePlayerOneComputer(String player) {
        players[0] = new HumanPlayer(player, RED);
        players[1] = new ComputerPlayer(BLACK);
    }
}
