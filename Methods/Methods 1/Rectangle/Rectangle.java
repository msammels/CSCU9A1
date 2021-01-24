import java.util.Scanner;

/**
 * Rectangle
 *
 * @author Michael Sammels
 * @version 15.10.2018
 */

public class Rectangle {
    /**
     * The main launcher method
     * @param args Command line arguments (unused)
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int inHeight, inWidth;

        System.out.println(area(5, 3));
        System.out.println(area(6, 2));
        System.out.println(area(8, 3));
        System.out.println(area(10, 15));
        System.out.println(perimeter(10, 15));

        // Take user input for the rectangle details
        System.out.print("Please enter the rectangle height: ");
        inHeight = scan.nextInt();

        System.out.print("Please enter the rectangle width: ");
        inWidth = scan.nextInt();

        // And print out the results
        printRectangleDetails(inHeight, inWidth);
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
     * @return the perimeter
     */
    private static int perimeter(int length, int width) {
        return 2 * (length + width);
    }


    /**
     * Returns the details of a rectangle, based on user input
     * @param height the height of the rectangle
     * @param width the width of the rectangle
     */
    private static void printRectangleDetails(int height, int width) {
        System.out.println("Height: " + height);
        System.out.println("Width: " + width);
        System.out.println("Area: " + area(height, width));
        System.out.println("Perimeter: " + perimeter(height, width));
    }
}
