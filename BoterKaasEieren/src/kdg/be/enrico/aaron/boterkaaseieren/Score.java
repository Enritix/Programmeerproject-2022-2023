package kdg.be.enrico.aaron.boterkaaseieren;

import java.util.concurrent.atomic.AtomicInteger;

public class Score {
        private AtomicInteger score;
        public void Score (int points) {
            score.getAndAdd (points);
        }
        public int getScore () {
            return score.get();
        }
    }
