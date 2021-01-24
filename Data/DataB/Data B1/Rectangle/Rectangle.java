import java.util.Scanner;

/**
 * Rectangle
 *
 * The Rectangle program implements an application that calculates the hypotenuse of a rectangle and displays the
 * answers to the standard output
 *
 * @author Michael Sammels
 * @version 17.09.2018
 */

public class Rectangle {
    /**
     * The main launcher method
     * @param args Command line arguments (unused)
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the length and width, separated by a space");
        int length = scan.nextInt(), width = scan.nextInt();
        int perimeter = length * 2 + width * 2, area = length * width;

        // Calculate the diagonal of the rectangle using pythagoras theorem
        double diagonal = Math.sqrt(Math.pow(length, 2) + Math.pow(width, 2));

        // Display to the standard output
        System.out.println("Perimeter is " + perimeter);
        System.out.println("Area is " + area);
        System.out.println("Diagonal is " + diagonal);
    }
}
