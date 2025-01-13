import java.util.Scanner;

public class BMICalcMethods {
    static void calculation(double[][] details) {

        for (int i = 0; i < details[0].length; i++) {
            double weight = details[i][0]; // storing the weight in a variable
            double height = details[i][1] / 100; // storing the height as well as converting it to meters.

            double bmi = weight / (height * height); // calculating bmi

            details[i][2] = bmi; // saving it into the array
        }
        
    }

    static void status(double[][] details) {
        for (int i = 0; i < details.length; i++) {
            double bmi = details[i][2];
            if (bmi <= 18.4) {
                System.out.println("Underweight");
            } else if(bmi >= 18.5 && bmi < 25) {
                System.out.println("Normal");
            } else if (bmi >= 25 && bmi < 40) {
                System.out.println("Overweight");
            } else {
                System.out.println("Obese");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        double[][] personDetails = new double[10][3];
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter the weight of person " + (i + 1));
            personDetails[i][0] = sn.nextDouble(); // first column storing weight.
            System.out.println("Enter the height of person " + (i + 1));
            personDetails[i][1] = sn.nextDouble(); // second column storing height.
        }

        calculation(personDetails);
        status(personDetails);
    }
}
