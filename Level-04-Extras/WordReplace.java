import java.util.Scanner;

public class WordReplace {

    public static String replaceWord(String sentence, String oldWord, String newWord) {
        // Replace occurrences of oldWord with newWord in the sentence
        return sentence.replace(oldWord, newWord);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input for the sentence, old word, and new word
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        System.out.print("Enter the word to replace : ");
        String oldWord = sc.nextLine();

        System.out.print("Enter the new word : ");
        String newWord = sc.nextLine();

        // Call the replace method and display the modified sentence
        String modifiedSentence = replaceWord(sentence, oldWord, newWord);
        System.out.println("Modified Sentence : " + modifiedSentence);

        sc.close();
    }
}
