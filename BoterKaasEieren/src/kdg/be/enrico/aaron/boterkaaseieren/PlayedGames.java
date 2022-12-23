package kdg.be.enrico.aaron.boterkaaseieren;

import java.util.ArrayList;
import java.util.List;

public class PlayedGames {
    private static List<BoterKaasEieren> games;
    BoterKaasEieren game;

    public PlayedGames(BoterKaasEieren game) {
        this.game = game;
        this.games = new ArrayList<>();
    }

    public static void addGame(BoterKaasEieren game) {
        games.add(game);
    }

    public static List<BoterKaasEieren> getGames() {
        return games;
    }
}
