import java.util.Scanner;

public class ParameterOfSquare {
    public static void main(String[] args) {
		//The user InputContext
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the perimeter of square");
		// taking input as perimeter
        int perimeter = sc.nextInt();
        int side = perimeter/4;

			// here's the result
			
        System.out.println("The length of the side is " + side  + " whose parameter is "+ perimeter);
    }
}
