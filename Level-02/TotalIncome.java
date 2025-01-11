import java.util.Scanner;

public class TotalIncome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		// Entering the salary
        System.out.println("Enter salary : ");
        double salary = sc.nextDouble();
			// enter bonus
        System.out.println("Enter bonus : ");
        double bonus = sc.nextDouble();
		// sum of total 		
        double TotalIncome = salary + bonus ;
		
		// and here it the output
		
        System.out.println("The salary is INR " + salary +" and bonus is INR "+ bonus + " Hence total Income is INR "+TotalIncome);
    }
}
