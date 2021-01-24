/**
 * SimpleNestedForLoop
 *
 * @author Michael Sammels
 * @version 08.10.2018
 */

public class SimpleNestedForLoop {
    /**
     * The main launcher method
     * @param args Command line arguments (unused)
     */
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.println(i + " " + j);
            }
        }
    }
}
