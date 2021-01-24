import java.util.Scanner;

/**
 * InputLoop
 *
 * @author Michael Sammels
 * @version 08.10.2018
 */

public class InputLoop {
    /**
     * The main launcher method
     * @param args Command line arguments (unused)
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (!scan.hasNextInt()) {    // While non-integers are present...
            scan.next();                // ...read and discard input, then prompt again
            System.out.println("Bad input. Enter an integer");
        }

        int input = scan.nextInt();
        System.out.println("You entered " + input + "!");
    }
}
