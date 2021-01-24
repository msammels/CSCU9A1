import java.util.Scanner;

/**
 * InteractiveRectangle
 *
 * @author Michael Sammels
 * @version 15.10.2018
 */

public class InteractiveRectangle {
    /**
     * The main launcher method
     * @param args Command line arguments (unused)
     */
    public static void main(String[] args) {
        System.out.println("AREA");
        System.out.println(area(5, 3));
        System.out.println(area(6, 2));
        System.out.println(area(8, 3));
        System.out.println(area(10, 15));
        System.out.println();

        System.out.println("PERIMETER");
        System.out.println(perimeter(10, 15));
        System.out.println();

        System.out.println("PRINT RECTANGLE DETAILS");
        printRectangleDetails(20, 20);
        System.out.println();

        do {
            // User input, using the readInteger method
            int inHeight = readPositiveInteger("Please enter the height of the rectangle: ");
            int inWidth = readPositiveInteger("Please enter the width of the rectangle: ");
            System.out.println();

            System.out.println("READ INTEGER (OUTPUT FROM USER INPUT)");
            printRectangleDetails(inHeight, inWidth);
        } while (keepGoing());
        System.out.println("Exiting...");
    }

    /**
     * Read in an integer and return its value
     * @param prompt to be shown to the user
     * @return the integer that has been read in
     */
    private static int readInteger(String prompt) {
        System.out.print(prompt);

        Scanner scan = new Scanner(System.in);
        while (!scan.hasNextInt()) {    // While non-integers are present...
            scan.next();                // ...read and discard input, then prompt again
            System.out.print("Bad input. Enter an integer: ");
        }
        return scan.nextInt();
    }

    /**
     * Returns the area of a rectangle
     * @param length the length of the rectangle
     * @param width the width of the rectangle
     * @return the area (length * width)
     */
    private static int area(int length, int width) {
        return length * width;
    }

    /**
     * Returns the perimeter of a rectangle
     * @param length the length of the rectangle
     * @param width the width of the rectangle
     * @return the area (2 * (length + width))
     */
    private static int perimeter(int length, int width) {
        return 2 * (length + width);
    }

    /**
     * Returns the height and width of a rectangle, based on user input
     *
     * @param height the height of the rectangle
     * @param width the width of the rectangle
     */
    private static void printRectangleDetails(int height, int width) {
        System.out.println("Height: " + height);
        System.out.println("Width: " + width);
        System.out.println("Area: " + area(height, width));
        System.out.println("Perimeter: " + perimeter(height, width));
    }

    /**
     * Read in an integer greater than 0 and return its value
     *
     * @param prompt to be shown to the user
     * @return the positive integer that was read in
     */
    private static int readPositiveInteger(String prompt) {
        int input = 0;
        boolean running = false;

        while (!running) {
            input = readInteger(prompt);

            if (input <= 0) {
                System.out.print("Bad input. ");
            } else {
                running = true;
            }
        }

        return input;
    }

    /**
     * Ask the user whether or not to continue and returns the result as a boolean
     * @return the result
     */
    private static boolean keepGoing() {
        Scanner scan = new Scanner(System.in);
        String resText;
        boolean result = false, inputRead = false;

        while (!inputRead) {
            System.out.println("\nDo you want to process another rectangle? (y/n)");
            resText = scan.nextLine();

            if (resText.equals("y")) {
                inputRead = true;
                result = true;
            } else if (resText.equals("n")) {
                inputRead = true;
                result = false;
            } else {
                System.out.println("\nPlease enter y or n");
            }
        }
        return result;
    }
}
