package GuessTheNumber;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Random random = new Random();
        int randomIntNumber;
        int guessedNumber = 0;
        int countGuesses = 0;
        randomIntNumber = random.nextInt(10) + 1;
        Scanner scanner = new Scanner(System.in);

        while (countGuesses < 3) {
            System.out.println("Press 'r' to restart."
                    + "\nPress 'q' to quit.");
            System.out.print("Guess the number (1-10): ");

            String keyPressed = scanner.nextLine();

            if (keyPressed.matches("^(q|r)")) {
                if (keyPressed.equals("q"))
                    break;
                else if (keyPressed.equals("r"))
                    countGuesses = 0;

            } else if (keyPressed.matches("^(?:[1-9]|0[1-9]|10)$")) {
                guessedNumber = Integer.parseInt(keyPressed);

                if (guessedNumber == randomIntNumber) {
                    System.out.println("You guessed the number!");
                    break;

                } else {
                    countGuesses++;
                    if (countGuesses < 3) {
                        System.out.print("Wrong number. You have " + (3 - countGuesses) + " tries left. Pick a ");
                        if (guessedNumber > randomIntNumber)
                            System.out.println("lower number.");
                        else
                            System.out.println("higher number.");
                    } else
                        System.out.println("You lost. The correct number was " + randomIntNumber);
                }

            } else {
                System.out.println("Please pick a number between 1 and 10. You have " + (3 - countGuesses) + " tries left.");
            }
        }
    }
}