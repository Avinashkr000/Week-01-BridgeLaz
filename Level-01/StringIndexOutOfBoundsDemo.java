import java.util.Scanner;

public class StringIndexOutOfBoundsDemo {

    // Method to generate StringIndexOutOfBoundsException
    public static void generateStringIndexOutOfBoundsException(String str) {
        // Attempt to access a character at an index that is beyond the length of the string
        System.out.println(str.charAt(str.length())); // This will throw StringIndexOutOfBoundsException
    }

    // Method to demonstrate handling StringIndexOutOfBoundsException
    public static void handleStringIndexOutOfBoundsException(String str) {
        try {
            // Attempt to access a character at an index beyond the length of the string
            System.out.println(str.charAt(str.length())); // This will throw StringIndexOutOfBoundsException
        } catch (StringIndexOutOfBoundsException e) {
            // Catch the exception and handle it
            System.out.println("Caught StringIndexOutOfBoundsException : Index is out of range");
        }
    }

    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Ask the user to enter a string
        System.out.print("Enter string: ");
        String Input = sc.nextLine();

        // Step 1: Demonstrate StringIndexOutOfBoundsException
        System.out.println("\nDemonstrating StringIndexOutOfBoundsException :");
        generateStringIndexOutOfBoundsException(Input); // This will throw an exception and stop the program

        // Step 2: Refactor code to handle the exception
        System.out.println("\nDemonstrating handling of StringIndexOutOfBoundsException :");
        handleStringIndexOutOfBoundsException(Input); // This will catch and handle the exception
    }
}
