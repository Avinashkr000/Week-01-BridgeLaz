import java.util.Scanner;

public class PalindromeStringCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string to check it's a palindrome :");
        String input = sc.nextLine();
        boolean Palindrome = Palindrome(input);
        System.out.println("Is \"" + input + "\" a palindrome? " + Palindrome);
        sc.close();
    }

    private static boolean Palindrome(String input) {
        int start = 0;
        int end = input.length() - 1;
        while (start < end) {
            if (input.charAt(start) != input.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
