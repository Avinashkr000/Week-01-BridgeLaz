import java.util.Scanner;

public class NaturalNumber {
    public static void main(String[] args) {
        // Creating a object of scanner class for user input
        Scanner kb = new Scanner(System.in);

        // Taking number as user input
        System.out.print("Enter a number: ");
        int number = kb.nextInt();

        // Checking if the given number is a natural number
        if (number >= 0) {
            // Here we are considering 0 as a natural no
            // Calculating the sum of n natural nos
            int sum = number * (number + 1) / 2;
            System.out.println("The sum of " + number + " natural numbers is " + sum);
        } else {
            // output statement for a unnatural no
            System.out.println("The number " + number + " is not a natural number");
        }
    }
}
