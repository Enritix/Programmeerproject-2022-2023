package kdg.be.enrico.aaron.boterkaaseieren;
import kdg.be.enrico.aaron.boterkaaseieren.player.*;
import static kdg.be.enrico.aaron.boterkaaseieren.Piece.Color.*;

public class BoterKaasEieren1P1C {
    private Board board;
    private HumanPlayer player1;
    private ComputerPlayer computerPlayer;

    public BoterKaasEieren1P1C() {
        this.board = new Board();
        this.player1 = new HumanPlayer(BLACK);
        this.computerPlayer = new ComputerPlayer(RED);
    }
}
