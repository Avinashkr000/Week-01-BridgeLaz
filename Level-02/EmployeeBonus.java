import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int EMPLOYEE = 10;
        double[] Salaries = new double[EMPLOYEE];
        int[] YearsOfService = new int[EMPLOYEE];
        double[] Bonuses = new double[EMPLOYEE];
        double[] NewSalaries = new double[EMPLOYEE];

        double TotalBonus = 0, TotalOldSalary = 0, TotalNewSalary = 0;

        
        for (int i = 0; i < EMPLOYEE; i++) {
            System.out.print("Enter salary of employee " + (i + 1) + ": ");
            double Salary = sc.nextDouble();

            System.out.print("Enter years of service for employee " + (i + 1) + ": ");
            int Years = sc.nextInt();

            if (Salary <= 0 || Years < 0) {
                System.out.println("Invalid input enter again");
                i--;
                continue;
            }

            Salaries[i] = Salary;
            YearsOfService[i] = Years;
        }

        // Calculate bonuses, new salaries, and totals
        for (int i = 0; i < EMPLOYEE; i++) {
            double BonusRate = (YearsOfService[i] > 5) ? 0.05 : 0.02;
            Bonuses[i] = Salaries[i] * BonusRate;
            NewSalaries[i] = Salaries[i] + Bonuses[i];

            TotalBonus += Bonuses[i];
            TotalOldSalary += Salaries[i];
            TotalNewSalary += NewSalaries[i];
        }

        // Output result
        System.out.println("\n Employee Bonus Details : ");
        for (int i = 0; i < EMPLOYEE; i++) {
            System.out.println("Employee " + (i + 1) + ": Old Salary = " + Salaries[i] + 
                               ", Bonus = " + Bonuses[i] + ", New Salary = " + NewSalaries[i]);
        }

        System.out.println("\nTotal Bonus Paid : " + TotalBonus);
        System.out.println("Total Old Salary : " + TotalOldSalary);
        System.out.println("Total New Salary : " + TotalNewSalary);

        sc.close();
    }
}
