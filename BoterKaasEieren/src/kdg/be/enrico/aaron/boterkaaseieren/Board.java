package kdg.be.enrico.aaron.boterkaaseieren;

import static kdg.be.enrico.aaron.boterkaaseieren.Piece.Color.*;

public class Board {
    private static final int BORDER = 3;
    private Piece[][] pieces;
    private int pieceCounter = 0;

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

   /* public void createBoard() {
        for (int i = 0; i < pieces.length; i++) {
            for (int j = 0; j < pieces.length; j++) {
                this.pieces[i][j] =
            }
        }
    }*/
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
        /*for (int i = 0; i < 3; i++) {
            sb.append(String.format(" %d ", i));
        }
        sb.append("\n");*/
        for (int i = 0; i < pieces.length; i++) {
            for (int j = 0; j < pieces[i].length; j++) {
                if (pieces[i][j] == null) {
                    if (j < 2) {
                        sb.append("  ").append(" |");
                    } else {
                        sb.append("   ");
                    }
                } else {
                    if (pieces[i][j].getColor() == RED) {
                        if (j < 2) {
                            sb.append(" O").append(" |");
                        } else {
                            sb.append(" O ");
                        }
                    } else {
                        if (j < 2) {
                            sb.append(" X").append(" |");
                        } else {
                            sb.append(" X ");
                        }
                    }
                }
            }
            if (i < pieces.length - 1) {
                sb.append("\n---+---+---\n");
            }
        }
        return sb.toString();
    }



    public Piece.Color hasOXO() {
        int[][] richting = {{1, 0}, {1, -1}, {1, 1}, {0, 1}};
        for (int[] r : richting) { // {1, 0} ↔, {1, -1} ↙ , {1, 1} ↘, {0, 1} ↕
            int ry = r[0];
            int rx = r[1];

            for (int x = 0; x < BORDER; x++) {
                for (int y = 0; y < BORDER; y++) {

                    int lasty = y + 2 * ry;
                    int lastx = x + 2 * rx;
                    if (lasty < BORDER && lasty >= 0 && lastx < BORDER && lastx >= 0) {
                        Piece currentPiece = pieces[y][x];
                        if (currentPiece != null && (pieces[y + ry][x + rx] != null && currentPiece.getColor() == pieces[y + ry][x + rx].getColor()
                                && pieces[y + 1 * ry][x + 1 * rx] != null && currentPiece.getColor() == pieces[y + 1 * ry][x + 1 * rx].getColor()
                                && pieces[y + 2 * ry][x + 2 * rx] != null && currentPiece.getColor() == pieces[y + 2 * ry][x + 2 * rx].getColor())) {
                            return currentPiece.getColor();
                        }
                    }
                }
            }
        }
        return null;
    }
}
