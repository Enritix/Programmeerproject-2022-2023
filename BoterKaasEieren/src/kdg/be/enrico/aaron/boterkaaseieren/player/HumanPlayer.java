package kdg.be.enrico.aaron.boterkaaseieren.player;

import kdg.be.enrico.aaron.boterkaaseieren.Board;
import kdg.be.enrico.aaron.boterkaaseieren.Piece;
import kdg.be.enrico.aaron.boterkaaseieren.Piece.Color;

public class HumanPlayer implements Player {
    private Color color;

    public HumanPlayer(Color color) {
        this.color = color;
    }

    @Override
    public void play(Board board) {
        //TODO
    }
}
