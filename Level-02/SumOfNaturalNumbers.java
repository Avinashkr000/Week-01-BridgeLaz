import java.util.Scanner;

public class SumOfNaturalNumbers {

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.print("Enter a natural number (n): ");
        int n = sn.nextInt();

        // Checking if the input is a natural number
        if (n < 0) {
            System.out.println("Invalid input ");
            return;
        }

        // Calculate sum using recursion
        int sumRecursion = sumUsingRecursion(n);
        System.out.println("Sum using recursion : " + sumRecursion);

        // Calculate sum using formula
        int sumFormula = sumUsingFormula(n);
        System.out.println("Sum using formula : " + sumFormula);

        // Compare the results
        if (sumRecursion == sumFormula) {
            System.out.println("Both results are correct and match!");
        } else {
            System.out.println("Results don't match");
        }
    }

    // Recursive method to calculate the sum of n natural numbers
    public static int sumUsingRecursion(int n) {
        if (n == 1) {
            return 1; // Base case
        }
        return n + sumUsingRecursion(n - 1); // Recursive case
    }

    // Method to calculate the sum using the formula n*(n+1)/2
    public static int sumUsingFormula(int n) {
        return n * (n + 1) / 2;
    }
}