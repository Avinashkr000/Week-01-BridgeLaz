import java.util.Scanner;

public class FarenheitToCelsius {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter temp in farenhiet : ");
        double farenheit = sc.nextDouble();
		// coversion of temprature
        double celsius = (farenheit -32) * 5 /9 ;
		// here's the result
        System.out.println("The " + farenheit + " farenheit is " + celsius + " celsius ");
    }
}
