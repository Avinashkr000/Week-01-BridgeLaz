import java.util.Scanner;

public class AddinguntilZeroOrNegative {
    public static void main(String[] args) {
	
		//Making object of Scanner class for user input 
        Scanner kb = new Scanner(System.in);
        int sum = 0;
	
		//printing message 
        System.out.println("Enter numbers to add, Enter 0 or a negative number to stop:");

		//creating while loop for checking occurence of 0 and negative no
        while (true) {
            System.out.print("Enter a number: ");
            int num = scanner.nextInt();

            if (num <= 0) {
                break; // Exiting the loop 
            }

			//// Add the entered number into the sum
            sum += num; 
        }

		//output statement 
        System.out.println("The total sum is: " + sum);
    }
}