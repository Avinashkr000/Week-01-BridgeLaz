import java.util.Scanner;

public class StringLengthWithoutLengthMethod {

    // Method to find and return the length of a string without using the length() method
    public static int getStringLengthWithoutLengthMethod(String text) {
        int count = 0;
        try {
            // Loop through the string and count the characters using charAt()
            while (true) {
                text.charAt(count);  // Try to access each character by index
                count++;  // Increment the count for each character
            }
        } catch (StringIndexOutOfBoundsException e) {
            // When the exception occurs, return the count (length of the string)
            return count;
        }
    }

    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Ask the user to enter a string
        System.out.print("Enter the text: ");
        String Input = sc.next();

        // Step 1: Find the length using the user-defined method
        int lengthWithoutMethod = getStringLengthWithoutLengthMethod(Input);

        // Step 2: Find the length using the built-in length() method
        int lengthWithMethod = Input.length();

        // Step 3: Display the results
        System.out.println("\nLength of the string using user-defined method : " + lengthWithoutMethod);
        System.out.println("Length of the string using built-in length() method : " + lengthWithMethod);
    }
}
