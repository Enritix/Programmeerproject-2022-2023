package kdg.be.enrico.aaron.boterkaaseieren;

import kdg.be.enrico.aaron.boterkaaseieren.player.Player;

import java.util.concurrent.atomic.AtomicInteger;

import static kdg.be.enrico.aaron.boterkaaseieren.Piece.Color.*;

public class Score {
    private int stars;
    private Player player;
    private BoterKaasEieren bke;
    private Board board;

    public Score(Player player, Board board) {
        Piece.Color winnaar;
        winnaar = board.hasOXO();
        this.board = board;
        if (board.isFull()) {
            this.stars = 1;
            this.player = player;
        } else if (winnaar == RED) {
            this.stars = 3;
            this.player = player;
        } else if (winnaar == BLACK) {
            this.stars = 3;
            this.player = player;
        } else {
            this.stars = 0;
            this.player = player;
        }
        Leaderboard.addScore(player.getName(),this);
    }
    public int getStars() {
        return this.stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }
}
