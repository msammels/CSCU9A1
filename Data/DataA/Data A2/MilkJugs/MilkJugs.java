/**
 * MilkJugs
 *
 * The MilkJugs program implements an application that calculates how many full bottles of milk we will have based
 * upon the total amount of milk there is and displays the results to the standard output
 *
 * @author Michael Sammels
 * @version 17.09.2018
 */

public class MilkJugs {
    /**
     * The main launcher method
     * @param args Command line arguments (unused)
     */
    public static void main(String[] args) {
        final double MILK_JUGS = 0.75;
        double milk_jugs = 5.5 / MILK_JUGS;

        // For human readability, we will want to remove the decimal place
        String full = Integer.toString((int) milk_jugs);
        System.out.println("There are " + full + " full milk jugs");
    }
}
