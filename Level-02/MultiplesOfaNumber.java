import java.util.Scanner;

public class MultiplesOfaNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking number as user input
        System.out.print("Enter an number: ");
        int number = sc.nextInt();

        // Applying loop backward from 100 to 1
        System.out.println("Multiples of " + number + " below 100 are:");
        for (int i = 100; i >= 1; i--) {
            // Checking if no is divisible by i
            if (i % number == 0) {
                System.out.println(i); // Print the multiple
            }
        }
    }
}