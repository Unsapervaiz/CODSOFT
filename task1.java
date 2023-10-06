import java.util.Random;
import java.util.Scanner;

public class task1 {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            Random random = new Random();
            int minRange = 1;
            int maxRange = 100;
            int noofattempts = 8;
            int score = 0;

            System.out.println("Welcome to the game!!!");

            while (true) {
                int targetNumber = random.nextInt(maxRange - minRange + 1) + minRange;
                System.out.println("Select a random number between " + minRange + " and " + maxRange);

                for (int attempts = 1; attempts <= noofattempts; attempts++) {
                    System.out.println("Attempt" + attempts + "- Enter your guess:");
                    int userGuess = sc.nextInt();

                    if (userGuess == targetNumber) {
                        System.out.print("Congratulations! You guessed it right.");
                        score++;
                        break;
                    } else if (userGuess < targetNumber) {
                        System.out.println("Your guess is very low. Try again.");
                    } else {
                        System.out.println("Your guess is very high. Try again.");
                    }
                    if (attempts == noofattempts) {
                        System.out.println("Sorry, number of attempts are over. The correct number is " + targetNumber);
                    }
                }

                System.out.println("Thankyou! Your score is " + score);
                break;

            }
        }
    }
}
