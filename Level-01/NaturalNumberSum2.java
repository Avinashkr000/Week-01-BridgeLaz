import java.util.Scanner;

public class NaturalNumberSum2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int n = input.nextInt();

        if (n > 0) {
            // Sum using the formula
            int sumForm = n * (n + 1) / 2;

            // Sum using The loop
            int SumLoop = 0;
            for (int i = 1; i <= n; i++) {
                SumLoop += i;
            }

            // Print the  results
            System.out.println("Sum using formula: " + sumForm);
            System.out.println("Sum using for loop: " + SumLoop);

            // Compare results
            if (sumForm == SumLoop) {
                System.out.println("Both computations are correct!");
            }
        } else {
            System.out.println("Please enter a -ve integer");
        }
    }
}
