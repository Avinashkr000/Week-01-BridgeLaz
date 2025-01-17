import java.util.Scanner;

public class RemoveDuplicates {
    public static String removeDuplicate(String input) {
        String result = "";

        // Iterate throug each character of the input string
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);

            // Check if the character is already in the result string
            if (result.indexOf(currentChar) == -1) {
                result += currentChar; // Append if not  duplicate
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // for user input
        System.out.print("Enter  string : ");
        String input = sc.nextLine();

        // Remove duplicates and print the result
        String result = removeDuplicate(input);
        System.out.println("String after removing duplicates : " + result);

        sc.close();
    }
}
