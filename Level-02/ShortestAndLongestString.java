import java.util.Scanner;

public class ShortestAndLongestString {

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

    // Method to return a 2D array of words and their corresponding lengths
    public static String[][] getWordsAndLengths(String[] words) {
        // Create a 2D array to store words and their corresponding lengths
        String[][] wordLengthArray = new String[words.length][2];
        
        for (int i = 0; i < words.length; i++) {
            wordLengthArray[i][0] = words[i]; // Store the word
            wordLengthArray[i][1] = String.valueOf(getStringLengthWithoutLengthMethod(words[i])); // Store the length as a String
        }
        
        return wordLengthArray;
    }

    // Method to find the shortest and longest word from the 2D array of words and lengths
    public static int[] findShortestAndLongest(String[][] wordLengthArray) {
        int minLength = Integer.MAX_VALUE;
        int maxLength = Integer.MIN_VALUE;
        int minIndex = -1;
        int maxIndex = -1;

        // Iterate through the array to find the min and max lengths
        for (int i = 0; i < wordLengthArray.length; i++) {
            int length = Integer.parseInt(wordLengthArray[i][1]);

            if (length < minLength) {
                minLength = length;
                minIndex = i;
            }

            if (length > maxLength) {
                maxLength = length;
                maxIndex = i;
            }
        }

        // Return the results as a 1D array: [minLength, maxLength]
        return new int[] { minIndex, maxIndex };
    }

    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Ask the user to enter a text
        System.out.print("Enter text : ");
        String Input = sc.nextLine();

        // Step 1: Use the user-defined method to split the text into words
        String[] words = splitTextUsingCharAt(Input);

        // Step 2: Get the 2D array of words and their corresponding lengths
        String[][] wordsWithLengths = getWordsAndLengths(words);

        // Step 3: Find the shortest and longest words and their indices
        int[] minMaxIndexes = findShortestAndLongest(wordsWithLengths);

        // Step 4: Display the shortest and longest word along with their lengths
        System.out.println("\nShortest word : " + wordsWithLengths[minMaxIndexes[0]][0] + " (Length: " + wordsWithLengths[minMaxIndexes[0]][1] + ")");
        System.out.println("Longest word : " + wordsWithLengths[minMaxIndexes[1]][0] + " (Length: " + wordsWithLengths[minMaxIndexes[1]][1] + ")");
    }
}
