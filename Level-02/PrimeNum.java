import java.util.Scanner;

public class PrimeNum{

    public static void main(String[] args) {
        // scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Input number to check
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
		
        boolean prime = true;

        // Numbers less than or equal to 1 are not prime
        if (number <= 1) {
            prime = false;
        } else {
            // Loop through numbers from 2 to (number - 1)
            for (int i = 2; i <= number / 2; i++) {
                // If the number is divisible by i , it not a prime
                if (number % i == 0) {
                    prime = false;
                    break; // Exit the loop as the number is not prime
                }
            }
        }

        // Output the result
        if (prime) {
            System.out.println(number + " is prime number.");
        } else {
            System.out.println(number + " is not prime number.");
        }
    }
}
