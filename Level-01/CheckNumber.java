import java.util.Scanner;

public class CheckNumber {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        //Taking number as user input
        System.out.print("Enter a number: ");
        int number = kb.nextInt();

        // Checking if no is negative, positive or zero
        if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }
    }
}
