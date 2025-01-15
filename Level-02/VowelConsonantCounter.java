import java.util.Scanner;

public class VowelConsonantCounter {

    // Method to check if a character is a vowel, consonant or not a letter
    public static String checkCharacterType(char ch) {
        // Convert character to lowercase if it is uppercase
        ch = Character.toLowerCase(ch);

        // Check if the character is a vowel
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            return "Vowel";
        }
        // Check if the character is a consonant
        else if (ch >= 'a' && ch <= 'z') {
            return "Consonant";
        }
        // If the character is neither a vowel nor a consonant
        else {
            return "Not a Letter";
        }
    }

    // Method to count vowels and consonants in a string
    public static int[] countVowelsAndConsonants(String text) {
        int vowelsCount = 0;
        int consonantsCount = 0;

        // Iterate through the string using charAt() method
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            // Check if the character is a letter (alphabetic)
            if (Character.isLetter(ch)) {
                // Check if it's a vowel or consonant
                String type = checkCharacterType(ch);
                if (type.equals("Vowel")) {
                    vowelsCount++;
                } else if (type.equals("Consonant")) {
                    consonantsCount++;
                }
            }
        }

        // Return the result as an array where index 0 is the count of vowels
        // and index 1 is the count of consonants
        return new int[] { vowelsCount, consonantsCount };
    }

    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Ask the user to enter a text
        System.out.print("Enter the text: ");
        String Input = sc.nextLine();

        // Call the method to count vowels and consonants
        int[] result = countVowelsAndConsonants(Input);

        // Display the result
        System.out.println("\nCount of Vowels : " + result[0]);
        System.out.println("Count of Consonants : " + result[1]);
    }
}
