import java.util.Scanner;

/**
 * ArrayBasics
 *
 * @author Michael Sammels
 * @version 22.10.2018
 */

public class ArrayBasics {
    /**
     * The main launcher method
     * @param args Command line arguments (unused)
     */
    public static void main(String[] args) {
        int[] myArray = randomArray();

        System.out.println("Length of myArray: " + myArray.length);
        System.out.println("Value at index 0: " + myArray[0]);
        System.out.println("Value at index 3: " + myArray[3]);
        System.out.println("Value at index 4: " + myArray[4]);
        System.out.println("Value at index 8: " + myArray[8]);

        myArray[3] = myArray[4];
        System.out.println("Value at index 3: " + myArray[3]);
        System.out.println("Value at index 4: " + myArray[4]);
        System.out.print("\n");

        printArray(myArray);
        System.out.print("\n");

        printBackwards(myArray);
        System.out.print("\n");

        System.out.println("Sum of array integers is: " + sum(myArray));
        System.out.println("Product of array integers is: " + product(myArray));
        System.out.println("Minimum value of array integers is: " + minimum(myArray));
        System.out.print("Enter a number to find: ");

        Scanner scan = new Scanner(System.in);
        int target = scan.nextInt();
        System.out.println(find(myArray, target));
    }

    /**
     * List the indices and values held in the given array
     * @param array an array of integers
     */
    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("index: " + i + " value: " + array[i]);
        }
    }

    /**
     * List the indices and values in an array in reverse order
     * @param array an array of integers
     */
    private static void printBackwards(int[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println("index: " + i + " value: " + array[i]);
        }
    }

    /**
     * Find the sum of all the values held in an integer array
     * @param array an array of integers
     * @return the total sum of the values
     */
    private static int sum(int[] array) {
        int total = 0;

        for (int element : array) {
            total = total + element;
        }

        return total;
    }

    /**
     * Return an array of a given length filled with random integers between given bounds
     * @return the random array
     */
    private static int[] randomArray() {
        int[] array = new int[9];

        for (int i = 0; i < 9; i++) {
            array[i] = (int) (Math.random() * (100 + 1) + 0);
        }

        return array;
    }

    /**
     * Find the product of all the values held in an integer array
     * @param array an array of integers
     * @return the total product
     */
    private static long product(int[] array) {
        long total = 1;

        for (int element : array) {
            total = total * element;
        }

        return total;
    }

    /**
     * Find the minimum value in an array of integers
     * @param array an array of integers
     * @return the minimum value
     */
    private static int minimum(int[] array) {
        int minValue = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
            }
        }

        return minValue;
    }

    /**
     * Search for a given value in an array of integers
     * @param array  an array of integers
     * @param target the value to search for
     * @return -1 if the value is not found
     */
    private static int find(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                System.out.print("Result found at index: ");
                return i;
            }
        }
        System.out.print("Result not found: ");

        return -1;
    }
}
