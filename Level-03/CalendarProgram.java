import java.util.Scanner;

public class CalendarProgram {

    // Method to get the month name
    public static String getMonthName(int month) {
        String[] months = {
            "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
        };
        return months[month - 1];
    }

    // Method to check if the year is a leap year
    public static boolean isLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        }
        return false;
    }

    // Method to get the number of days in the month
    public static int getDaysInMonth(int month, int year) {
        // Days in each month for non-leap years
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        // Check for leap year in February
        if (month == 2 && isLeapYear(year)) {
            return 29;  // February has 29 days in a leap year
        }
        
        return daysInMonth[month - 1];
    }

    // Method to calculate the first day of the month (using the Gregorian formula)
    public static int getFirstDayOfMonth(int month, int year) {
        int y = year;
        int m = month;
        
        if (m < 3) {
            m += 12;
            y -= 1;
        }

        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (1 + x + (31 * m0) / 12) % 7;

        return d0;  // Returns a number between 0 (Sunday) and 6 (Saturday)
    }

    // Method to display the calendar for the given month and year
    public static void displayCalendar(int month, int year) {
        // Get the month name
        String monthName = getMonthName(month);

        // Get the number of days in the month
        int daysInMonth = getDaysInMonth(month, year);

        // Get the first day of the month (0 - Sunday, 6 - Saturday)
        int firstDay = getFirstDayOfMonth(month, year);

        // Print the header
        System.out.printf("     %s %d\n", monthName, year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        // Print initial spaces for the first day
        for (int i = 0; i < firstDay; i++) {
            System.out.print("    ");
        }

        // Print the days of the month
        int day = 1;
        for (int i = firstDay; i < 7; i++) {
            System.out.printf("%3d", day++);
        }
        System.out.println();

        // Print the rest of the days
        while (day <= daysInMonth) {
            for (int i = 0; i < 7; i++) {
                if (day <= daysInMonth) {
                    System.out.printf("%3d", day++);
                } else {
                    break;
                }
            }
            System.out.println();
        }
    }

    // Main function to get user input and display the calendar
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get the month and year from user input
        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();
        System.out.print("Enter year (e.g., 2025): ");
        int year = sc.nextInt();

        // Display the calendar for the given month and year
        displayCalendar(month, year);

        sc.close();
    }
}
