import java.util.Scanner;

public class ConvertWeight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter weight in pounds: ");
        double WeightInPounds = sc.nextDouble();

		// weight coversion 
        double WeightInKg = WeightInPounds * 2.2;
			// here the result
        System.out.println("The weight of the person in pounds is " + WeightInPounds + " and in kg is " + WeightInKg);

    }
}
