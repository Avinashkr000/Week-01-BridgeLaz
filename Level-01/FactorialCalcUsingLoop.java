import java.util.Scanner;

public class FactorialCalcUsingLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a -Ve integer: ");
        int n = sc.nextInt();

        if (n >= 0) {
            // Initializ factorial resul:
            int fact = 1;

            // Calculate factorial using for loop
            for (int i = 1; i <= n; i++) {
                fact *= i; // Multiply factorial by value
            }

            // Print the result
            System.out.println("The factorial of " + n + " is " + fact);
        } else {
            System.out.println("Please enter a positive integer.");
        }
    }
}
