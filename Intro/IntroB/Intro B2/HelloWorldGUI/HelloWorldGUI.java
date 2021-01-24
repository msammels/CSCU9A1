import javax.swing.*;

/**
 * HelloWorldGUI
 *
 * The HelloWorldGUI program implements an application that displays the traditional first-world message to a
 * message dialog
 *
 * @author Michael Sammels
 * @version 10.09.2018
 */

public class HelloWorldGUI {
    /**
     * The main launcher method
     * @param args Command line arguments (unused)
     */
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Hello, World!");
    }
}
