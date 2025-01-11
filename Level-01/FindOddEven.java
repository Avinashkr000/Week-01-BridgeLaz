import java.util.Scanner;

public class FindOddEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // input from the  user
        System.out.print("Enter a number: ");
        int n = input.nextInt();

        
        if (n > 0) {
            
            for (int i = 1; i <= n; i++) {
                // Check if the number is even or odd
                if (i % 2 == 0) {
                    System.out.println(i + " is an even number");
                } else {
                    System.out.println(i + " is an odd number");
                }
            }
        } else {
            System.out.println("enter a -Ve integer.");
        }
    }
}
