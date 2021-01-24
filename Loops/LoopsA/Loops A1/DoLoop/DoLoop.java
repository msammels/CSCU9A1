/**
 * DoLoop
 *
 * @author Michael Sammels
 * @version 08.10.2018
 */

public class DoLoop {
    /**
     * The main launcher method
     * @param args Command line arguments (unused)
     */
    public static void main(String[] args) {
        int i = 0;

        do {
            System.out.println("i is " + i);
            i++;
        } while (i < 6);
    }
}
