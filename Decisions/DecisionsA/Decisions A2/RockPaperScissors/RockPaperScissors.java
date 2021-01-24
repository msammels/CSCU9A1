import java.util.Scanner;

/**
 * RockPaperScissors
 *
 * The RockPaperScissors program implements an application which mimics the game
 *
 * @author Michael Sammels
 * @version 24.09.2018
 */

public class RockPaperScissors {
    /**
     * The main launcher method
     * @param args Command line arguments (unused)
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String player1, player2;

        System.out.print("Player 1: Choose rock, paper or scissors: ");
        player1 = scan.next().toLowerCase();

        System.out.print("Player 2: Choose rock, paper or scissors: ");
        player2 = scan.next().toLowerCase();

        // Output the results to the standard output
        System.out.println("\nPlayer 1 chose: " + player1);
        System.out.println("Player 2 chose: " + player2);

        /*
         * Validation
         *
         * 1. Rock beats scissors
         * 2. Scissors beats paper
         * 3. Paper  beats rock
         */

        // 1. Rock beats scissors
        if ((player1.equals("rock")) && player2.equals("scissors")) {
            System.out.println("\nPlayer 1 wins");
        } else {
            // 2. Scissors beats paper
            if ((player1.equals("scissors")) && (player2.equals("paper"))) {
                System.out.println("\nPlayer 1 wins");
            }
            // 3. Paper beats rock
            else if ((player1.equals("paper")) && (player2.equals("rock"))) {
                System.out.println("\nPlayer 1 wins");
            }

            // If conditions are the same, it's a tie
            else {
                if ((player1.compareTo(player2) == 0)) {
                    System.out.println("\nIt's a tie!");
                }

                // Error checking
                else {
                    if ((!player1.equals("rock")) && (!player1.equals("paper")) && (!player1.equals("scissors"))) {
                        System.out.println("\nPlayer 1: Please enter rock, paper or scissors");
                    }

                    if ((!player2.equals("rock")) && (!player2.equals("paper")) && (!player2.equals("scissors"))) {
                        System.out.println("\nPlayer 2: Please enter rock, paper or scissors");
                    } else {
                        System.out.println("\nPlayer 2 wins");
                    }
                }
            }
        }
    }
}
