import java.util.Scanner;

public class Height {
    public static void main(String[] args) {
		// Taking user input
        Scanner sc = new Scanner(System.in);
		
        double cms;
        System.out.println("Enter Height in cms : ");
        cms = sc.nextDouble();
        double inches;
        double Feet;
		// the calculation's 
        inches = cms / 2.54;
        Feet = inches/12;
		// here's the result
        System.out.println("Your Height in cm is " + cms + " while in feet is " + Feet  +  " and inches is "+ inches);

    }
}
