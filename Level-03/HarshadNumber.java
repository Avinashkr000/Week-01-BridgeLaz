import java.util.Scanner;

public class HarshadNumber {

    public static void main(String[] args) {
     
        Scanner sc = new Scanner(System.in);

        // Input the number 
        System.out.print("Enter number: ");
        int num = sc.nextInt();

        // Initialize sum to 0
        int sum = 0;
        int original_Number = num;

        
        while (num != 0) {
            // Extract last digit and add to sum
            sum += num % 10;
            // Remove last digit 
            num /= 10;
        }

        // Check if the original number is divisible by the sum of its digits
        if (original_Number % sum == 0) {
            System.out.println(original_Number + " is a Harshad Number.");
        } else {
            System.out.println(original_Number + " is not a Harshad Number.");
        }
    }
}
