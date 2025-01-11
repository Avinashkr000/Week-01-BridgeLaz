import java.util.Scanner;

public class UniversityDiscountUserInput {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);   // Taking user input

        System.out.print("Enter Fee): ");
        double fee = Sc.nextDouble();

        System.out.print("Enter the Discount Percentage: ");   // Enter the discount percentage

        double discountPercent = Sc.nextDouble();

        double discount = (fee * discountPercent) / 100;

        double discountedPrice = fee - discount;

        // Print the results
        System.out.println("The discount amount is INR  " + discount + " and final discount from the fee is INR" + discountedPrice);

    }
}
