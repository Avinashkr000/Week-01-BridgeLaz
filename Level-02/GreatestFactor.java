import java.util.Scanner;

public class GreatestFactor {

    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Input the number
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Initialize greatestFactor variable to 1
        int greatest_Factor = 1;

        // Loop from number - 1 down to 1
        for (int i = num - 1; i >= 1; i--) {
            // Check if i is factor of the number
            if (num % i == 0) {
                greatest_Factor = i; // Assign i as the greatest factor
                break; // Exit the loop as we found the greatest factor
            }
        }

        // Output of  greatest factor
        System.out.println("The greatest factor of " + num + " is : " + greatest_Factor);
    }
}
