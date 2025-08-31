import java.util.Random;
import java.util.Scanner;

    public class number{
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Random random = new Random();

            int totalRounds = 0;
            int roundsWon = 0;

            System.out.println("🎯 Welcome to the Number Guessing Game!");

            boolean playAgain = true;

            while (playAgain) {
                totalRounds++;
                int numberToGuess = random.nextInt(100) + 1; // random number between 1-100
                int attempts = 0;
                int maxAttempts = 7; // limit attempts
                boolean guessedCorrectly = false;

                System.out.println("\nRound " + totalRounds + " started!");
                System.out.println("I have chosen a number between 1 and 100.");
                System.out.println("You have " + maxAttempts + " attempts to guess it!");

                while (attempts < maxAttempts) {
                    System.out.print("Enter your guess: ");
                    int guess = scanner.nextInt();
                    attempts++;

                    if (guess == numberToGuess) {
                        System.out.println("✅ Correct! You guessed the number in " + attempts + " attempts.");
                        guessedCorrectly = true;
                        roundsWon++;
                        break;
                    } else if (guess < numberToGuess) {
                        System.out.println("📉 Too low! Try again.");
                    } else {
                        System.out.println("📈 Too high! Try again.");
                    }

                    System.out.println("Attempts left: " + (maxAttempts - attempts));
                }

                if (!guessedCorrectly) {
                    System.out.println("❌ You ran out of attempts! The number was: " + numberToGuess);
                }

                // Ask if the user wants to play another round
                System.out.print("Do you want to play again? (yes/no): ");
                String response = scanner.next().toLowerCase();
                if (!response.equals("yes")) {
                    playAgain = false;
                }
            }

            // Final Score
            System.out.println("\n🎮 Game Over!");
            System.out.println("Total rounds played: " + totalRounds);
            System.out.println("Rounds won: " + roundsWon);
            System.out.println("Thanks for playing! 😊");

            scanner.close();
        }
    }


