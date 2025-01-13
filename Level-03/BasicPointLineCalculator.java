import java.util.Scanner;

public class BasicPointLineCalculator {

    // Method to find the Euclidean distance between two points
    public static double calculateDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }

    // Method to find the equation of a line (slope and y-intercept) given two points
    public static double[] findLineEquation(double x1, double y1, double x2, double y2) {
        double[] result = new double[2]; 
        if (x1 != x2) {
            double slope = (y2 - y1) / (x2 - x1);
            double yIntercept = y1 - slope * x1;

            result[0] = slope;       // Slope (m)
            result[1] = yIntercept;  // Y-intercept (b)
        } else {
            result[0] = Double.POSITIVE_INFINITY; // Slope is infinity
            result[1] = Double.NaN;               // Y-intercept not applicable
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);

        // Input coordinates for two points
        System.out.print("Enter x1: ");
        double x1 = sn.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = sn.nextDouble();
        System.out.print("Enter x2: ");
        double x2 = sn.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = sn.nextDouble();

        // Calculate Euclidean distance
        double distance = calculateDistance(x1, y1, x2, y2);
        System.out.println("Euclidean Distance: " + distance +"%n");

        // Calculate the equation of the line
        double[] lineEquation = findLineEquation(x1, y1, x2, y2);
        if (x1 != x2) {
            System.out.println("Equation of the line: y = " + lineEquation[0] +"x" + lineEquation[1] + "%n");
        } else {
            System.out.println("The line is vertical with undefined slope.");
        }

        sn.close();
    }
}
