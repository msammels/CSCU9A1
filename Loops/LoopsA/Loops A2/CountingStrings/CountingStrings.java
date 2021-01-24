import java.util.Scanner;

/**
 * CountingStrings
 *
 * This program will read in a sequence of strings input by the user and keep a count of how many begin with the
 * substring "Stir". If the user types "q" the program will display a message saying how many of the input strings
 * started with "Stir"
 *
 * @author Michael Sammels
 * @version 08.10.2018
 */

public class CountingStrings {
    /**
     * The main launcher method
     * @param args Command line arguments (unused)
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String valid = "Stir";
        boolean running = true;

        int count = 0;  // Counter, to keep track of the number of strings entered

        do {
            System.out.println("Enter a string to continue or q to quit");
            String in = scan.nextLine();

            if (in.length() >= 4 && in.substring(0, 4).equals(valid)) {
                count++;
            } else if (in.equalsIgnoreCase("q")) {
                running = false;
            }
        } while (running);

        System.out.println(count);
    }
}
