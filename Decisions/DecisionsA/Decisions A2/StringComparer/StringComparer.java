import java.util.Scanner;

/**
 * StringComparer
 *
 * The StringComparer program implements an application which reads in two strings and compares them
 *
 * @author Michael Sammels
 * @version 24.09.2018
 */

public class StringComparer {
    /**
     * The main launcher method
     * @param args Command line arguments (unused)
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two words separated by a space");
        String word1 = scan.next(), word2 = scan.next();

        /*
         * Validation:
         *
         * Check if strings are equal and which comes first in the dictionary
         * Report both values to the standard output
         */
        if (word1.equals(word2)) {
            System.out.println(word1 + " is equal to " + word2);
        } else {
            System.out.println(word1 + " is not equal to " + word2);
        }

        if (word1.compareTo(word2) < 0) {
            System.out.println(word1 + " comes before " + word2 + " in the dictionary");
        } else {
            // If both words are identical, report this to the standard output
            if (word1.compareTo(word2) == 0) {
                System.out.println("These words are identical");
            } else {
                System.out.println(word2 + " comes before " + word1 + " in the dictionary");
            }
        }
    }
}
