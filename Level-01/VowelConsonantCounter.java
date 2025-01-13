import java.util.Scanner;

public class VowelConsonantCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = sc.nextLine();
        s = s.toLowerCase();
        int vowels = countVowels(s);
        int consonants = countConsonants(s);
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        sc.close();
    }

    public static int countVowels(String s) {
        int vowels = 0;
        String vowelsList = "aeiou";
        for (int i = 0; i < s.length(); i++) {
            if (vowelsList.indexOf(s.charAt(i)) != -1) {
                vowels++;
            }
        }
        return vowels;
    }

    public static int countConsonants(String s) {
        int consonants = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'a' && c <= 'z' && "aeiou".indexOf(c) == -1) {
                consonants++;
            }
        }
        return consonants;
    }
}
