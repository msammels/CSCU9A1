/**
 * SimpleArithmetic
 *
 * The SimpleArithmetic program implements an application that displays a demonstration of basic addition and
 * subtraction (no multiplication or division at this stage)
 *
 * @author Michael Sammels
 * @version 10.09.2018
 */

public class SimpleArithmetic {
    /**
     * The main launcher method
     * @param args Command line arguments (unused)
     */
    public static void main(String[] args) {
        int clcSum = 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10;
        int clcPro = 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9 * 10;

        System.out.println("The sum of the first ten positive integers is " + clcSum);
        System.out.println("The product of the first ten positive integers is " + clcPro);
    }
}
