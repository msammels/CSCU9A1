/**
 * Rectangle
 *
 * The Rectangle program implements an application that calculates the hypotenuse of a rectangle and displays the
 * results to the standard output
 *
 * @author Michael Sammels
 * version 17.09.2018
 */

public class Rectangle {
    /**
     * The main launcher method
     * @param args Command line arguments (unused)
     */
    public static void main(String[] args) {
        int length = 10, width = 20, perimeter = length * 2 + width * 2, area = length * width;

        // Calculate the diagonal of the rectangle, using pythagoras theorem
        double diagonal = Math.sqrt(Math.pow(length, 2) + Math.pow(width, 2));

        System.out.println("Perimeter is " + perimeter);
        System.out.println("Area is " + area);
        System.out.println("Diagonal is " + diagonal);
    }
}
