import java.util.Scanner;

public class Fizz_Buzz {

    public static void main(String[] args) {
        // scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Input number 
        System.out.print("Enter integer :  ");
        int num = sc.nextInt();

        // Check if number is positive
        if (num > 0) {
            // Loop from 1 to the number
            for (int i = 1; i <= num; i++) {
                // Check if the number is divisible by both 3 and 5
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                }
                // Check the number is divisible by 3
                else if (i % 3 == 0) {
                    System.out.println("Fizz");
                }
                // Check if the number is divisible by 5
                else if (i % 5 == 0) {
                    System.out.println("Buzz");
                }
                //  it not divisible by 3 or 5, print the number
                else {
                    System.out.println(i);
                }
            }
        } else {
            System.out.println(" enter  positive integer ");
        }
    }
}
