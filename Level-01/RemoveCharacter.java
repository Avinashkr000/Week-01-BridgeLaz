import java.util.Scanner;

public class RemoveCharacter {
    public static String removeCharacter(String str, char ch) {
        // Initialize a result string
        String result = "";

        // Loop through each character in the string
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);

            // Append the character to result if it's not the one to be removed
            if (currentChar != ch) {
                result += currentChar;
            }
        }

        return result; // Return the modified string
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input string and the character to remove
        System.out.print("Enter a string : ");
        String input = sc.nextLine();

        System.out.print("Enter the character to remove: ");
        char ch = sc.next().charAt(0); // Read the first character of the input

        // Remove the character and display the result
        String modifiedString = removeCharacter(input, ch);
        System.out.println("Modified String : " + modifiedString);

        sc.close();
    }
}
