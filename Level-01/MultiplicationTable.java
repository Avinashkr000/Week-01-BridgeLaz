import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        // take input from the user
        Scanner input = new Scanner(System.in);

        // the user to enter a number
        System.out.print("Enter a number to find its multiplication table from 6 to 9: ");
        int number = input.nextInt();

        // 6 to 9 to print the multiplication table
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }
    }
}
