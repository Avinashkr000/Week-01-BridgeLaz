import java.util.Scanner;

public class SplitTextComparison {

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
        
        // First, count the number of words (words are separated by spaces)
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

    // Method to compare two string arrays and return a boolean result
    public static boolean compareStringArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Ask the user to enter a text
        System.out.print("Enter the text: ");
        String Input = sc.nextLine();

        // Step 1: Use the user-defined method to split the text
        String[] wordsUsingCharAt = splitTextUsingCharAt(Input);

        // Step 2: Use the built-in split() method to split the text
        String[] wordsUsingSplitMethod = Input.split(" ");

        // Step 3: Compare the two arrays
        boolean areArraysEqual = compareStringArrays(wordsUsingCharAt, wordsUsingSplitMethod);

        // Step 4: Display the results
        System.out.println("\nWords split using user-defined method (charAt) : ");
        for (String word : wordsUsingCharAt) {
            System.out.println(word);
        }

        System.out.println("\nWords split using built-in split() method : ");
        for (String word : wordsUsingSplitMethod) {
            System.out.println(word);
        }

        // Step 5: Display whether the results are the same
        System.out.println("\nAre both methods' results the same ? " + areArraysEqual);
    }
}
