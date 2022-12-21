package kdg.be.enrico.aaron.boterkaaseieren;
public class Piece {
    public enum Color {
        RED, BLACK, SPACE;
    }
    private Color color;
    public Piece(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
}
