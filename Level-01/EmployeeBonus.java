import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get salary and years of service input
        
		System.out.print("Enter employee's salary: ");
        
		double salary = sc.nextDouble();

        System.out.print("Enter number of years of service: ");
        int yearsOf_Service = scanner.nextInt();


        // Check the employee qualifies for bonus
        if (yearsOf_Service > 5) {
            
			
			// Calculate 5 % bonus 
            
			double bonus = salary * 0.05;
            
			System.out.println("bonus amount is: " + bonus);
        } else {
            System.out.println("No bonus for employees with less than five years of service.");
        }
    }
}
