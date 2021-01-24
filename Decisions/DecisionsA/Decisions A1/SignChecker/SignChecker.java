import java.util.Scanner;

/**
 * SignChecker
 *
 * A program to check the sign of an integer
 *
 * @author Michael Sammels
 * @version 24.09.2018
 */

public class SignChecker {
    /**
     * The main launcher method
     * @param args Command line arguments (unused)
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        if (scan.hasNextInt()) {
            int input = scan.nextInt();
            if (input > 0) {
                System.out.println("This number is positive");
            } else {
                System.out.println("This number is not positive");
            }
        } else {
            System.out.println("Not an integer");
        }
    }
}
