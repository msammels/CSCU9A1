import java.util.Scanner;

/**
 * InputSequence

 * This program takes input from the user until something is entered which is not an integer. When this happens, the
 * program will then calculate the total of the integers entered and display this, along with how many integers were
 * entered to the user
 *
 * @author Michael Sammels
 * @version 08.10.2018
 */

public class InputSequence {
    /**
     * The main launcher method
     * @param args Command line arguments (unused)
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an integer to continue or a non-integer value to finish. Then press return");

        int count = 0;  // Counter, to keep track of the number of integers entered
        int sum = 0;    // Variable to hold the actual values entered

        while (scan.hasNextInt()) {
            System.out.println
                    ("Enter an integer to continue or a non-integer value to finish. Then press return");
            int in = scan.nextInt();
            sum = sum + in;
            count++;
        }

        System.out.println("You entered " + count + " integers. The sum of your entries is " + sum + ".");
    }
}
