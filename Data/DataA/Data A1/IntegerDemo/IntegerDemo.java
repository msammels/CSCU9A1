/**
 * IntegerDemo
 *
 * Program to practice using integer variables
 *
 * @author Michael Sammels
 * @version 17.09.2018
 */

public class IntegerDemo {
    /**
     * The main launcher method
     * @param args Command line arguments (unused)
     */
    public static void main(String[] args) {
        int a = 10;         // Declaration with assignment of initial value
        int b = 23;         // Declaration with assignment of initial value
        int c, d, e;        // Three integer variables declared together
        b = b + 30;         // Assignment statement
        c = 65;             // Assignment statement
        d = a + b;          // Assignment statement

        final int F = 12;   // An integer constant

        // Add your code after this line
        System.out.println("a is " + a);
        System.out.println("b is " + b);
        System.out.println("c is " + c);
        System.out.println("d is " + d);

        a = 15;             // Assignment statement
        e = a + F;

        System.out.println("d is " + d);
        System.out.println("e is " + e);
        System.out.println("F is " + F);
    }
}
