import java.util.Scanner;

/**
 * PrintBinaryDigitsFixed
 *
 * A program that prints the binary digits of a positive integer
 *
 * @author Michael Sammels
 * @version 22.10.2018
 */

public class PrintBinaryDigitsFixed {
    /**
     * The main launcher method
     * @param args Command line arguments (unused)
     */
    public static void main(String[] args) {
        final int MIN = 0;
        final int MAX = (int) (Math.pow(2, 30) - 1);
        int[] digits = new int[30];     // Array to hold the digits

        int number = readInput("Enter an integer from " + MIN + " to " + MAX, MAX);
        int counter = 0;                // Counter
        int q = number / 2;             // Quotient
        int r = number % 2;             // Remainder
        int qr;                         // Returning quotient

        while (number > 0) {
            number = q;
            digits[counter] = r;
            qr = q / 2;                 // Quotient to be returned
            r = q % 2;                  // New remainder to be returned
            q = qr;                     // Resetting the number to be divided
            counter++;
        }

        printBackwardsFrom(digits, counter);
    }

    /**
     * Print the contents of an array backwards, starting from index last
     * @param array an array of integers
     * @param last the index of the starting location
     */
    private static void printBackwardsFrom(int[] array, int last) {
        for (int i = last - 1; i >= 0; i--) {
            System.out.print(array[i]);
        }
    }

    /**
     * Read in an integer between two given bounds
     * @param prompt the prompt to show the user
     * @param max the largest acceptable input value
     * @return the input
     */
    private static int readInput(String prompt, int max) {
        int input = 0;
        boolean running = false;

        while (!running) {
            input = readInteger(prompt);

            if (input < 0 || input > max) {
                System.out.print("Bad input. ");
            } else {
                running = true;
            }
        }

        return input;
    }

    /**
     * Read in a positive integer and return its value
     * @param prompt to be shown to the user
     * @return the next integer
     */
    private static int readInteger(String prompt) {
        System.out.print(prompt + ": ");

        Scanner scan = new Scanner(System.in);
        while (!scan.hasNextInt()) {    // While non-integers are present...
            scan.next();                // ...read and discard input, then prompt again
            System.out.print("Bad input. Enter an integer: ");
        }

        return scan.nextInt();
    }
}
