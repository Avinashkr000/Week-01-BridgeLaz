import java.util.Scanner;

public class FactorsOfaNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // taking the Input number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Applyig Loop to find and print factors
        System.out.println("Factors of " + number + " are:");
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                System.out.println(i);
            }
        }
    }
}