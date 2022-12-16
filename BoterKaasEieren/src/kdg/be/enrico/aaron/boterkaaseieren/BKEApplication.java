package kdg.be.enrico.aaron.boterkaaseieren;

public class BKEApplication {
    public static void main(String[] args) {
        BoterKaasEieren game = new BoterKaasEieren();
        game.TwoPlayers();
        game.playGame();
        //if button 1v1 is pressed --> game.TwoPlayers() & game.playGame
        //if button 1vComputer is pressed --> game.OnePlayerOneComputer() & game.playGame
        GameRules rules = new GameRules();
        

    }
}
