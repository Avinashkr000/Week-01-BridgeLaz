import java.util.Scanner;

public class LowerCaseComparison {

    // Method to manually convert the text to lowercase using charAt() and ASCII values
    public static String convertToLowerCaseUsingCharAt(String text) {
        String lowerCaseText = "";
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            // Check if the character is uppercase
            if (c >= 'A' && c <= 'Z') {
                // Convert to lowercase by adjusting the ASCII value
                c = (char) (c + 32); // The difference between ASCII values of 'A' and 'a' is 32
            }
            lowerCaseText += c;  // Concatenate the character to the result string
        }
        return lowerCaseText;
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

        // Step 1: Convert the text to lowercase using the built-in toLowerCase() method
        String lowerCaseUsingBuiltIn = Input.toLowerCase();

        // Step 2: Convert the text to lowercase manually using charAt() and ASCII logic
        String lowerCaseUsingCharAt = convertToLowerCaseUsingCharAt(Input);

        // Step 3: Compare the two strings using the user-defined method
        boolean isEqual = compareStrings(lowerCaseUsingBuiltIn, lowerCaseUsingCharAt);

        // Step 4: Display the results
        System.out.println("\nConverted to Lowercase using built-in toLowerCase() : " + lowerCaseUsingBuiltIn);
        System.out.println("Converted to Lowercase using charAt() method : " + lowerCaseUsingCharAt);
        System.out.println("Are both methods' results the same? " + isEqual);
    }
}
