import java.util.Scanner;

public class StringCharacterComparison {

    // Method to return characters of a string without using toCharArray()
    public static char[] getCharacters(String str) {
        char[] characters = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            characters[i] = str.charAt(i);
        }
        return characters;
    }

    // Method to compare two character arrays
    public static boolean compareCharArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Ask the user to enter a string
        System.out.print("Enter string: ");
        String Input = sc.next();

        // Get characters from user-defined method
        char[] userDefinedChars = getCharacters(Input);

        // Get characters using the built-in toCharArray() method
        char[] builtInChars = Input.toCharArray();

        // Compare the two character arrays
        boolean areEqual = compareCharArrays(userDefinedChars, builtInChars);

        // Display the results
        System.out.println("Characters using user-defined method: ");
        for (char c : userDefinedChars) {
            System.out.print(c + " ");
        }
        System.out.println();

        System.out.println("Characters using built-in toCharArray() method : ");
        for (char c : builtInChars) {
            System.out.print(c + " ");
        }
        System.out.println();

        System.out.println("Are the two character arrays equal? " + areEqual);
    }
}
