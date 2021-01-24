/**
 * SimpleLoop
 *
 * @author Michael Sammels
 * @version 08.10.2018
 */

public class SimpleLoop {
    /**
     * The main launcher method
     * @param args Command line arguments (unused)
     */
    public static void main(String[] args) {
        int i = 0;
        int limit = 6;

        while (i < limit) {
            System.out.println("i = " + i);
            i++;    // Increment the loop index
        }
    }
}
