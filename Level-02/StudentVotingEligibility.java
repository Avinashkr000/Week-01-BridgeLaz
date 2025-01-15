import java.util.Scanner;

public class StudentVotingEligibility {

    // Method to take the ages of students as input
    public static int[] getStudentAges(int numStudents) {
        Scanner sc = new Scanner(System.in);
        int[] ages = new int[numStudents];

        // Loop to take input for ages of all students
        System.out.println("Enter the age of " + numStudents + " students:");
        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter age for student " + (i + 1) + ": ");
            ages[i] = sc.nextInt();
        }

        return ages;
    }

    // Method to check if each student can vote based on their age
    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] result = new String[ages.length][2];

        for (int i = 0; i < ages.length; i++) {
            // Validate the age, if it's negative, set "Not Eligible to Vote"
            if (ages[i] < 0) {
                result[i][0] = String.valueOf(ages[i]); // Store age
                result[i][1] = "Cannot Vote"; // Invalid age, cannot vote
            } else {
                result[i][0] = String.valueOf(ages[i]); // Store valid age
                // If age is 18 or more, the student can vote
                if (ages[i] >= 18) {
                    result[i][1] = "Can Vote";
                } else {
                    result[i][1] = "Cannot Vote";
                }
            }
        }

        return result;
    }

    // Method to display the 2D array in a tabular format
    public static void displayVotingResults(String[][] result) {
        System.out.println("\nStudent Age and Voting Eligibility:");
        System.out.printf("%-15s %-20s\n", "Age", "Voting Eligibility");
        System.out.println("----------------------------------------");
        
        // Print each row of the 2D array
        for (int i = 0; i < result.length; i++) {
            System.out.printf("%-15s %-20s\n", result[i][0], result[i][1]);
        }
    }

    public static void main(String[] args) {
        // Number of students
        int numStudents = 10;

        // Call method to get the ages of 10 students
        int[] ages = getStudentAges(numStudents);

        // Call method to check the voting eligibility of students
        String[][] votingEligibility = checkVotingEligibility(ages);

        // Call method to display the results in a tabular format
        displayVotingResults(votingEligibility);
    }
}
