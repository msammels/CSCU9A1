import java.util.Scanner;

/**
 * WaterState
 *
 * The WaterState program implements an application which reads in temperature and altitude, and reports the
 * state of the liquid to the standard output
 *
 * @author Michael Sammels
 * @version 01.10.2018
 */

public class WaterState {
    /**
     * The main launcher method
     * @param args Command line arguments (unused)
     */
    public static void main(String[] args) {
        final int FREEZING_POINT = 0;
        int boiling_point = 100;
        Scanner scan = new Scanner(System.in);

        System.out.println("What is the temperature (degrees Celsius)?");
        while (!scan.hasNextInt()) {
            System.out.println("Not an integer");
            scan.next();
        }
        int degrees = scan.nextInt();

        System.out.println("What is the altitude (metres above sea level)?");
        while (!scan.hasNextInt()) {
            System.out.println("Not an integer");
            scan.next();
        }
        int altitude = scan.nextInt();

        // Make sure that the altitude is not a negative number
        if (altitude < 0) {
            System.out.println("Altitude must be positive");
            scan.next();
        }

        boiling_point -= altitude / 300;

        if (degrees <= FREEZING_POINT) {
            System.out.println("Water is solid at these conditions");
        } else if (degrees < boiling_point) {
            System.out.println("Water is liquid at these conditions");
        } else {
            System.out.println("Water is gas at these conditions");
        }
    }
}
