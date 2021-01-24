import java.util.Random;
import java.util.Scanner;

/**
 * Mastermind
 *
 * A programming challenge
 *
 * @author Michael Sammels
 * @version 22.10.2018
 */

public class Mastermind {
    /**
     * The main launcher method
     * @param args Command line arguments (unused)
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input;
        boolean quit = false;
        boolean first = true;

        // Array of the allowed colours
        final String[] colours = {"R", "O", "Y", "G", "B", "P"};


        System.out.print("Welcome to the game of Mastermind!\n" +
                "I will choose a secret code of four colours.\n" +
                "The colours can be (R)ed, (O)range, (Y)ellow, (G)reen, (B)lue, (P)urple\n" +
                "You have 12 attempts to try to guess my code.\n" +
                "Enter your guess like this example: BYYG\n" +
                "After each guess, I will tell you how well you have done.\n" +
                "o means that you have guessed a correct colour in the wrong position.\n" +
                "* means that you have guessed a correct colour in the right position.\n" +
                "Would you like to play a game (y/n)?)\n\n");

        // Game continuation loop
        while (!quit) {
            String code = generateSecretCode(colours);  // Sets the generated code
            input = scan.nextLine().toLowerCase();

            // If "test" is entered, print the code out first, for debugging purposes
            switch (input) {
                case "test":
                    if (first) {
                        System.out.println(code);
                        first = false;
                    }
                    playGame(code);
                    break;

                // If "y" is entered, start the game by calling playGame()
                case "y":
                    playGame(code);
                    break;

                // If "n" is entered, quit the game
                case "n":
                    System.out.println("Exiting...");
                    quit = true;
                    break;

                // Error handling
                default:
                    System.out.println("Bad input. Please enter y or n");
                    break;
            }
        }
    }

    /**
     * Randomly generate the secret code
     * @param array array of available colours
     * @return the secret code as a string
     */
    private static String generateSecretCode(String[] array) {
        Random generator = new Random();            // Pick a random number
        StringBuilder code = new StringBuilder();   // Secret code generated (returned)
        int index;                                  // Array index
        int codeLength = 4;                         // Allowed length of secret code

        // Picks a random sequence using a random index number pointing to a place in the array
        for (int i = 0; i < codeLength; i++) {
            index = generator.nextInt(array.length);
            code.append(array[index]);
        }
        return code.toString();
    }

    /**
     * Main handling of the games logic
     * @param code the secret code
     */
    private static void playGame(String code) {
        int gameGuesses = 12;
        int displayGuesses = 1;
        boolean done = false;
        char[] codeChars = code.toCharArray();    // Converts the secret code to an array of each character

        // Continue until guessed correctly, or the user runs out of guesses
        while (!done) {
            if (gameGuesses > 0) {
                System.out.println("\nYou have " + gameGuesses + " left.");
                char[] userChars = getInput().toCharArray();  // Converts user input to an array of each character

                // Takes the feedback from the user. 0 = black peg, 1 = white peg
                int[] feedback = getFeedback(codeChars, userChars);

                if (feedback[0] == 4) {
                    System.out.println("Congratulations, you won in " + displayGuesses + " guesses!");
                    done = true;
                } else {
                    for (int i = 0; i < 4; i++) {
                        if (feedback[0] > 0) {
                            // Displays black feedback pins
                            System.out.print("*");
                            feedback[0]--;
                        } else if (feedback[1] > 0) {
                            // Displays white feedback pins
                            System.out.print("o");
                            feedback[1]--;
                        }
                    }
                    gameGuesses--;      // A turn is over, so decrease remaining guesses by 1
                    displayGuesses++;   // Increment the users guess count by 1
                }
            } else {
                System.out.println("\nYou have run out of guesses. You have lost.\nThe secret code was " + code);
                done = true;
            }
        }
        System.out.println("Would you like to play again (y/n)?");
    }

    /**
     * Compares the users guess to the code and provides feedback
     * @param guess the users guess, code: the users code
     * @return the result
     */
    private static int[] getFeedback(char[] code, char[] guess) {
        char[] tempCode = new char[4];
        char[] tempGuess = new char[4];

        for (int i = 0; i < 4; i++) {
            tempCode[i] = code[i];
            tempGuess[i] = guess[i];
        }

        int blackPegs = 0;
        for (int i = 0; i < code.length; i++) {
            if (tempCode[i] == tempGuess[i]) {
                // If the guess is the same colour and position as the code, assign a black peg
                blackPegs++;
                tempCode[i] = 'A';      // Indicates placement has been handled
                tempGuess[i] = 'A';     // Indicates corresponding placement has been handled
            }
        }

        int whitePegs = 0;
        for (int i = 0; i < code.length; i++) {
            if (tempCode[i] == 'A') {
                //If code value is A it has been previously handled with a black peg, so is skipped
                continue;
            }

            // If guess value is A it has been previously handled with a black peg, so is skipped
            for (int j = 0; j < code.length; j++)
                if (tempGuess[j] != 'A' && tempCode[i] == tempGuess[j]) {
                    // If a guess value matches a code value colour, assign a white peg
                    whitePegs++;
                    tempCode[i] = 'A';      // Shows code value has been handled, skip it
                    tempGuess[j] = 'A';     // Shows guess value has been handled, skip it
                }
        }

        int[] result = new int[2];  // Create a new array for feedback
        result[0] = blackPegs;      // Index 0 = number of black pegs (for use in playGame() displaying *)
        result[1] = whitePegs;      // Index 1 = number of white pegs (for use in playGame() displaying o)

        return result;
    }

    /**
     * Gets an input from the user checking that it is valid
     * @return the guess as a string
     */
    private static String getInput() {
        Scanner scan = new Scanner(System.in);
        boolean validInput = false;
        String guess = null;    // User input

        while (!validInput) {
            System.out.println("Please enter your guess. Valid colours are ROYGBP");
            guess = scan.nextLine().toUpperCase();

            // Checks that the guess contains only the valid colours and is no more than 4 characters long
            if (guess.matches("[ROYGBP]+") && guess.length() == 4) {
                validInput = true;
            } else {
                System.out.println("Please enter valid input");
            }
        }
        return guess;
    }
}
