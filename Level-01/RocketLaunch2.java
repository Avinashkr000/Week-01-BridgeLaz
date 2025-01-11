import java.util.Scanner;

public class RocketLaunch2 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        // Taking  countdown starting no as user input
        System.out.print("Enter the countdown starting number: ");
        int counter = kb.nextInt();

        // Countdown
        System.out.println("Starting the countdown:");
        for (int i = counter; i >= 1; i--) {
            System.out.println(i);
        }

        // output statement
        System.out.println("Liftoff! Rocket has launched!");
    }
}
