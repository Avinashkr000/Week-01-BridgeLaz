import java.util.Scanner;

public class AbundantNumber {

    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);

      
        System.out.print("Enter  number: ");
        int num = sc.nextInt();


        int sum = 0;

        //  number find divisors
        for (int i = 1; i < num; i++) {
            // Check number is divisible by i
            if (num % i == 0) {
                sum += i; // Add divise to sum
            }
        }

        // Check if the sum of divisors is greater than the number itself
        if (sum > num) {
            System.out.println(num + " is Abundant Number.");
        } else {
            System.out.println(num + "no Abundant Number.");
        }
    }
}
