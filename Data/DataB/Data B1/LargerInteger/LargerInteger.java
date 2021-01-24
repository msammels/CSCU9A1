import java.util.Scanner;

/**
 * LargerInteger
 *
 * Program to find the larger of two integers
 *
 * @author Michael Sammels
 * @version 17.09.2018
 */

public class LargerInteger {
    /**
     * The main launcher method
     * @param args Command line arguments (unused)
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter two integers separated by one or more spaces");
        int a = scan.nextInt();
        int b = scan.nextInt();
        System.out.println("The larger integer is " + Math.max(a, b));
    }
}
