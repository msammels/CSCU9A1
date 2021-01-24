import java.util.Scanner;

/**
 * CarCalculator
 *
 * The CarCalculator program implements an application that calculates the total cost over five years of owning a
 * car. It does so, based on the following:
 *
 *      - Price of the new car
 *      - Estimated resale value of the car after five years
 *      - Estimated number of miles driven per year
 *      - Fuel efficiency of the car in miles per litre (not MPG)
 *
 * @author Michael Sammels
 * @version 17.09.2018
 */

public class CarCalculator {
    /**
     * The main launcher method
     * @param args Command line arguments (unused)
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double carPrice, carResale;
        int noOfMiles, fuelEfficiency, carDepreciation, totalFuel, totalCost;

        // Collect data from the user
        System.out.print("Enter the cost of the car: £");
        carPrice = scan.nextDouble();

        System.out.print("Enter the resale value: £");
        carResale = scan.nextDouble();

        System.out.print("Enter the estimated number of miles driven per year: ");
        noOfMiles = scan.nextInt();

        System.out.print("Enter the fuel efficiency of the car in MPL: ");
        fuelEfficiency = scan.nextInt();

        // Calculate the depreciation value of the car, over five years
        carDepreciation = (int) (Math.round(carPrice) - Math.round(carResale));

        // Now, figure out the amount of litres of fuel used per year, times five
        totalFuel = (noOfMiles / fuelEfficiency);

        // Next, figure out the cost of the fuel used, and calculate for five years
        totalCost = carDepreciation + totalFuel;

        // And output the final answers to the standard output
        System.out.println("The estimated cost of the car is: £" + totalCost);
    }
}
