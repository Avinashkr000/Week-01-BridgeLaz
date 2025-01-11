import java.util.Scanner;

public class BMI {

    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Input weight in kg and height in cm
        System.out.print("Enter weight in kgs : ");
        double weight = sc.nextDouble();
        
        System.out.print("Enter height in cms: ");
        double height_Cm = sc.nextDouble();
        
        // Convert height from cm to meters
        double height_M = height_Cm / 100;

        // Calculate BMI using the formula BMI = weight / (height * height)
        double bmi = weight / (height_M * height_M);

        // Output the calculated BMI
        System.out.println("\nYour BMI is: " + bmi);

        // Determine weight status based on BMI value
        if (bmi <= 18.4) {
            System.out.println("Weight Status: Underweight");
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            System.out.println("Weight Status: Normal");
        } else if (bmi >= 25.0 && bmi <= 39.9) {
            System.out.println("Weight Status: Overweight");
        } else {
            System.out.println("Weight Status: Obese");
        }
    }
}
