package kdg.be.enrico.aaron.boterkaaseieren;

import java.util.*;

public class Leaderboard {
    private Map<String, Integer> scores;

    public Leaderboard() {
        // Create a TreeMap to store the scores in descending order
        scores = new TreeMap<>(Collections.reverseOrder());
    }

    public void addScore(String player, int score) {
        scores.put(player, score);
    }

    public void printLeaderboard() {
        for (Map.Entry<String, Integer> entry : scores.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
