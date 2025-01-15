import java.util.Scanner;

public class ArrayIndexOutOfBoundsDemo {

    // Method to generate ArrayIndexOutOfBoundsException
    public static void generateArrayIndexOutOfBoundsException(String[] names) {
        // Attempt to access an index larger than the length of the array
        System.out.println(names[5]); // This will throw ArrayIndexOutOfBoundsException if the array has less than 6 elements
    }

    // Method to demonstrate handling ArrayIndexOutOfBoundsException
    public static void handleArrayIndexOutOfBoundsException(String[] names) {
        try {
            // Attempt to access an index larger than the length of the array
            System.out.println(names[5]); // This will throw ArrayIndexOutOfBoundsException if the array has less than 6 elements
        } catch (ArrayIndexOutOfBoundsException e) {
            // Catch the ArrayIndexOutOfBoundsException and handle it
            System.out.println("Caught ArrayIndexOutOfBoundsException: Index is out of range.");
        } catch (RuntimeException e) {
            // Catch any other RuntimeExceptions
            System.out.println("Caught a generic RuntimeException : " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Ask the user to enter the number of names
        System.out.print("Enter the number of names: ");
        int numNames = sc.nextInt();
        sc.nextLine();  // Consume the leftover newline character

        // Define an array to store the names
        String[] names = new String[numNames];

        // Ask the user to enter the names
        System.out.println("Enter " + numNames + " names :");
        for (int i = 0; i < numNames; i++) {
            names[i] = sc.nextLine();
        }

        // Step 1: Demonstrate ArrayIndexOutOfBoundsException
        System.out.println("\nDemonstrating ArrayIndexOutOfBoundsException :");
        generateArrayIndexOutOfBoundsException(names); // This will throw the exception if the index is out of bounds

        // Step 2: Refactor code to handle the exception
        System.out.println("\nDemonstrating handling of ArrayIndexOutOfBoundsException :");
        handleArrayIndexOutOfBoundsException(names); // This will catch and handle the exception
    }
}
