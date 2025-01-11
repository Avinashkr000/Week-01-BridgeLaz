import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter year: ");
        int year = input.nextInt();
        
        // Check year is valid
        if (year < 1582) {
            System.out.println("Year should be greter than or equal to 1582");
        } else {
            // year is  leap year or no
            if (year % 400 == 0) {
                System.out.println(year + " is  Leap Year");
            } else if (year % 100 == 0) {
                System.out.println(year + " is not Leap Year");
            } else if (year % 4 == 0) {
                System.out.println(year + " is Leap Year");
            } else {
                System.out.println(year + " is not Leap Year");
            }
        }
    }
}
