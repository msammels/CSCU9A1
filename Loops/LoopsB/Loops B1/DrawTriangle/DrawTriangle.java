import java.util.Scanner;

/**
 * DrawTriangle
 *
 * @author Michael Sammels
 * @version 15.10.2018
 */

public class DrawTriangle {
    /**
     * The main launcher method
     * @param args Command line arguments (unused)
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        final int MIN = 1, MAX = 5;
        String input;
        boolean running = false;

        // Allows the user to begin the program
        System.out.println("Press y to begin");
        input = scan.nextLine().toLowerCase();
        if (input.equals("y")) {
            running = true;
        } else {
            System.out.println("Exiting...");
        }

        // Loop as long as the boolean is true
        while (running) {
            // Calculate a random size of triangle
            int height = (int) (Math.random() * (MAX - MIN + 1) + MIN);

            // First: loop controlling the amount of lines or the height needed for the triangle
            for (int line = 0; line <= height; line++) {
                // Second: loop nested controls decreasing amount of spaces required before an X
                for (int space = 0; space < height - line; space++) {
                    System.out.print(" ");
                }

                // Third: loop draws X's after spaces
                for (int x = 0; x <= line; x++) {
                    System.out.print("X ");
                }

                // Goes to the next line controlling height
                System.out.println();
            }

            // Continues loop allowing the user to see another triangle or exit the program
            System.out.println("Press y to begin");
            input = scan.nextLine().toLowerCase();
            if (!input.equals("y")) {
                running = false;
                System.out.println("Exiting...");
            }
        }
    }
}
