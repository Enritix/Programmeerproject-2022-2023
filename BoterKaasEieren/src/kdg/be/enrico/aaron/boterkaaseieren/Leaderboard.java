package kdg.be.enrico.aaron.boterkaaseieren;

import java.util.*;

public class Leaderboard {
    private Map<String, Score> scores;

    public Leaderboard() {
        scores = new TreeMap<>(Collections.reverseOrder());
    }

    public void addScore(String player, Score stars) {
        scores.put(player, stars);
    }

    public void printLeaderboard() {
        for (Map.Entry<String, Score> entry : scores.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
