import java.util.Scanner;

public class CountDigits {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input the number
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        // Initialize count to 0
        int count = 0;

        // Loop to count digits
        while (num != 0) {
          
            num /= 10;
            count++;
        }

        // Output count of digits
        System.out.println("The number has " + count + " digits.");

    }
}
