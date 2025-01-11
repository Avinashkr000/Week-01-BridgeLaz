import java.util.Scanner;

public class RocketLaunch {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        // Taking countdown starting value as user input
        System.out.print("countdown starting number: ");
        int counter = kb.nextInt();

        // countdown
        System.out.println("Starting the countdown:");
        while (counter >= 1) {
            System.out.println(counter);
            counter--; // Decrementing the counter
        }

        // output statement
        System.out.println("Liftoff! Rocket has launched!");
    }
}
