import java.util.Scanner;

/**
 * BinaryDigits
 *
 * The Binary Digits program reads a positive integer and prints all of its binary digits
 *
 * @author Michael Sammels
 * @version 08.10.2018
 */

public class BinaryDigits {
    /**
     * The main launcher method
     * @param args Command line arguments (unused)
     */
    public static void main(String[] args) {
        System.out.print("Enter the decimal number: ");
        Scanner scan = new Scanner(System.in);
        int in = scan.nextInt(), rem;
        StringBuilder answer = new StringBuilder();
        StringBuilder finalAnswer = new StringBuilder();

        do {
            rem = in % 2;
            in = in / 2;

            answer.append(rem);
        } while (in >= 1);

        for (int j = answer.length() - 1; j >= 0; j--) {
            finalAnswer.append(answer.charAt(j));
        }

        System.out.println(finalAnswer);
    }
}
