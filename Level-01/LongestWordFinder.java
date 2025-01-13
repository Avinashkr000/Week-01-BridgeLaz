import java.util.Scanner;

public class LongestWordFinder {
    public static String findLongestWord(String sentence) {
        String[] words = sentence.split("\\s+"); // Split the sentence into words
        String longest_Word = "";

        // Iterate through each word to find the longest word
        for (String word : words) {
            if (word.length() > longest_Word.length()) {
                longest_Word = word;
            }
        }

        return longest_Word;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt user for  sentence
        System.out.print("Enter sentence : ");
        String sentence = sc.nextLine();

        // Find Or print the longest word
        String longest_Word = findLongestWord(sentence);
        System.out.println("The longest word is : " + longest_Word);

        sc.close();
    }
}
