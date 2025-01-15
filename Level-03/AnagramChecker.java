import java.util.Scanner;

public class AnagramChecker {

    // Method to check if two strings are anagrams
    public static boolean areAnagrams(String text1, String text2) {
        // If lengths are not equal, they cannot be anagrams
        if (text1.length() != text2.length()) {
            return false;
        }

        // Create arrays to store frequency of characters for both strings
        int[] frequency1 = new int[256]; // ASCII character set size
        int[] frequency2 = new int[256];

        // Loop through both strings and count the frequency of each character
        for (int i = 0; i < text1.length(); i++) {
            frequency1[text1.charAt(i)]++; // Increment the frequency for text1
            frequency2[text2.charAt(i)]++; // Increment the frequency for text2
        }

        // Compare the frequency arrays
        for (int i = 0; i < 256; i++) {
            if (frequency1[i] != frequency2[i]) {
                return false;  // If frequencies don't match, they are not anagrams
            }
        }

        return true;  // If all frequencies match, they are anagrams
    }

    // Main method to take user input and display the result
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input for two strings
        System.out.print("Enter the first text: ");
        String text1 = sc.nextLine();

        System.out.print("Enter the second text: ");
        String text2 = sc.nextLine();

        // Check if the strings are anagrams using the areAnagrams method
        boolean result = areAnagrams(text1, text2);

        // Display the result
        if (result) {
            System.out.println("The two texts are anagrams");
        } else {
            System.out.println("The two texts are not anagrams");
        }

        sc.close();
    }
}
