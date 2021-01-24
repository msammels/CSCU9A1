import java.util.Scanner;

/**
 * StringPractice
 *
 * The StringPractice program implements an application that practices using string functions and displays to the
 * standard output
 *
 * @author Michael Sammels
 * @version 17.09.2018
 */

public class StringPractice {
    /**
     * The main launcher method
     * @param args Command line arguments (unused)
     */
    public static void main(String[] args) {
        // Declare and initialise new variables
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();

        // Display the output to the user to the standard output
        System.out.println("String s is \"" + s + "\"");
        System.out.println("Length of string is " + s.length() + " characters");
        System.out.println(s.substring(s.length() / 2) + s.substring(0, s.length() - 1));
    }
}
