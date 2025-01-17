import java.util.Scanner;

public class MaxOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        
        System.out.print("Enter third number: ");
        int num3 = sc.nextInt();
        
        int max = findMaximum(num1, num2, num3);
        System.out.println("The maximum number is: " + max);
        
        sc.close();
    }
    
    // Function to find the maximum of three numbers
    public static int findMaximum(int num1, int num2, int num3) {
        int max = num1;
        
        if (num2 > max) {
            max = num2;
        }
        if (num3 > max) {
            max = num3;
        }
        
        return max;
    }
}
