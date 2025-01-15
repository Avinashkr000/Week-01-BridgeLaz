import java.util.Scanner;

public class SubstringComparison {

    // Method to create a substring using charAt()
    public static String substringUsingCharAt(String text, int start, int end) {
        StringBuilder result = new StringBuilder();
        for (int i = start; i < end; i++) {
            result.append(text.charAt(i));
        }
        return result.toString();
    }

    // Method to compare two strings using charAt()
    public static boolean compareStringsUsingCharAt(String str1, String str2) {
        return str1.length() == str2.length() && str1.equals(str2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // User input
        System.out.print("Enter string: ");
        String inputString = sc.next();
        System.out.print("Enter start index : ");
        int start = scanner.nextInt();
        System.out.print("Enter end index : ");
        int end = sc.nextInt();

        // Extract substrings
        String substringUsingCharAt = substringUsingCharAt(inputString, start, end);
        String substringUsingSubstring = inputString.substring(start, end);

        // Display substrings
        System.out.println("Using charAt(): " + substringUsingCharAt);
        System.out.println("Using substring(): " + substringUsingSubstring);

        // Compare and display result
        System.out.println(substringUsingCharAt.equals(substringUsingSubstring) ? "Substrings are equal" : "Substrings are not equal");

        sc.close();
    }
}
