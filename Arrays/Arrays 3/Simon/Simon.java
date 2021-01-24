import java.util.Scanner;

/**
 * Simon
 *
 * A version of the game "Simon"
 *
 * @author Michael Sammels
 * @version 22.10.2018
 */

public class Simon {
    /**
     * The main launcher method
     * @param args Command line arguments (unused)
     */
    public static void main(String[] args) {
        int score = 1;
        boolean lost = false;
        int[] sequence = createSequence();  // Create an array with random digits in the range 1 to 10

        System.out.println("Welcome to the game of Simon!");

        while (!lost) {
            System.out.println("Memorize these numbers:");
            printSequence(sequence, score);

            // Sleep for 3 seconds
            delay();
            clearScreen();

            if (!readSequence(score, sequence)) {
                lost = true;
                System.out.println("Wrong!");
                System.out.println("Your score is " + score);
            } else {
                System.out.println("Correct!");
                score++;
            }
        }
    }

    /**
     * Creates a randomised sequence of 10 numbers ranging from 1 to 10
     * @return the sequence as an array
     */
    private static int[] createSequence() {
        int[] array = new int[10];

        for (int i = 0; i < 10; i++) {
            array[i] = (int) (Math.random() * (9 + 1) + 0);
        }

        return array;
    }

    /**
     * Prints the sequence to be memorized
     * @param array generated through createSequence()
     * @param score score handled in main()
     */
    private static void printSequence(int[] array, int score) {
        for (int i = 0; i < score; i++) {
            System.out.print(array[i] + " ");
        }
    }

    /**
     * Reads in user input each round and compares to the provided sequence. If all correct, returns true, otherwise
     * it returns false
     * @param score determines amount of inputs needed and also amount to compare with
     * @param array the sequence
     * @return true if correct, false if incorrect
     */
    private static boolean readSequence(int score, int[] array) {
        Scanner scan = new Scanner(System.in);
        boolean correct = false;            // True if the user matches the sequence
        int correctCount = 0;               // Compares amount of correct inputs to the amount needed
        int[] userInputs = new int[score];  // Array containing user inputs to be compared to the sequence

        System.out.println("Type in the numbers you saw. Use spaces to separate them.");
        for (int i = 0; i < score; i++) {
            if (scan.hasNext()) {
                int input = scan.nextInt();
                userInputs[i] = input;
            } else {
                return false;
            }
        }

        // Compares user input to the sequence
        for (int j = 0; j < score; j++) {
            if (userInputs[j] == array[j]) {
                correctCount++;
            }
        }

        // Sequence only correct if counter is equal to amount of inputs needed
        if (correctCount == score) {
            correct = true;
        }

        return correct;
    }

    /**
     * Delay execution of program a given time
     */
    private static void delay() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println("Sleep interrupted!");
        }
    }

    /**
     * Clear the console by printing a form feed character
     */
    private static void clearScreen() {
        //System.out.print('\u000C');

        /*
         * Workaround for non-BlueJ IDEs.
         * Either comment out this, or the command above
         * depending on the editor used
         */
        for (int i = 0; i < 1000; i++) {
            System.out.println();
        }
    }
}
