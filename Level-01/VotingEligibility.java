import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args) {
        int[] st_age = new int[10];
        Scanner sc = new Scanner(System.in);

        
        System.out.println("Enter the ages of 10 students:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Student " + (i + 1) + ": ");
            st_age[i] = sc.nextInt();
        }

        // Check voting eligibility
        for (int i = 0; i < 10; i++) {
            if (st_age[i] < 0) {
                System.out.println("Invalid age entered: " + st_age[i]);
            } else if (st_age[i] >= 18) {
                System.out.println("Student with age " + st_age[i] + " can vote.");
            } else {
                System.out.println("Student with age " + st_age[i] + " cannot vote.");
            }
        }

        sc.close();
    }
}
