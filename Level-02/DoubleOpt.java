import java.util.Scanner;

public class DoubleOpt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
			 // enter the values
        System.out.println("Enter value a  : ");
        double a = sc.nextDouble();

        System.out.println("Enter value b : ");
        double b = sc.nextDouble();

        System.out.println("Enter value c : ");
        double c = sc.nextDouble();
		// some calculations 
        double firstResult = a + b * c;
        double secondResult = a * b +c;
        double thirdResult = c + a / b;
        double fourthResult = a % b + c;

		// here it is the  final results
        System.out.println("The results of double opt are :" + firstResult + ","+secondResult + " and "+thirdResult + ", "+fourthResult );

    }
}
