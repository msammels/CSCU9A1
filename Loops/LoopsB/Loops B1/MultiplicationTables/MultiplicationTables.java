/**
 * MultiplicationTables
 *
 * @author Michael Sammels
 * @version 08.10.2018
 */

public class MultiplicationTables {
    /**
     * The main launcher method
     * @param args Command line arguments (unused)
     */
    public static void main(String[] args) {
        for (int j = 1; j <= 9; j++) {
            for (int i = 1; i <= 10; i++) {
                int product = i * j;
                System.out.println(j + "*" + i + " = " + product);
            }
            System.out.print("\n");
        }
    }
}
