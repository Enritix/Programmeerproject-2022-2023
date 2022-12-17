package kdg.be.enrico.aaron.boterkaaseieren;

import kdg.be.enrico.aaron.boterkaaseieren.player.Player;

import java.util.concurrent.atomic.AtomicInteger;

import static kdg.be.enrico.aaron.boterkaaseieren.Piece.Color.*;

public class Score {
    private int stars;
    private Player player;
    private BoterKaasEieren bke;
    private Board board;

    public Score(Player player) {
        Piece.Color winnaar;
        winnaar = board.hasOXO();
        if (board.isFull()) {
            this.stars += 1;
            this.player = player;
        } else if (winnaar == RED) {
            this.stars += 2;
            this.player = player;
        } else if (winnaar == BLACK) {
            this.stars += 2;
            this.player = player;
        } else {
            this.stars += 0;
            this.player = player;
        }
    }
    public int getStars() {
        return this.stars;
    }
}
