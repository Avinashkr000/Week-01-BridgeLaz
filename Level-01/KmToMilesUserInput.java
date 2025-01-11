import java.util.Scanner;

public class KmToMilesUserInput {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        double kms;
        double miles;
        System.out.println("Enter number of kilometers ");
		// Taking the user Input to the kilometers
        kms = Sc.nextDouble();
		// converting kilometers to miles
        miles = kms * 1.6;
		// here the result
        System.out.println(" The total mile is " + miles + " "+ " mile for the given "+ kms + "Km");
    }
}
