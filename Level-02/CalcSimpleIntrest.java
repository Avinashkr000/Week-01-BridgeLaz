import java.util.Scanner;

public class CalcSimpleIntrest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the principal amount: ");
        double principal = sc.nextDouble();

        System.out.print("Enter the rate of interest: ");
        double rate = sc.nextDouble();
		// time period in years
        System.out.print("Enter the time period (in years): ");
        double time = sc.nextDouble();
		// the rate of the intrest
        double SimpleInterest = (principal*rate*time) / 100;

				// here the result

        System.out.println("The simple interest is " + SimpleInterest + " for principal " + principal +" Rate of interest " + rate + " and Time " + time + " years.");


    }
}
