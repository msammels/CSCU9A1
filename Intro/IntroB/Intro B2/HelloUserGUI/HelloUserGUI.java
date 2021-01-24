import javax.swing.*;

/**
 * HelloUserGUI
 *
 * The HelloUserGUI program implements an application that displays the users name as input by the user
 *
 * @author Michael Sammels
 * @version 10.09.2018
 */

public class HelloUserGUI {
    /**
     * The main launcher method
     * @param args Command line arguments (unused)
     */
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("What is your name?");
        JOptionPane.showMessageDialog(null, "Hello " + name + "!");
    }
}
