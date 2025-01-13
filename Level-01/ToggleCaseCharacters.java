import java.util.Scanner;

public class ToggleCaseCharacters {
    public static String toggleCase(String input) {
        String result = "";

        // Iterate through each character in the string
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);

            // Toggle case using simple conditions
            if (currentChar >= 'A' && currentChar <= 'Z') {
                result += (char) (currentChar + 32); // Convert uppercase to lowercase
            } else if (currentChar >= 'a' && currentChar <= 'z') {
                result += (char) (currentChar - 32); // Convert lowercase to uppercase
            } else {
                result += currentChar; // Add non-alphabetic characters as is
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt user for input string
        System.out.print("Enter a string : ");
        String input = sc.nextLine();

        // Toggle case and print the result
        System.out.println("Toggled case string : " + toggleCase(input));

        sc.close();
    }
}
