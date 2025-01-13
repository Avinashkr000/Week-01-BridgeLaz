import java.util.Scanner;

public class NumberProblem {
    static boolean isPositive(int number) {
        return (number >= 0) ? true : false; // checks whether the number is positive or not
    }

    static boolean isEven(int number) {
        return (number % 2 == 0) ? true : false; // checks whether the number is even or not
    }

    static int compare(int number1, int number2) {
        // compares both number and return the integer according to the problem.
        if (number1 > number2) {
            return 1;
        } else if (number1 == number2) {
            return 0;
        } else {
            return -1;
        }
    }
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);

        System.out.print("Enter the numbers: ");
        int arr[] = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sn.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            if (isPositive(arr[i])){
                if (isEven(arr[i])) {
                    System.out.println("The number " + arr[i] + " is even");
                }
                else {
                    System.out.println("The number " + arr[i] + " is odd");
                }
            }
            else {
                System.out.println("The number " + arr[i] + " is negative");
            }
        }

        int ans = compare(arr[0], arr[4]);
        if (ans == 1) {
            System.out.println("The first number is greater than the last number");
        } else if (ans == 0) {
            System.out.println("The first number is equal to the last number");
        } else {
            System.out.println("The first number is less than the last number");
        }
    }
}
