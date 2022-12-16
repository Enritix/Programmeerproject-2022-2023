package kdg.be.enrico.aaron.boterkaaseieren;

import static kdg.be.enrico.aaron.boterkaaseieren.Piece.Color.*;

public class Board {
    private static final int BORDER = 3;
    private Piece[][] pieces;
    private int pieceCounter;

    public Board() {
        this.pieces = new Piece[BORDER][BORDER];
    }

    public boolean addPiece(Piece piece, int columnNumber, int rowNumber) {
        if (pieces[columnNumber][rowNumber] == null) {
            pieceCounter++;
            pieces[columnNumber][rowNumber] = piece;
            return true;
        } else {
            return false;
        }

    }

    public boolean isFull() {
        return pieceCounter == BORDER * BORDER;
    }

    @Override
    public String toString() {
        /*StringBuilder sb = new StringBuilder();
        for (int i = 1; i < BORDER; i++) {
            sb.append(" ");
            System.out.print("\n-------\n");
            for (int j = 2; j < BORDER; j++) {
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
        return sb.toString();*/
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            sb.append(String.format(" %d ", i));
        }
        sb.append("\n");
        for (int i = 0; i < pieces.length; i++) {
            for (int j = 0; j < pieces[i].length; j++) {
                if (pieces[i][j] == null) {
                    sb.append(" ").append(" |");

                } else {
                    if (pieces[i][j].getColor() == RED) {
                        sb.append("O").append("|");
                    } else {
                        sb.append("X").append("|");
                    }
                }
            }
            if (i < pieces.length - 1) {
                sb.append("\n---+---+---\n");
            }
        }
        return sb.toString();
    }
        /*
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < pieces.length; i++) {
            sb.append(" ").append(pieces[i][0]).append(" |");
            sb.append(" ").append(pieces[i][1]).append(" |");
            sb.append(" ").append(pieces[i][2]).append(" \n");
            if (i < pieces.length - 1) {
                sb.append("\n---+---+---\n");
            }
        }
        return sb.toString();
    }*/


    public Piece.Color hasOXO() {
        //TODO
        return null;
    }
}
