import java.util.Scanner;

public class QuotientAndRemainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
			// Enter num 1
        System.out.println("Enter number1 :  " );
        int number1 = sc.nextInt();
		// entering number 2 
        System.out.println("Enter number2 : ");
        int number2 = sc.nextInt();
		// sum formula use
        int quotient = number1 / number2;
        int remainder = number1 % number2;
		// here's the output
        System.out.println("The Quotient is " + quotient +"and Remainder is " + remainder +"of two number "+number1 + "and "+number2) ;

    }
}
