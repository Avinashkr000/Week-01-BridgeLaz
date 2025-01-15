import java.util.Scanner;

public class UpperCaseComparison {

    // Method to manually convert the text to uppercase using charAt() and ASCII values
    public static String convertToUpperCaseUsingCharAt(String text) {
        String upperCaseText = "";
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            // Check if the character is lowercase
            if (c >= 'a' && c <= 'z') {
                // Convert to uppercase by adjusting the ASCII value
                c = (char) (c - 32);
            }
            upperCaseText += c;  // Concatenate the character to the result string
        }
        return upperCaseText;
    }

    // Method to compare two strings using the charAt() method and return a boolean result
    public static boolean compareStrings(String str1, String str2) {
        return str1.equals(str2);  // Compare if both strings are equal
    }

    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Ask the user to enter a string
        System.out.print("Enter the text: ");
        String Input = sc.nextLine();

        // Step 1: Convert the text to uppercase using the built-in toUpperCase() method
        String upperCaseUsingBuiltIn = Input.toUpperCase();

        // Step 2: Convert the text to uppercase manually using charAt() and ASCII logic
        String upperCaseUsingCharAt = convertToUpperCaseUsingCharAt(Input);

        // Step 3: Compare the two strings using the user-defined method
        boolean isEqual = compareStrings(upperCaseUsingBuiltIn, upperCaseUsingCharAt);

        // Step 4: Display the results
        System.out.println("\nConverted to Uppercase using built-in toUpperCase(): " + upperCaseUsingBuiltIn);
        System.out.println("Converted to Uppercase using charAt() method : " + upperCaseUsingCharAt);
        System.out.println("Are both methods' results the same ? " + isEqual);
    }
}
