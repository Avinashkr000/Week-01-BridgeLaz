import java.util.Scanner;

public class SmallestAndLargest {

    public static int[] findSmallestAndLargest(int number1, int number2, int number3) {
        int smallest, largest;

        // Finding the smallest number
        if (number1 <= number2 && number1 <= number3) {
            smallest = number1;
        } else if (number2 <= number1 && number2 <= number3) {
            smallest = number2;
        } else {
            smallest = number3;
        }

        // Finding the largest number
        if (number1 >= number2 && number1 >= number3) {
            largest = number1;
        } else if (number2 >= number1 && number2 >= number3) {
            largest = number2;
        } else {
            largest = number3;
        }

        return new int[] {smallest, largest};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number : ");
        int number1 = sc.nextInt();

        System.out.print("Enter the second number : ");
        int number2 = sc.nextInt();

        System.out.print("Enter the third number : ");
        int number3 = sc.nextInt();

        int[] result = findSmallestAndLargest(number1, number2, number3);

        System.out.println("The smallest number is: " + result[0]);
        System.out.println("The largest number is: " + result[1]);

    }
}
