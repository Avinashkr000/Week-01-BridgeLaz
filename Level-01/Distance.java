import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
		// Taking user InputContext
        Scanner sc = new Scanner(System.in);
        System.out.println("Provide distance in feets : ");
		//  Provide dist_feets
        double dist_feets = sc.nextDouble();

        double dist_yards = dist_feets / 3;
        double dist_miles = dist_yards / 1760;
			// The Result
        System.out.println("Your Height in cm is" + dist_feets +"while in feet is " + dist_yards + " and inches is  "+ dist_miles);
    }
}
