import java.util.Scanner;

public class FactorialCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int n = sc.nextInt();

        if (n >= 0) {
            // Initialize factorial result
            int fact = 1;

            // Variable for while
            int i = 1;

            // Calculate factorial using while loop
            while (i <= n) {
                fact *= i; // Multiply the  current value
				
                i++; // Increment
            }

            // Print the result
            System.out.println("The factorial of " + n + " is " + fact);
        } else {
            System.out.println("Please enter a positive integer.");
        }
    }
}
