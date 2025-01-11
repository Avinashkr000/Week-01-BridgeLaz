import java.util.Scanner;

public class DivisibilityTestOfFive {
    public static void main(String[] args) {
        // Create a scanner class for input
        Scanner scanner = new Scanner(System.in);

        // Taking number as user input
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // checking whether it is divisible by 5 or not
        if (number % 5 == 0) {
            System.out.println("Is the number " + number + " divisible by 5? Yes");
        } else {
            System.out.println("Is the number " + number + " divisible by 5? No");
        }
    }
}
