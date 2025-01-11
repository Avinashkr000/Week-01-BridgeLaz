import java.util.Scanner;

public class ArmstrongNumber {

    public static void main(String[] args) {
   
        Scanner sc = new Scanner(System.in);

        // Input the number 
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Initializ sum to 0 and store the original number
        int sum = 0;
        int original_Num = num;


        while (num != 0) {
            // Find the last digit using modulus operator
            int last_Digit = num % 10;

            // Find the cube of the digit and add it to the sum
            sum += last_Digit * last_Digit * last_Digit;

           
            num = num / 10;
        }

        // Check if the sum is equal to the original number
        if (sum == original_Num) {
            System.out.println(original_Num + " is an Armstrong number.");
        } else {
            System.out.println(original_Num + " is not an Armstrong number.");
        }
    }
}
