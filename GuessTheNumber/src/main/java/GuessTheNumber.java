import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {

        Random randomFloatNumber = new Random();
        int randomIntNumber;
        int i = 0;
        randomIntNumber = randomFloatNumber.nextInt(10) + 1;
        Scanner scanner = new Scanner(System.in);

        while (i < 3) {
            System.out.print("Guess the number: ");
            int guessedNumber = scanner.nextInt();

            if (guessedNumber == randomIntNumber) {
                System.out.println("You guessed the number!");
                break;
            } else if (guessedNumber > randomIntNumber) {
                i++;
                if (i < 3) {
                    System.out.println("You have " + (3 - i) + " tries left");
                    System.out.println("Pick a lower number.");
                } else
                    System.out.println("You lost.");
            } else {
                i++;
                if (i < 3) {
                    System.out.println("You have " + (3 - i) + " tries left");
                    System.out.println("Pick a higher number.");
                } else
                    System.out.println("You lost.");
            }
        }
    }
}