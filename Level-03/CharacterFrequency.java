import java.util.Scanner;

public class CharacterFrequency {

    // Method to find the frequency of characters in a string
    public static String[][] findCharacterFrequency(String str) {
        int[] frequency = new int[256];  // Array to store frequency of characters (ASCII range 0-255)

        // Loop through the string to count the frequency of each character
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            frequency[ch]++;  // Increment the frequency of the character at the ASCII index
        }

        // Create a 2D array to store the characters and their frequencies
        // The 2D array will have two columns: one for characters and one for frequencies
        String[][] result = new String[256][2];
        int index = 0;

        // Populate the 2D array with characters and their frequencies
        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {  // Only include characters that appear at least once
                result[index][0] = String.valueOf((char) i);  // Store the character
                result[index][1] = String.valueOf(frequency[i]);  // Store the frequency
                index++;
            }
        }

        // Resize the result array to remove unused entries
        String[][] resizedResult = new String[index][2];
        System.arraycopy(result, 0, resizedResult, 0, index);

        return resizedResult;
    }

    // Main function to take input and display the result
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Take input string from the user
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        
        // Find the frequency of characters
        String[][] frequencies = findCharacterFrequency(input);
        
        // Display the result
        System.out.println("Character frequencies:");
        for (int i = 0; i < frequencies.length; i++) {
            System.out.println(frequencies[i][0] + ": " + frequencies[i][1]);
        }
    }
}
