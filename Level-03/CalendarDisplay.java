import java.util.Scanner;

public class CalendarDisplay {
    // getting the month in string
    public static String getMonthName(int month) {
        String[] months = {
            "January", "February", "March", "April", "May", "June",
            "July", "August", 
            "September", "October", "November", "December"
        };
        return months[month - 1];
    }

    // getting number of days including leap year.
    public static int getNumberOfDays(int month, int year) {
        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (month == 2 && isLeapYear(year)) {
            return 29;
        }
        return days[month - 1];
    }

    // leap year check
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // getting the first day of month
    public static int getFirstDayOfMonth(int month, int year) {
        int y = year - (14 - month) / 12;
        int x = y + y / 4 - y / 100 + y / 400;
        int m = month + 12 * ((14 - month) / 12) - 2;
        return (1 + x + (31 * m) / 12) % 7;
    }

    // printing the calendar
    public static void displayCalendar(int month, int year) {
        String monthName = getMonthName(month); // getting the month name
        int numberOfDays = getNumberOfDays(month, year); // getting the number of days
        int firstDay = getFirstDayOfMonth(month, year); // getting the first day of month
        System.out.printf("\n     "+ monthName +" " +year+ "\n");
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
        for (int i = 0; i < firstDay; i++) {
            System.out.print("    ");
        }
        for (int day = 1; day <= numberOfDays; day++) {
            if(day<10){
            	System.out.printf(day + "   ");
            }else{
            	System.out.printf(day + "  ");
            }
            if ((day + firstDay) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.print("Enter month (1-12): ");
        int month = sn.nextInt();

        System.out.print("Enter year: ");
        int year = sn.nextInt();

        displayCalendar(month, year);

    }
}
