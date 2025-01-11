import java.util.Scanner;

public class SmallestNumber {
    public static void main(String[] args) {

        // Create a scanner class for input
        Scanner gf = new Scanner(System.in);

        // Taking three nos as user input
        System.out.print("first number: ");
        int number1 = gf.nextInt();
        System.out.print("second number: ");
        int number2 = gf.nextInt();
        System.out.print("third number: ");
        int number3 = gf.nextInt();

        // Checking that first no is smallest or not
        if (number1 < number2 && number1 < number3) {
            System.out.println("Is the first number the smallest? Yes");
        } else {
            System.out.println("Is the first number the smallest? No");
        }
    }
}
