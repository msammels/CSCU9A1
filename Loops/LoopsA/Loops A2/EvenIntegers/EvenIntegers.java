import java.util.Scanner;

/**
 * EvenIntegers
 *
 * This program will read in a sequence of integers input by the user and keep a count of how many are even. Once
 * the user enters something that is not an integer, the program will display a message saying how many even
 * integers were read and then terminate
 *
 * @author Michael Sammels
 * @version 08.10.2018
 */

public class EvenIntegers {
    /**
     * The main launcher method
     * @param args Command line arguments (unused)
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an integer to continue or a non-integer value to finish. Then press return");

        int count = 0;  // Counter, to keep track of the number of integers entered

        while (scan.hasNextInt()) {
            System.out.println
                    ("Enter an integer to continue or a non-integer value to finish. Then press return");
            int in = scan.nextInt();

            if (in % 2 == 0) {
                count++;
            }
        }

        System.out.println("You entered " + count + " even integers.");
    }
}
