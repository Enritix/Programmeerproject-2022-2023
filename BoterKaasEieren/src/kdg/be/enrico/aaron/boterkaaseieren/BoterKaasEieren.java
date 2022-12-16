package kdg.be.enrico.aaron.boterkaaseieren;

import kdg.be.enrico.aaron.boterkaaseieren.player.*;

import static kdg.be.enrico.aaron.boterkaaseieren.Piece.Color.*;

public class BoterKaasEieren {
    private Board board;
    private Player[] players;

    public BoterKaasEieren() {
        this.board = new Board();
        this.players = new Player[2];
    }

    public void playGame() {

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
