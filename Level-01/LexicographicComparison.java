import java.util.Scanner;

public class LexicographicComparison {
    public static String compareStrings(String str1, String str2) {
        int len1 = str1.length();
        int len2 = str2.length();
        int minLength = Math.min(len1, len2);

        // Compare each character of both string
        for (int i = 0; i < minLength; i++) {
            if (str1.charAt(i) < str2.charAt(i)) {
                return "\"" + str1 + "\" comes before \"" + str2 + "\" in lexicographical order";
            } else if (str1.charAt(i) > str2.charAt(i)) {
                return "\"" + str1 + "\" comes after \"" + str2 + "\" in lexicographical order";
            }
        }

        // If one string is a prefix of the other, the shorter string is smaller
        if (len1 < len2) {
            return "\"" + str1 + "\" comes before \" " + str2 + "\" in lexicographical order ";
        } else if (len1 > len2) {
            return "\"" + str1 + "\" comes after \" " + str2 + "\" in lexicographical order ";
        }

        return "\"" + str1 + "\" and \"" + str2 + "\" are equal";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take two strings as input
        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        // Compare strings lexicographically and print the result
        String result = compareStrings(str1, str2);
        System.out.println(result);

        sc.close();
    }
}
