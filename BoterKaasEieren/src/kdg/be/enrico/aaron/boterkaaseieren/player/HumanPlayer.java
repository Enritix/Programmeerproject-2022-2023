package kdg.be.enrico.aaron.boterkaaseieren.player;

import kdg.be.enrico.aaron.boterkaaseieren.*;
import kdg.be.enrico.aaron.boterkaaseieren.Piece.Color;


import java.util.*;

import static kdg.be.enrico.aaron.boterkaaseieren.Piece.Color.RED;

public class HumanPlayer implements Player {
    private Color color;
    private Scanner sc = new Scanner(System.in);
    private Map<String,Score> scores = new TreeMap<>();
    private String name;

    public HumanPlayer(String name, Color color) {
        this.color = color;
        this.name = name;
    }

    @Override
    public void play(Board board) {
        boolean gelukt = false;
            do {
                System.out.printf("%s's turn: ", getName());
                System.out.print("\n↪Enter a row number (0, 1 or 2) -> ");
                int row = sc.nextInt();
                System.out.print("↪Enter a column number (0, 1 or 2) -> ");
                int column = sc.nextInt();
                gelukt = board.addPiece(new Piece(this.color), column, row);
            } while (!gelukt);
            System.out.println();

    }

    public void addScore(String naam, Score score) {
        this.scores.put(naam,score);
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return getName();
    }
}
