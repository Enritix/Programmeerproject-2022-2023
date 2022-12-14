package kdg.be.enrico.aaron.boterkaaseieren;

import static kdg.be.enrico.aaron.boterkaaseieren.Piece.Color.*;

public class Board {
    private static final int BORDER = 3;
    private Piece[][] pieces;
    private int pieceCounter;

    public Board() {
        this.pieces = new Piece[BORDER][BORDER];
    }

    public void addPiece(Piece piece, int columnNumber, int rowNumber) {
        if (pieces[columnNumber][rowNumber] == null) {
            pieceCounter++;
            pieces[columnNumber][rowNumber] = piece;
        }
    }

    public boolean isFull() {
        return pieceCounter == BORDER * BORDER;
    }

    //TODO: hasOXO method

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            sb.append(" ").append(i);
        }

        for (int i = 0; i < BORDER; i++) {
            sb.append(" ");
            System.out.print("\n-------\n");
            for (int j = 1; j < BORDER; j++) {
                if (pieces[i][j] == null) {
                    sb.append(" ").append("|");

                } else {
                    if (pieces[i][j].getColor() == RED) {
                        sb.append("O").append("|");
                        System.out.print("\n-------\n");
                    }
                    else {
                        sb.append("X").append("|");
                        System.out.print("\n-------\n");
                    }
                }
            }
        }
        return sb.toString();
    }
}
