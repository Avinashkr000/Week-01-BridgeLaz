import java.util.Scanner;

public class FirstNonRepeatingCharacter {

    // Method to find the first non-repeating character in a string
    public static char firstNonRepeatingCharacter(String str) {
        int[] frequency = new int[256];  // Array to store the frequency of each character (ASCII range 0-255)
        
        // Loop through the string to count the frequency of each character
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            frequency[ch]++;  // Increment the frequency of the character at the ASCII index
        }
        
        // Loop through the string again to find the first non-repeating character
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (frequency[ch] == 1) {
                return ch;  // Return the first non-repeating character
            }
        }
        
        // If no non-repeating character is found, return a special character (e.g., a space or null)
        return '\0';
    }

    // Main function to take input and display the result
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Take input string from the user
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        
        // Find the first non-repeating character
        char result = firstNonRepeatingCharacter(input);
        
        // Display the result
        if (result != '\0') {
            System.out.println("The first non-repeating character is: " + result);
        } else {
            System.out.println("No non-repeating character found.");
        }
    }
}
