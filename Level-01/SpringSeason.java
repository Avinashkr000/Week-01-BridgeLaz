import java.util.Scanner;

public class SpringSeason {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input month and day
        System.out.print("Enter the month (1-12): ");
        int month = input.nextInt();

        System.out.print("Enter the day (1-31): ");
        int day = input.nextInt();

        // Check if it is Spring Season
        boolean isSpringSeason = 
            (month == 3 && day >= 20 && day <= 31) ||  // March 20 to 31
            (month == 4 && day >= 1 && day <= 30) ||   // April 1 to 30
            (month == 5 && day >= 1 && day <= 31) ||   // May 1 to 31
            (month == 6 && day >= 1 && day <= 20);     // June 1 to 20

        // Output result
        if (isSpringSeason) {
            System.out.println("It's a Spring Season.");
        } else {
            System.out.println("Not a Spring Season.");
        }

        sc.close();
    }
}
