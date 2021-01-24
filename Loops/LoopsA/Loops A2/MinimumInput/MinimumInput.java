import java.util.Scanner;

/**
 * MinimumInput
 *
 * This program reads a sequence of integers and keeps track of the smallest integer the user entered. If something
 * other than an integer is entered, the program displays the minimum integer entered and stops
 *
 * @author Michael Sammels
 * @version 08.10.2018
 */

public class MinimumInput {
    /**
     * The main launcher method
     * @param args Command line arguments (unused)
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an integer to continue or a non-integer value to finish. Then press return");
        boolean first = true;
        int min = 0, val;

        while (scan.hasNextInt()) {
            val = scan.nextInt();
            System.out.println("Enter an integer (while)");

            if (first) {
                min = val;
                first = false;
            } else if (val < min) {
                min = val;
            }
        }

        System.out.println("The minimum value is " + min);
    }
}
