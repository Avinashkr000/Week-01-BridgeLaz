import java.util.Scanner;

public class PalindromeChecker {

    // Method to check if the string is a palindrome using iteration (Logic 1)
    public static boolean isPalindromeIterative(String text) {
        int start = 0;
        int end = text.length() - 1;

        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;  // Return false if characters do not match
            }
            start++;
            end--;
        }
        return true;  // Return true if all characters match
    }

    // Method to check if the string is a palindrome using recursion (Logic 2)
    public static boolean isPalindromeRecursive(String text, int start, int end) {
        // Base case: If start index is greater than or equal to end, it's a palindrome
        if (start >= end) {
            return true;
        }
        // If characters at start and end do not match, return false
        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }
        // Recursive case: Compare the next characters
        return isPalindromeRecursive(text, start + 1, end - 1);
    }

    // Method to reverse a string and return the reversed character array (Logic 3)
    public static char[] reverseString(String text) {
        int length = text.length();
        char[] reverseArray = new char[length];

        // Reverse the string using charAt()
        for (int i = 0; i < length; i++) {
            reverseArray[i] = text.charAt(length - 1 - i);
        }

        return reverseArray;
    }

    // Method to check if the string is a palindrome using reversed array (Logic 3)
    public static boolean isPalindromeUsingArray(String text) {
        char[] originalArray = text.toCharArray();   // Convert string to char array
        char[] reversedArray = reverseString(text);  // Get the reversed array

        // Compare original and reversed arrays
        for (int i = 0; i < originalArray.length; i++) {
            if (originalArray[i] != reversedArray[i]) {
                return false;  // Return false if characters do not match
            }
        }

        return true;  // Return true if all characters match
    }

    // Main method to take input and display the result
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input string from the user
        System.out.print("Enter text : ");
        String input = sc.nextLine();

        // Check if the string is a palindrome using the iterative method (Logic 1)
        boolean resultIterative = isPalindromeIterative(input);
        System.out.println("Is palindrome Iterative method : " + resultIterative);

        // Check if the string is a palindrome using the recursive method (Logic 2)
        boolean resultRecursive = isPalindromeRecursive(input, 0, input.length() - 1);
        System.out.println("Is palindrome (Recursive method): " + resultRecursive);

        // Check if the string is a palindrome using character arrays (Logic 3)
        boolean resultArray = isPalindromeUsingArray(input);
        System.out.println("Is palindrome Array method : " + resultArray);
    }
}
