import java.util.Scanner;

public class LeapYearCondition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();
        
        // Check if the year is valid and if it's a leap year using a single if statement
        if (year >= 1582 && (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))) {
            System.out.println(year + " is Leap Year.");
        } else if (year >= 1582) {
            System.out.println(year + " is not Leap Year.");
        } else {
            System.out.println("Year should be greater than or equal to 1582.");
        }
    }
}
