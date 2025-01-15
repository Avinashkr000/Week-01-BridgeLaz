import java.util.Scanner;

public class CharacterFrequencyUsingUnique {

    // Method to find unique characters using charAt() and return them in a 1D array
    public static char[] uniqueCharacters(String str) {
        // First, find the length of the string
        int length = str.length();
        
        // Create a 1D array to store unique characters
        char[] uniqueChars = new char[length];
        int index = 0;
        
        // Outer loop to iterate through each character
        for (int i = 0; i < length; i++) {
            char currentChar = str.charAt(i);
            boolean isUnique = true;

            // Inner loop to check if the character already exists in the unique array
            for (int j = 0; j < index; j++) {
                if (uniqueChars[j] == currentChar) {
                    isUnique = false;
                    break;
                }
            }

            // If the character is unique, add it to the uniqueChars array
            if (isUnique) {
                uniqueChars[index] = currentChar;
                index++;
            }
        }
        
        // Create a new array of exact size for the unique characters
        char[] result = new char[index];
        System.arraycopy(uniqueChars, 0, result, 0, index);
        return result;
    }

    // Method to find the frequency of characters using their ASCII values and return a 2D array
    public static String[][] findCharacterFrequency(String str) {
        int[] frequency = new int[256];  // Array to store frequency of characters (ASCII range 0-255)

        // Loop through the string to count the frequency of each character
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            frequency[ch]++;  // Increment the frequency at the ASCII index
        }

        // Find the unique characters in the string
        char[] uniqueChars = uniqueCharacters(str);

        // Create a 2D array to store characters and their frequencies
        String[][] result = new String[uniqueChars.length][2];
        
        // Loop through the unique characters and store their frequencies
        for (int i = 0; i < uniqueChars.length; i++) {
            char ch = uniqueChars[i];
            result[i][0] = String.valueOf(ch);  // Store the character
            result[i][1] = String.valueOf(frequency[ch]);  // Store the frequency
        }

        return result;
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
