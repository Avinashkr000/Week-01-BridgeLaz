import java.util.Scanner;

public class SubstringOccurrences {
    public static int count_Occurrences(String str, String sub) {
        int count = 0;
        int index = 0;

        // Iterate through string to find all occurrences of the substring
        while ((index = str.indexOf(sub, index)) != -1) {
            count++;
            index += sub.length(); // Move the index forward to avoid overlapping match
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt user for input string
        System.out.print("Enter the main string : ");
        String main_String = sc.nextLine();

        // Prompt user for substring
        System.out.print("Enter the substring to find : ");
        String substring = sc.nextLine();

        // Count occurrences and print result
        int occurrences = count_Occurrences(main_String, substring);
        System.out.println("The substring \"" + substring + "\" occurs " + occurrences + " times in the main string");

        sc.close();
    }
}