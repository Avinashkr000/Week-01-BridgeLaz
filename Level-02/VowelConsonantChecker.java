import java.util.Scanner;

public class VowelConsonantChecker {

    // Method to check if the character is a Vowel, Consonant, or Not a Letter
    public static String checkCharacterType(char c) {
        // Convert character to lowercase to handle both uppercase and lowercase letters
        c = Character.toLowerCase(c);
        
        // Check if the character is a vowel
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            return "Vowel";
        }
        // Check if the character is a consonant
        else if (c >= 'a' && c <= 'z') {
            return "Consonant";
        }
        // If the character is not a letter
        else {
            return "Not a Letter";
        }
    }

    // Method to process the string and return a 2D array with characters and their types
    public static String[][] processString(String text) {
        // Create a 2D array to store characters and their types (Vowel/Consonant/Not a Letter)
        String[][] result = new String[text.length()][2];
        
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            result[i][0] = String.valueOf(currentChar); // Store the character
            result[i][1] = checkCharacterType(currentChar); // Store its type
        }
        
        return result;
    }

    // Method to display the 2D array of characters and their types in a tabular format
    public static void displayResult(String[][] result) {
        System.out.printf("%-15s %-15s\n", "Character", "Type");
        System.out.println("------------------------------");
        
        for (int i = 0; i < result.length; i++) {
            System.out.printf("%-15s %-15s\n", result[i][0], result[i][1]);
        }
    }

    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Ask the user to enter a string
        System.out.print("Enter a string: ");
        String Input = sc.nextLine();

        // Call the method to process the string and get the results
        String[][] result = processString(Input);

        // Display the results in a tabular format
        displayResult(result);

      
        sc.close();
    }
}
