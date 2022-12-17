package kdg.be.enrico.aaron.boterkaaseieren;

import kdg.be.enrico.aaron.boterkaaseieren.player.HumanPlayer;

import java.io.*;
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
                System.out.print("Give the name of player 1: ");
                String player1 = sc.next();
                System.out.print("Give the name of player 2: ");
                String player2 = sc.next();
                System.out.print("Press <ENTER> to continue!");
                try {
                    System.in.read();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                game.TwoPlayers(player1, player2);
                game.playGame();
            } else if (keuze == 2) {
                System.out.print("Give the name of player: ");
                String player = sc.nextLine();
                System.out.print("Press <ENTER> to continue!");
                sc.nextLine();
                game.OnePlayerOneComputer(player);
                game.playGame();
            } else if (keuze == 3) {
                System.out.println("Give your name: ");
                /*String player = sc.nextLine();
                HumanPlayer scores = new HumanPlayer(player);
                score.getScore();*/
            } else if (keuze == 4) {
                GameRules rules = new GameRules();
                rules.printGameRules();
            } else if (keuze < 1 || keuze > 5){
                System.out.println("This is not a valid choice!");
            }
        } while (keuze != 5);
    }
}
