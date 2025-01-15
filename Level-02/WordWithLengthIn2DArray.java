import java.util.Scanner;

public class WordWithLengthIn2DArray {

    // Method to find the length of a string without using the built-in length() method
    public static int getStringLengthWithoutLengthMethod(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);  // Try to access each character by index
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            return count;
        }
    }

    // Method to split the text into words using charAt() without using the split() method
    public static String[] splitTextUsingCharAt(String text) {
        // Find the length of the string
        int length = getStringLengthWithoutLengthMethod(text);
        
        // Count the number of words (words are separated by spaces)
        int wordCount = 0;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }
        wordCount++;  // The last word is not followed by a space
        
        // Create an array to store the words
        String[] words = new String[wordCount];
        int wordIndex = 0;
        StringBuilder currentWord = new StringBuilder();

        // Loop through the string and extract words
        for (int i = 0; i < length; i++) {
            char c = text.charAt(i);
            if (c == ' ') {
                if (currentWord.length() > 0) {
                    words[wordIndex++] = currentWord.toString();
                    currentWord.setLength(0); // Reset the current word
                }
            } else {
                currentWord.append(c); // Build the current word
            }
        }
        
        // Add the last word (if any)
        if (currentWord.length() > 0) {
            words[wordIndex] = currentWord.toString();
        }
        
        return words;
    }

    // Method to return a 2D array of words and their lengths
    public static String[][] getWordsAndLengths(String[] words) {
        // Create a 2D array to store words and their corresponding lengths
        String[][] wordLengthArray = new String[words.length][2];
        
        for (int i = 0; i < words.length; i++) {
            wordLengthArray[i][0] = words[i]; // Store the word
            wordLengthArray[i][1] = String.valueOf(getStringLengthWithoutLengthMethod(words[i])); // Store the length as a String
        }
        
        return wordLengthArray;
    }

    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Ask the user to enter a text
        System.out.print("Enter the text: ");
        String Input = sc.nextLine();

        // Step 1: Use the user-defined method to split the text into words
        String[] words = splitTextUsingCharAt(Input);

        // Step 2: Get the 2D array of words and their corresponding lengths
        String[][] wordsWithLengths = getWordsAndLengths(words);

        // Step 3: Display the result in a tabular format
        System.out.println("\nWord\t\tLength");
        System.out.println("-------------------------");

        // Display each word and its length
        for (int i = 0; i < wordsWithLengths.length; i++) {
            // Convert the length from String to Integer and display
            int length = Integer.parseInt(wordsWithLengths[i][1]);
            System.out.println(wordsWithLengths[i][0] + "\t\t" + length);
        }
    }
}
