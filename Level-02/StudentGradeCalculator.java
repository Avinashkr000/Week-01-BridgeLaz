import java.util.Random;

public class StudentGradeCalculator {

    // Method to generate random 2-digit scores for Physics, Chemistry, and Maths
    public static int[][] generateScores(int numStudents) {
        Random random = new Random();
        int[][] scores = new int[numStudents][3];

        // Generate random marks for each student in PCM (Physics, Chemistry, Maths)
        for (int i = 0; i < numStudents; i++) {
            scores[i][0] = random.nextInt(51) + 50; // Physics marks between 50 and 100
            scores[i][1] = random.nextInt(51) + 50; // Chemistry marks between 50 and 100
            scores[i][2] = random.nextInt(51) + 50; // Maths marks between 50 and 100
        }

        return scores;
    }

    // Method to calculate total, average, percentage for each student
    public static double[][] calculateResults(int[][] scores, int numStudents) {
        double[][] results = new double[numStudents][4]; // Total, Average, Percentage, Grade
        
        for (int i = 0; i < numStudents; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            results[i][0] = total;
            results[i][1] = Math.round(average * 100.0) / 100.0; // Round to 2 decimal places
            results[i][2] = Math.round(percentage * 100.0) / 100.0; // Round to 2 decimal places
        }

        return results;
    }

    // Method to assign grade based on percentage
    public static String[][] calculateGrades(double[][] results, int numStudents) {
        String[][] grades = new String[numStudents][1];

        for (int i = 0; i < numStudents; i++) {
            double percentage = results[i][2];
            if (percentage >= 80) {
                grades[i][0] = "A";
            } else if (percentage >= 70) {
                grades[i][0] = "B";
            } else if (percentage >= 60) {
                grades[i][0] = "C";
            } else if (percentage >= 50) {
                grades[i][0] = "D";
            } else if (percentage >= 40) {
                grades[i][0] = "E";
            } else {
                grades[i][0] = "R"; // Remedial standard
            }
        }

        return grades;
    }

    // Method to display the scorecard of all students
    public static void displayScorecard(int[][] scores, double[][] results, String[][] grades, int numStudents) {
        System.out.println("Scorecard for Students:");
        System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s %-10s\n", 
                          "Student", "Physics", "Chemistry", "Maths", "Total", "Percentage", "Grade");
        System.out.println("----------------------------------------------------------------------");
        
        for (int i = 0; i < numStudents; i++) {
            System.out.printf("%-10d %-10d %-10d %-10d %-10.2f %-10.2f %-10s\n", 
                              (i + 1), 
                              scores[i][0], 
                              scores[i][1], 
                              scores[i][2], 
                              results[i][0], 
                              results[i][2], 
                              grades[i][0]);
        }
    }

    public static void main(String[] args) {
        int numStudents = 5; // Set number of students

        // Step 1: Generate random scores for 5 students
        int[][] scores = generateScores(numStudents);

        // Step 2: Calculate total, average, and percentage
        double[][] results = calculateResults(scores, numStudents);

        // Step 3: Calculate grades based on percentage
        String[][] grades = calculateGrades(results, numStudents);

        // Step 4: Display the scorecard
        displayScorecard(scores, results, grades, numStudents);
    }
}
