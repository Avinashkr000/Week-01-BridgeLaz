import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Think of a number between 1 and 100, and I'll try to guess it.");
        
        int low = 1;
        int high = 100;
        int guess = 0;
        String feedback = "";
        
        while (!feedback.equals("correct")) {
            guess = generateGuess(low, high);
            System.out.println("Is the number " + guess + "? (Enter 'high', 'low', or 'correct')");
            feedback = sc.nextLine().toLowerCase();
            
            if (feedback.equals("high")) {
                high = guess - 1;
            } else if (feedback.equals("low")) {
                low = guess + 1;
            } else if (!feedback.equals("correct")) {
                System.out.println("Invalid input! Please enter 'high', 'low', or 'correct'.");
            }
        }
        System.out.println("Yay! I guessed your number.");
        sc.close();
    }
    
    // Function to generate a random guess
    public static int generateGuess(int low, int high) {
        Random random = new Random();
        return random.nextInt(high - low + 1) + low;
    }
}
