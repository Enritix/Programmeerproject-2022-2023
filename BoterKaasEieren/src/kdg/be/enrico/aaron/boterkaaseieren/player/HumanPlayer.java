package kdg.be.enrico.aaron.boterkaaseieren.player;

import kdg.be.enrico.aaron.boterkaaseieren.*;
import kdg.be.enrico.aaron.boterkaaseieren.Piece.Color;


import java.util.Scanner;

public class HumanPlayer implements Player {
    private Color color;
    private Scanner sc = new Scanner(System.in);

    public HumanPlayer(String name, Color color) {
        this.color = color;
        this.name = name;
    }

    @Override
    public void play(Board board) {
        boolean gelukt = false;
            do {
                System.out.printf("What row for %s? (x): ", getName());
                int row = sc.nextInt();
                System.out.printf("What column for %s? (y): ", getName());
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
}
