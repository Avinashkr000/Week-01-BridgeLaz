import java.util.Scanner;

public class AnagramCheck {

    public static boolean areAnagrams(String str1, String str2) {
        // If the strings are of different lengths, they cannot be anagrams
        if (str1.length() != str2.length()) {
            return false;
        }

        // Convert strings to character arrays
        char[] array1 = str1.toCharArray();
        char[] array2 = str2.toCharArray();

        // Sort the character arrays
        java.util.Arrays.sort(array1);
        java.util.Arrays.sort(array2);

        // Check if the sorted arrays are equal
        return java.util.Arrays.equals(array1, array2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take two strings as input
        System.out.print("Enter the first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter the second string: ");
        String str2 = sc.nextLine();

        // Check if the strings are anagrams
        if (areAnagrams(str1, str2)) {
            System.out.println("The two strings are anagrams of each other ");
        } else {
            System.out.println("The two strings are NOT anagrams of each other");
        }

        sc.close();
    }
}
