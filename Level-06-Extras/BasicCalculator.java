import java.util.Scanner;

public class BasicCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Select an operation: ");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        
        int choice = sc.nextInt();
        
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();
        
        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();
        
        double result = 0;
        switch (choice) {
            case 1:
                result = add(num1, num2);
                break;
            case 2:
                result = subtract(num1, num2);
                break;
            case 3:
                result = multiply(num1, num2);
                break;
            case 4:
                result = divide(num1, num2);
                break;
            default:
                System.out.println("Invalid choice.");
                break;
        }
        
        System.out.println("The result is: " + result);
        
        sc.close();
    }
    
    // Function to add two numbers
    public static double add(double num1, double num2) {
        return num1 + num2;
    }
    
    // Function to subtract two numbers
    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }
    
    // Function to multiply two numbers
    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }
    
    // Function to divide two numbers
    public static double divide(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            System.out.println("Cannot divide by zero.");
            return Double.NaN;
        }
    }
}
