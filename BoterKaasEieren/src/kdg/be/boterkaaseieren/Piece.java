package kdg.be.boterkaaseieren;
public class Piece {
    public enum Color {
        RED, BLACK;
    }
    private Color color;
    public Piece(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
}
