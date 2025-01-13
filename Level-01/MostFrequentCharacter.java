import java.util.Scanner;

public class MostFrequentCharacter {
    public static char findMostFrequentChar(String str) {
        int[] freq = new int[256]; // Array to store frequency of each character (ASCII values)
        int maxFreq = 0; // Variable to track the maximum frequency
        char mostFrequentChar = '\0'; // Variable to store the most frequent character

        // Count frequency of each character
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            freq[currentChar]++;

            // If the current character's frequency is greater than the max, update max and mostFrequentChar
            if (freq[currentChar] > maxFreq) {
                maxFreq = freq[currentChar];
                mostFrequentChar = currentChar;
            }
        }

        return mostFrequentChar;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input from the user
        System.out.print("Enter a string : ");
        String input = sc.nextLine();

        // Find and display the most frequent character
        char result = findMostFrequentChar(input);
        System.out.println("Most Frequent Character :  '" + result + "'");

        sc.close();
    }
}
