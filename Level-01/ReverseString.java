import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        System.out.println("Enter a string to reverse :");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        
        sc.close();
        String reversed = reverse(input);
        System.out.println("Reversed string: " + reversed);
    }
    private static String reverse(String input) {
        char[] characters = input.toCharArray();
        int start = 0;
        int end = characters.length - 1;
        while (start < end) {
            char temp = characters[start];
            characters[start] = characters[end];
            characters[end] = temp;
            start++;
            end--;
        }
        return new String(characters);
    }
}
