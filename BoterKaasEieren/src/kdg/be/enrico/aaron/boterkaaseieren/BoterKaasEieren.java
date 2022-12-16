package kdg.be.enrico.aaron.boterkaaseieren;

import kdg.be.enrico.aaron.boterkaaseieren.player.*;

import static kdg.be.enrico.aaron.boterkaaseieren.Piece.Color.*;

public class BoterKaasEieren {
    private Board board;
    private Player[] players;

    public BoterKaasEieren() {
        this.board = new Board();
        board.toString();
        this.players = new Player[2];
    }

    public void playGame() {
        Piece.Color winnaar;
        System.out.println(board.toString());
        do {
            players[0].play(board);
            System.out.println(board.toString());
            winnaar = board.hasOXO();

            if (winnaar == null) {
                players[1].play(board);
                System.out.println(board.toString());
                winnaar = board.hasOXO();
            }
        } while(winnaar == null && !board.isFull());
        if (board.isFull())
            System.out.println("Draw!");
        else if (winnaar == RED)
            System.out.println("o wins!");
        else
            System.out.println("x wins!");
    }

    public void TwoPlayers() {
        players[0] = new HumanPlayer(RED);
        players[1] = new HumanPlayer(BLACK);
    }

    public void OnePlayerOneComputer() {
        players[0] = new HumanPlayer(RED);
        players[1] = new ComputerPlayer(BLACK);
    }
}
