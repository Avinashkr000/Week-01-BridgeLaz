import java.util.Scanner;

public class FizzBuzzWhileLoop {

    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Input the number
        System.out.print("Enter a positive integer: ");
        int num = sc.nextInt();

        // Check if the number is positive
        if (num > 0) {
            int i = 1; // Start from one
            // Use while loop to iterate through the numbers
            while (i <= num) {
                // Check if the number is divisible by both 3 and 5
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                }
                // Check if the number is divisible by 3
                else if (i % 3 == 0) {
                    System.out.println("Fizz");
                }
                // Check if the number is divisible by 5
                else if (i % 5 == 0) {
                    System.out.println("Buzz");
                }
                // If it's not divisible by 3 or 5, print the number
                else {
                    System.out.println(i);
                }
                i++; // Increment the counter
            }
        } else {
            System.out.println("Please enter a positive integer.");
        }
    }
}
