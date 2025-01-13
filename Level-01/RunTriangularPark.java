import java.util.Scanner;

public class RunTriangularPark {

    public static double calculatePerimeter(double side1, double side2, double side3) {
        return side1 + side2 + side3;
    }

    public static int calculateRounds(double perimeter, double distance) {
        return (int) Math.ceil(distance / perimeter);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first side of the triangular park (in meters): ");
        double side1 = sc.nextDouble();

        System.out.print("Enter the second side of the triangular park (in meters): ");
        double side2 = sc.nextDouble();

        System.out.print("Enter the third side of the triangular park (in meters): ");
        double side3 = sc.nextDouble();

        double perimeter = calculatePerimeter(side1, side2, side3);
        double distance = 5000; // 5 km in meters

        if (perimeter <= 0 || side1 <= 0 || side2 <= 0 || side3 <= 0) {
            System.out.println("Invalid input.");
        } else {
            int rounds = calculateRounds(perimeter, distance);
            System.out.println("The athlete must complete " + rounds + " rounds to cover 5 km.");
        }
    }
}
