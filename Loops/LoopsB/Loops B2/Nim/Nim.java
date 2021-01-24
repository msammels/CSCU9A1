import java.util.Random;
import java.util.Scanner;

/**
 * Nim
 *
 * Here we are going to play the ancient and popular game of Nim, against two players
 * TODO: implement AI functionality
 *
 * @author Michael Sammels
 * @version 08.10.2018
 */

public class Nim {
    /**
     * The main launcher method
     * @param args Command line arguments (unused)
     */
    public static void main(String[] args) {
        Random r = new Random();
        Scanner scan = new Scanner(System.in);

        final int HEAP_MIN = 10, HEAP_MAX = 20, STONES_MIN = 1, STONES_MAX = 4;
        int heapSize = r.nextInt((HEAP_MAX - HEAP_MIN) + 1) + HEAP_MIN;
        int player = 1;

        System.out.println("************************************************************************\n" +
                "*                      Welcome to the game of Nim!                     *\n" +
                "*                                                                      *\n" +
                "* Instructions: This is a game for two players. There is a heap        *\n" +
                "* containing 10 to 20 stones. Players take turns to remove from 1 to 4 *\n" +
                "* stones from the heap. The player who removes the last stone wins.    *\n" +
                "*                                                                      *\n" +
                "************************************************************************\n");

        // Continue playing while there are stones left
        while (heapSize > 0) {
            System.out.println("Number of stones in the heap: " + heapSize);
            System.out.println("Player " + player + ": how many stones will you remove (1 to 4)?");
            boolean moveRead = false;
            int stonesRemoved;

            // Input validation
            while (!moveRead) {
                while (!scan.hasNextInt()) {
                    scan.next();
                    System.out.println("Bad input, try again.");
                }
                System.out.println();
                stonesRemoved = scan.nextInt();


                if (stonesRemoved >= STONES_MIN && stonesRemoved <= STONES_MAX && stonesRemoved <= heapSize) {
                    moveRead = true;
                    heapSize -= stonesRemoved;
                } else {
                    System.out.println("That is not possible, try again.");
                    System.out.println("Player " + player + ": how may stones will you remove (1 to 4)?");
                }
            }

            if (heapSize > 0) {
                if (player == 1) {
                    player = 2;
                } else {
                    player = 1;
                }
            }
        }

        // Print the winner once we are out of the loop
        System.out.println("Player " + player + " wins!");
    }
}
