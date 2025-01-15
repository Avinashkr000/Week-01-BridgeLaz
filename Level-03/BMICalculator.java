import java.util.Scanner;

public class BMICalculator {

    // Method to calculate BMI and status
    public static String[] calculateBMIAndStatus(double weight, double height) {
        // Convert height from cm to meters
        double heightInMeters = height / 100;
        
        // BMI Calculation: BMI = weight / (height^2)
        double bmi = weight / (heightInMeters * heightInMeters);
        
        // Determine the BMI Status
        String status = "";
        if (bmi <= 18.4) {
            status = "Underweight";
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            status = "Normal";
        } else if (bmi >= 25.0 && bmi <= 39.9) {
            status = "Overweight";
        } else if (bmi >= 40.0) {
            status = "Obese";
        }
        
        // Return an array containing the weight, height, BMI, and status
        return new String[]{String.format("%.2f", weight), String.format("%.2f", height), String.format("%.2f", bmi), status};
    }

    // Method to compute BMI and store the results in a 2D array
    public static String[][] computeBMIAndStoreResults(double[][] data) {
        String[][] results = new String[10][4];
        
        // Loop through each person and calculate BMI and status
        for (int i = 0; i < 10; i++) {
            double weight = data[i][0]; // Weight is in column 0
            double height = data[i][1]; // Height is in column 1
            
            // Get BMI and status using the calculateBMIAndStatus method
            String[] bmiAndStatus = calculateBMIAndStatus(weight, height);
            
            // Store the results in the results array
            results[i][0] = bmiAndStatus[0]; // Weight
            results[i][1] = bmiAndStatus[1]; // Height
            results[i][2] = bmiAndStatus[2]; // BMI
            results[i][3] = bmiAndStatus[3]; // Status
        }
        
        return results;
    }

    // Method to display the results in a tabular format
    public static void displayResults(String[][] results) {
        System.out.println("Person | Height (cm) | Weight (kg) | BMI  | Status");
        System.out.println("----------------------------------------------------");
        
        // Loop to print the 2D array of results
        for (int i = 0; i < 10; i++) {
            System.out.println(" " + (i + 1) + "     | " + results[i][1] + "     | " + results[i][0] + "       | " + results[i][2] + "   | " + results[i][3]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] data = new double[10][2]; // 2D array to store weight and height for 10 members
        
        // Take user input for weight and height of 10 members
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter details for person " + (i + 1));
            
            System.out.print("Enter weight (in kg) : ");
            data[i][0] = sc.nextDouble();
            
            System.out.print("Enter height (in cm) : ");
            data[i][1] = sc.nextDouble();
            
            System.out.println();
        }
        
        // Compute BMI and status for each person
        String[][] results = computeBMIAndStoreResults(data);
        
        // Display the results
        displayResults(results);
        
        sc.close();
    }
}
