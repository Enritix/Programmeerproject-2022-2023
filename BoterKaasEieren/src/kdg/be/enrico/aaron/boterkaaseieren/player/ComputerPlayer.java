package kdg.be.enrico.aaron.boterkaaseieren.player;
import kdg.be.enrico.aaron.boterkaaseieren.Piece;
import kdg.be.enrico.aaron.boterkaaseieren.Piece.Color;
import kdg.be.enrico.aaron.boterkaaseieren.Board;

import java.util.Random;
import java.util.Scanner;

public class ComputerPlayer implements Player{
    private Color color;

    public ComputerPlayer(Color color) {
        this.color = color;
    }

    @Override
    public void play(Board board) {
        //TODO
        boolean gelukt = false;
        Random r = new Random();
        int row;
        int column;
        do{
             row = r.nextInt(3);
             column = r.nextInt(3);
            gelukt = board.addPiece(new Piece(this.color), column, row);
        } while (gelukt != true);
        System.out.println("Computer played: (" + row + "," + column + ")");
    }
}
