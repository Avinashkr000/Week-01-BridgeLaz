import java.util.Scanner;

public class AthletRun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		// entering all sides distance in meters
		
        System.out.println("Enter the side 1 length in meter : ");
        double side1 = sc.nextDouble();

        System.out.println("Enter the side 2 length in meter :  ");
        double side2 = sc.nextDouble();

        System.out.println("Enter the side 3 length in meter : ");
        double side3 = sc.nextDouble();

        double perimeter = side1 + side2 + side3;

        double totalDistance = 5000;

        double rounds = totalDistance / perimeter;
		// here the result

        System.out.println("The total number of rounds the athlete will run is " + Math.ceil(rounds) + " to complete 5 km.");

    }
}
