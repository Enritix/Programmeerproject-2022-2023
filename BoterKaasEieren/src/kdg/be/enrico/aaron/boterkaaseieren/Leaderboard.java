package kdg.be.enrico.aaron.boterkaaseieren;

import java.util.*;

public class Leaderboard {
    private Map<String, Integer> scores;

    public Leaderboard() {
        scores = new TreeMap<>(Collections.reverseOrder());
    }

    public void addScore(String player, int stars) {
        scores.put(player, stars);
    }

    public void printLeaderboard() {
        for (Map.Entry<String, Integer> entry : scores.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
