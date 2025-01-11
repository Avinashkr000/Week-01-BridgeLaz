import java.util.Scanner;

public class UnitPriceOfQuantity {
    public static void main(String[] args) {
		// Taking user input
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter unit price : ");  
		// Taking Unit price 
        double Unit_Price = sc.nextDouble();
        System.out.println("Enter the Quantity of item  : ");
        int Quantity = sc.nextInt();
		// The Results
        System.out.println("Total purchase price of n items is " +  Unit_Price *Quantity);
    }
}
