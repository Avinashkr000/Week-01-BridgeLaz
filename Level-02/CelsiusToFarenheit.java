import java.util.Scanner;

public class CelsiusToFarenheit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		// enter the temprature
        System.out.println("Enter temp in celsius : ");
        double celsius = sc.nextDouble();

        double Fahrenheit = (celsius * 9/5) + 32;
			// convert and the result
        System.out.println("The " + celsius + " celsius is " + Fahrenheit + " farenhiet ");
    }
}
