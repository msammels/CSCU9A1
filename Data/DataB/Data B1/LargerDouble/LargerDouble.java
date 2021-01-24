import java.util.Scanner;

/**
 * LargerDouble
 *
 * Program to find the larger of two doubles
 *
 * @author Michael Sammels
 * @version 17.09.2018
 */

public class LargerDouble {
    /**
     * The main launcher method
     * @param args Command line arguments (unused)
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two doubles separated by one or more spaces");
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        System.out.println("The larger double is " + Math.max(a, b));
    }
}
