import java.util.Scanner;

/**
 * Seasons
 *
 * The Seasons program implements an application which reads in a day and month of a year, and reports which season
 * it is in to the standard output
 *
 * @author Michael Sammels
 * @version 01.10.2018
 */

public class Seasons {
    /**
     * The main launcher method
     * @param args Command line arguments (unused)
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter day and month (in dd mm format)");
        int day = scan.nextInt();
        int month = scan.nextInt();
        boolean validDate = true;
        int daysInMonth = 31;

        if (month < 1 || month > 12 || day < 1 || day > daysInMonth) {
            validDate = false;
        }

        if (validDate) {
            String season;
            if (month == 1 || month == 2 || month == 3) {
                season = "Winter";
            } else if (month == 4 || month == 5 || month == 6) {
                season = "Spring";
            } else if (month == 7 || month == 8 || month == 9) {
                season = "Summer";
            } else {
                season = "Autumn";
            }

            if ((month % 3 == 0) && (day > 21)) {
                if (season.equals("Winter")) {
                    season = "Spring";
                } else if (season.equals("Summer")) {
                    season = "Autumn";
                } else {
                    season = "Winter";
                }
            }
            System.out.println("The season is " + season);
        } else {
            System.out.println("Invalid date entered. Try again.");
        }
    }
}
