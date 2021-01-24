/**
 * PrintXs
 *
 * @author Michael Sammels
 * @version 08.10.2018
 */

public class PrintXs {
    /**
     * The main launcher method
     * @param args Command line arguments (unused)
     */
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("X ");
            }

            System.out.println();
        }
    }
}
