import java.util.Scanner;

public class CharacterFrequencyWithNestedLoops {

    // Method to find the frequency of characters using nested loops
    public static String[] findCharacterFrequency(String str) {
        // Convert the string to a character array
        char[] chars = str.toCharArray();
        
        // Array to store the frequency of each character
        int[] frequency = new int[chars.length];
        
        // Array to store the characters
        char[] uniqueChars = new char[chars.length];
        int uniqueCount = 0;
        
        // Outer loop to iterate over each character in the string
        for (int i = 0; i < chars.length; i++) {
            // If the character is already counted (marked as '0'), skip it
            if (chars[i] == '0') {
                continue;
            }
            
            // Initialize the frequency of the character
            frequency[i] = 1;
            
            // Inner loop to check for duplicates and count their occurrences
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    // Increment the frequency and mark the character as '0' to avoid recounting
                    frequency[i]++;
                    chars[j] = '0';  // Mark the duplicate character
                }
            }
            
            // Add the unique character to the uniqueChars array
            uniqueChars[uniqueCount] = chars[i];
            uniqueCount++;
        }

        // Create a result array to store characters and their frequencies
        String[] result = new String[uniqueCount];
        
        // Populate the result array with the characters and their frequencies
        for (int i = 0; i < uniqueCount; i++) {
            result[i] = uniqueChars[i] + ": " + frequency[i];
        }
        
        return result;
    }

    // Main function to take input and display the result
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Take input string from the user
        System.out.print("Enter string : ");
        String input = sc.nextLine();
        
        // Find the frequency of characters
        String[] frequencies = findCharacterFrequency(input);
        
        // Display the result
        System.out.println("Character frequencies :");
        for (String frequency : frequencies) {
            System.out.println(frequency);
        }
    }
}
