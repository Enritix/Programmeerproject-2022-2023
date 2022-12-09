package kdg.be.boterkaaseieren;



public class Board {
    private static final int WIDTH = 3;
    private static final int HEIGHT = 3;
    private Piece[][] piece;
    private int pieceCounter;

    public Board(int piececounter) {
        this.piece = new Piece[WIDTH][HEIGHT];
    }
    public void addPiece(Piece piece, int columnNumber, int rowNumber) {
    }

}
