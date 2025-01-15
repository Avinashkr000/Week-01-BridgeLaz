import java.util.Scanner;

public class IllegalArgumentDemo {

    // Method to generate IllegalArgumentException
    public static void generateIllegalArgumentException(String str) {
        // Attempt to get a substring with the start index greater than the end index
        // This will throw an IllegalArgumentException
        System.out.println(str.substring(5, 2)); // Start index is greater than the end index
    }

    // Method to demonstrate handling IllegalArgumentException
    public static void handleIllegalArgumentException(String str) {
        try {
            // Attempt to get a substring with the start index greater than the end index
            // This will throw an IllegalArgumentException
            System.out.println(str.substring(5, 2)); // Start index is greater than the end index
        } catch (IllegalArgumentException e) {
            // Catch the IllegalArgumentException and handle it
            System.out.println("Caught IllegalArgumentException: Start index is greater than end index.");
        } catch (RuntimeException e) {
            // Catch any other RuntimeExceptions
            System.out.println("Caught a generic RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Ask the user to enter a string
        System.out.print("Enter a string: ");
        String Input = sc.nextLine();

        // Step 1: Demonstrate IllegalArgumentException
        System.out.println("\nDemonstrating IllegalArgumentException:");
        generateIllegalArgumentException(Input); // This will throw the exception and stop the program

        // Step 2: Refactor code to handle the exception
        System.out.println("\nDemonstrating handling of IllegalArgumentException:");
        handleIllegalArgumentException(Input); // This will catch and handle the exception
    }
}
