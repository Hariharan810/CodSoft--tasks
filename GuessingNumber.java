import java.util.Random;
import java.util.Scanner;

public class GuessingNumber {

    public static void main(String[] args) {

        // Generate a random number
        Random random = new Random();
        int number = random.nextInt(101);

        // Prompt the user to guess the number
        System.out.print("Guess a number between 1 and 100: ");
        Scanner scan=new Scanner(System.in);
        int guess = scan.nextInt();

        // Score
        int score=10;

        // Setting limits for guessing number
        int count=0;
        int chances=10;

        // Check if the guess is correct
        while (guess != number) {
            if (guess < number) {
                System.out.println("Your guess is too low❗.");
                System.out.println("------------------------");
                count++;
                score--;
                chances--;
            } else {
                System.out.println("Your guess is too high❗.");
                System.out.println("--------------------------");
                count++;
                score--;
                chances--;
            }

            // Limiting the guess
            if(count>=10){
                System.out.println("Your chances are over");
                System.out.println("Your score: "+score);
                System.out.println("Try Again..");
                break;
            }

            // Prompt the user to guess again
            else {
                System.out.println("Chances left: "+chances);
                System.out.print("Guess again: ");
                guess = scan.nextInt();
            }
        }


        // The user guessed the correct number!
        if(guess==number) {
            System.out.println("---------------------------------------------------");
            System.out.println("Congratulations! You guessed the correct number!🤩");
            System.out.println("Your score: "+score);
        }
    }
}
