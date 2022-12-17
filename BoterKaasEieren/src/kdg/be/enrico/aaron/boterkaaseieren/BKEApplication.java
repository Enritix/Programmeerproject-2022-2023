package kdg.be.enrico.aaron.boterkaaseieren;

import java.util.Scanner;

public class BKEApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BoterKaasEieren game = new BoterKaasEieren();
        int keuze;
        do {
            System.out.println("What do you want to do?\n- 1: Play 1v1\n- 2: Play against computer\n- 3: Leaderboard\n- 4: Game rules\n- 5: Exit game");
            System.out.print("Choice: ");
            keuze = sc.nextInt();
            if (keuze == 1) {
                game.TwoPlayers();
                game.playGame();
            } else if (keuze == 2) {
                game.OnePlayerOneComputer();
                game.playGame();
            } else if (keuze == 3) {
                Score score = new Score();
                score.getScore();
            } else if (keuze == 4) {
                GameRules rules = new GameRules();
                rules.printGameRules();
            } else if (keuze < 1 || keuze > 5){
                System.out.println("This is not a valid choice!");
            }
        } while (keuze != 5);
    }
}
