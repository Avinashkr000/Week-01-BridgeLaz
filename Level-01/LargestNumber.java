import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {

        // Creating a scanner class object for user input
        Scanner kb = new Scanner(System.in);

        // Taking three nos as user input
        System.out.print("first number: ");
        int number1 = kb.nextInt();
        System.out.print("second number: ");
        int number2 = kb.nextInt();
        System.out.print("third number: ");
        int number3 = kb.nextInt();

        // Checking which number is the largest amongst all
        boolean isFirstLargest = (number1 >= number2 && number1 >= number3);
        boolean isSecondLargest = (number2 >= number1 && number2 >= number3);
        boolean isThirdLargest = (number3 >= number1 && number3 >= number2);

        // Output statement
        System.out.println("Is the first number the largest? " + (isFirstLargest ? "Yes" : "No"));
        System.out.println("Is the second number the largest? " + (isSecondLargest ? "Yes" : "No"));
        System.out.println("Is the third number the largest? " + (isThirdLargest ? "Yes" : "No"));
    }
}
