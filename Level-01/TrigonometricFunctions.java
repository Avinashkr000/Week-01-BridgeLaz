import java.util.Scanner;

public class TrigonometricFunctions {

    public static double[] CalculateTrigonometricFunctions(double angle) {
        // Converting angle from degrees to radians
        double radians = Math.toRadians(angle);
        
        // Calculate trigonometric functions
        double sine = Math.sin(radians);
        double cosine = Math.cos(radians);
        double tangent = Math.tan(radians);
        
        return new double[] {sine, cosine, tangent};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter angle in degrees : ");
        double angle = sc.nextDouble();

        // Get the trigonometric functions
        double[] results = calculateTrigonometricFunctions(angle);

        System.out.println("Sine of the angle : " + results[0]);
        System.out.println("Cosine of the angle : " + results[1]);
        System.out.println("Tangent of the angle : " + results[2]);

        sc.close();
    }
}
