import java.util.Scanner;

public class UniqueCharacters {

    // Method to find the length of the string without using String length() method
    public static int getStringLength(String str) {
        int length = 0;
        // Using charAt to iterate over each character in the string until we reach the end
        try {
            while (true) {
                str.charAt(length);
                length++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // Exception occurs when we reach the end of the string
        }
        return length;
    }

    // Method to find unique characters using charAt() method and return them in a 1D array
    public static char[] findUniqueCharacters(String str) {
        int length = getStringLength(str);  // Get the length of the string
        char[] result = new char[length];   // Array to store unique characters
        int resultIndex = 0;  // Pointer for the result array
        
        // Loop through each character in the string
        for (int i = 0; i < length; i++) {
            char currentChar = str.charAt(i);
            boolean isUnique = true;
            
            // Nested loop to check if the character has already been encountered
            for (int j = 0; j < i; j++) {
                if (str.charAt(j) == currentChar) {
                    isUnique = false;
                    break;
                }
            }
            
            // If the character is unique, add it to the result array
            if (isUnique) {
                result[resultIndex] = currentChar;
                resultIndex++;
            }
        }
        
        // Create a new array with the exact size to store only the unique characters
        char[] uniqueChars = new char[resultIndex];
        System.arraycopy(result, 0, uniqueChars, 0, resultIndex);
        
        return uniqueChars;
    }

    // Main function to take input and display the result
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Take input string from the user
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        
        // Find unique characters
        char[] uniqueChars = findUniqueCharacters(input);
        
        // Display the result
        System.out.print("Unique characters: ");
        for (char c : uniqueChars) {
            System.out.print(c + " ");
        }
    }
}
