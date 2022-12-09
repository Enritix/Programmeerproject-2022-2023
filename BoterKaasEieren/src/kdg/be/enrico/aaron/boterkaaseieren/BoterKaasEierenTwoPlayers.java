package kdg.be.enrico.aaron.boterkaaseieren;

import kdg.be.enrico.aaron.boterkaaseieren.player.HumanPlayer;

import static kdg.be.enrico.aaron.boterkaaseieren.Piece.Color.*;

public class BoterKaasEierenTwoPlayers {
    private Board board;
    private HumanPlayer player1;
    private HumanPlayer player2;

    public BoterKaasEierenTwoPlayers() {
        this.board = new Board();
        this.player1 = new HumanPlayer(BLACK);
        this.player2 = new HumanPlayer(RED);
    }
}
