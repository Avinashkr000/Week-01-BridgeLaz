import java.util.Scanner;

public class FactorialUsingRecursion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number to calculate its factorial: ");
        int number = sc.nextInt();
        
        long result = factorial(number);
        System.out.println("The factorial of " + number + " is: " + result);
        
        sc.close();
    }
    
    // Recursive function to calculate factorial
    public static long factorial(int number) {
        if (number <= 1) {
            return 1;
        }
        return number * factorial(number - 1);
    }
}
