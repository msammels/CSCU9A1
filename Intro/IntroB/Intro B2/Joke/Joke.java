import javax.swing.*;

/**
 * Joke
 *
 * The Joke program implements an application that interacts with the user via JOptionPanes in order to tell a joke
 *
 * @author Michael Sammels
 * @version 10.09.2018
 */

public class Joke {
    /**
     * The main launcher method
     * @param args Command line arguments (unused)
     */
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("What is your name?");

        JOptionPane.showInputDialog("Hello, " + name + ". Here is a joke. Knock, knock!");
        JOptionPane.showInputDialog("Beets!");
        JOptionPane.showMessageDialog(null, "Beets, me!");
    }
}
