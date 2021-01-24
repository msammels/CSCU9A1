import java.util.Scanner;

/**
 * VerticalString
 *
 * The VerticalString program implements an application which reads in a string and prints each letter on its own
 * line
 *
 * @author Michael Sammels
 * @version 24.09.2018
 */

public class VerticalString {
    /**
     * The main launcher method
     * @param args Command line arguments (unused)
     */
    public static void main(String[] args) {
        String message;
        int marker = 0, length;
        char current;

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a string: ");

        message = scan.nextLine();
        length = message.length();

        for (int count = 0; count < length; count++) {
            current = message.charAt(marker);
            System.out.println(current);
            marker++;
        }
    }
}
