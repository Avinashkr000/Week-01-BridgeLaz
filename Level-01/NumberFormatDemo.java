import java.util.Scanner;

public class NumberFormatDemo {

    // Method to generate NumberFormatException
    public static void generateNumberFormatException(String text) {
        // Attempt to convert a string that is not a valid number to an integer
        int number = Integer.parseInt(text); // This will throw NumberFormatException if text is not a valid number
        System.out.println("Converted number: " + number);
    }

    // Method to demonstrate handling NumberFormatException
    public static void handleNumberFormatException(String text) {
        try {
            // Attempt to convert a string that is not a valid number to an integer
            int number = Integer.parseInt(text); // This will throw NumberFormatException if text is not a valid number
            System.out.println("Converted number : " + number);
        } catch (NumberFormatException e) {
            // Catch the NumberFormatException and handle it
            System.out.println("Caught NumberFormatException: Input is not a valid number");
        } catch (RuntimeException e) {
            // Catch any other RuntimeExceptions
            System.out.println("Caught a generic RuntimeException : " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Ask the user to enter a string (that could potentially cause a NumberFormatException)
        System.out.print("Enter a string: ");
        String Input = sc.nextLine();

        // Step 1: Demonstrate NumberFormatException
        System.out.println("\nNumberFormatException :");
        generateNumberFormatException(Input); // This will throw the exception and stop the program

        // Step 2: Refactor code to handle the exception
        System.out.println("\nDemonstrating handling of NumberFormatException :");
        handleNumberFormatException(Input); // This will catch and handle the exception
    }
}
