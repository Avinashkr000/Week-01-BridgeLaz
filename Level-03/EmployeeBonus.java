import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);

        // Arrays for salaries, years of service, bonuses, and new salaries
        double[] yearOfService = new double[10];
        double[] bonusAmount = new double[10];
        double[] salary = new double[10];
        double[] newSalary = new double[10];

        // Variables for total bonus, old salary, and new salary
        double totalBonus = 0, totalOldSalary = 0, totalNewSalary = 0;

        // Input data for 10 employees
        for (int i = 0; i < 10; i++) {
            while (true) {
                System.out.print("Enter salary for employee " + (i + 1) + ": ");
                salary[i] = sn.nextDouble();

                if (salary[i] > 0) {
                    break;
                } else {
                    System.out.println("Invalid salary. Please enter a positive number.");
                }
            }

            while (true) {
                System.out.print("Enter years of service for employee " + (i + 1) + ": ");
                yearOfService[i] = sn.nextDouble();

                if (yearOfService[i] >= 0) {
                    break;
                } else {
                    System.out.println("Invalid years of service. Please enter a non-negative number.");
                }
            }

            // Calculate bonus and new salary
            if (yearOfService[i] > 5) {
                bonusAmount[i] = salary[i] * 0.05; // 5% bonus
            } else {
                bonusAmount[i] = salary[i] * 0.02; // 2% bonus
            }
            newSalary[i] = salary[i] + bonusAmount[i];
        }

        // Calculate totals
        for (int i = 0; i < 10; i++) {
            totalBonus += bonusAmount[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        // Display results
        System.out.println("\nTotal Bonus Payout: " + totalBonus);
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total New Salary: " + totalNewSalary);
    }
}

