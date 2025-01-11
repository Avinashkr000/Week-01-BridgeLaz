import java.util.Scanner;

public class NaturalNumberOfSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        if (n > 0) {
            // Sum using a formula
            int Sum_Formula = n * (n + 1) / 2;

            // Sum using  the while Loop
            int Sum_Loop = 0;
            int i = 1;
            while (i <= n) {
                Sum_Loop += i;
                i++;
            }

            // Print the  results
            System.out.println("Sum using formula: " + Sum_Formula);
            System.out.println("Sum using while : " + Sum_Loop);

            // Compare the results
            if (Sum_Formula == Sum_Loop) {
                System.out.println("Both of  computation are correct!");
            }
        } else {
            System.out.println("enter a positive integer natural number");
        }
    }
}
