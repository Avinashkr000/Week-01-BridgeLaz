import java.util.Scanner;

public class StudentScorecard {

    // Method to generate random scores for Physics, Chemistry, and Math
    public static int[][] generateScores(int numStudents) {
        int[][] scores = new int[numStudents][3]; // 3 subjects: PCM
        for (int i = 0; i < numStudents; i++) {
            scores[i][0] = (int) (Math.random() * 90 + 10); // Physics
            scores[i][1] = (int) (Math.random() * 90 + 10); // Chemistry
            scores[i][2] = (int) (Math.random() * 90 + 10); // Math
        }
        return scores;
    }

    // Method to calculate total, average, and percentage for each student
    public static double[][] calculateResults(int[][] scores) {
        int numStudents = scores.length;
        double[][] results = new double[numStudents][3]; // Total, Average, Percentage
        for (int i = 0; i < numStudents; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;
            results[i][0] = total;
            results[i][1] = Math.round(average * 100.0) / 100.0; // Round to 2 decimals
            results[i][2] = Math.round(percentage * 100.0) / 100.0; // Round to 2 decimals
        }
        return results;
    }

    // Method to display the scorecard
    public static void displayScorecard(int[][] scores, double[][] results) {
        for (int i = 0; i < scores.length; i++) {
            System.out.println("Student " + (i + 1) + ":");
            System.out.println("Physics: " + scores[i][0]);
            System.out.println("Chemistry: " + scores[i][1]);
            System.out.println("Math: " + scores[i][2]);
            System.out.println("Total: " + (int) results[i][0]);
            System.out.println("Average: " + results[i][1]);
            System.out.println("Percentage: " + results[i][2] + "%");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of students
        System.out.print("Enter the number of students: ");
        int numStudents = sc.nextInt();

        // Generate scores
        int[][] scores = generateScores(numStudents);

        // Calculate results
        double[][] results = calculateResults(scores);

        // Display the scorecard
        displayScorecard(scores, results);

        sc.close();
    }
}
