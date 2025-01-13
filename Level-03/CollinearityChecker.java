import java.util.Scanner;

public class CollinearityChecker {

    // Method to check collinearity using the slope formula
    public static boolean areCollinearUsingSlope(double x1, double y1, double x2, double y2, double x3, double y3) {
        if ((x2 - x1) != 0 && (x3 - x2) != 0 && (x3 - x1) != 0) {
            double slopeAB = (y2 - y1) / (x2 - x1);
            double slopeBC = (y3 - y2) / (x3 - x2);
            double slopeAC = (y3 - y1) / (x3 - x1);
            return slopeAB == slopeBC && slopeBC == slopeAC;
        }
        // Special case: vertical lines
        return (x2 - x1) == 0 && (x3 - x2) == 0;
    }

    // Method to check collinearity using the area of the triangle formula
    public static boolean areCollinearUsingArea(double x1, double y1, double x2, double y2, double x3, double y3) {
        double area = 0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
        return area == 0;
    }

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);

        // Input three points
        System.out.print("Enter x1 and y1 for Point A: ");
        double x1 = sn.nextDouble();
        double y1 = sn.nextDouble();
        System.out.print("Enter x2 and y2 for Point B: ");
        double x2 = sn.nextDouble();
        double y2 = sn.nextDouble();
        System.out.print("Enter x3 and y3 for Point C: ");
        double x3 = sn.nextDouble();
        double y3 = sn.nextDouble();

        // Check collinearity using slope formula
        boolean collinearSlope = areCollinearUsingSlope(x1, y1, x2, y2, x3, y3);
        System.out.println("Collinear using slope formula: " + collinearSlope);

        // Check collinearity using area of the triangle formula
        boolean collinearArea = areCollinearUsingArea(x1, y1, x2, y2, x3, y3);
        System.out.println("Collinear using area formula: " + collinearArea);
    }
}
