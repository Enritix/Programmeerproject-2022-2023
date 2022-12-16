package kdg.be.enrico.aaron.boterkaaseieren.player;

import kdg.be.enrico.aaron.boterkaaseieren.Board;
import kdg.be.enrico.aaron.boterkaaseieren.Piece;
import kdg.be.enrico.aaron.boterkaaseieren.Piece.Color;

import java.util.Scanner;

public class HumanPlayer implements Player {
    private Color color;
    private Scanner sc = new Scanner(System.in);

    public HumanPlayer(Color color) {
        this.color = color;
    }

    @Override
    public void play(Board board) {
        boolean gelukt = false;
        do {
            System.out.println("What row? (x):  ");
            int row = sc.nextInt();
            System.out.print("What column? (y):  ");
            int column = sc.nextInt();
            gelukt = board.addPiece(new Piece(this.color), column, row);
        } while (!gelukt);
    }
}
