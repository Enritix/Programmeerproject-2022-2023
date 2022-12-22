package kdg.be.enrico.aaron.boterkaaseieren;

import java.io.*;
import java.util.Scanner;

public class BKEApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("What do you want to do?\n- 1: 【\uD83C\uDFAE】Play 1v1\n- 2: 【\uD83E\uDD16】Play against computer\n- 3: 【\uD83C\uDFC6】Leaderboard\n- 4: 【\uD83D\uDCD6】Game rules\n- 5: 【❌】Exit game");
            System.out.print("Choice: ");
            choice = sc.nextInt();
            if (choice == 1) {
                BoterKaasEieren game = new BoterKaasEieren();
                System.out.print("Player one, give your name: ");
                String player1 = sc.next();
                System.out.print("Player two, give your name: ");
                String player2 = sc.next();
                System.out.printf("%s, you're playing against %s. Good luck to the both of you!\n", player1, player2);
                System.out.print("Press <ENTER> to continue!");
                System.out.println();
                try {
                    System.in.read();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                game.clearPlayers();
                game.TwoPlayers(player1, player2);
                game.playGame();
            } else if (choice == 2) {
                BoterKaasEieren game = new BoterKaasEieren();
                System.out.print("What's your name?: ");
                String player = sc.next();
                System.out.printf("%s, you're playing against the computer. Good luck!\n", player);
                System.out.print("Press <ENTER> to continue!");
                System.out.println();
                try {
                    System.in.read();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                game.clearPlayers();
                game.OnePlayerOneComputer(player);
                game.playGame();
            } else if (choice == 3) {
                System.out.println("Give your name: ");
                /*String player = sc.nextLine();
                HumanPlayer scores = new HumanPlayer(player);
                score.getScore();*/
            } else if (choice == 4) {
                GameRules rules = new GameRules();
                rules.printGameRules();
            } else if (choice < 1 || choice > 5){
                System.out.println("This is not a valid choice!");
            }
        } while (choice != 5);
    }
}
