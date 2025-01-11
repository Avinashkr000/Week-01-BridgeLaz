import java.util.Scanner;

public class MarksPercent {

    public static void main(String[] args) {
        // scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Input marks for Physics Chemistry or Maths
        System.out.print("Enter Physics marks : ");
        double physics = sc.nextDouble();
        
        System.out.print("Enter Chemistry marks :  ");
        double chemistry = sc.nextDouble();
        
        System.out.print("Enter Maths marks : ");
        double maths = sc.nextDouble();

        // Calculate total marks or percentage
        double totalMarks = physics + chemistry + maths;
        double percentage = (totalMarks / 300) * 100;

        // Determine the grade and remarks based on the percentage
        String grade = "";
        String remarks = "";

        if (percentage >= 80) {
            grade = "A";
            remarks = "Level 4, above agency-normalized standards";
        } else if (percentage >= 70) {
            grade = "B";
            remarks = "Level 3, at agency-normalized standards";
        } else if (percentage >= 60) {
            grade = "C";
            remarks = "Level 2, below, but approaching agency-normalized standards";
        } else if (percentage >= 50) {
            grade = "D";
            remarks = "Level 1, well below agency-normalized standards";
        } else if (percentage >= 40) {
            grade = "E";
            remarks = "Level 1-, too below agency-normalized standards";
        } else {
            grade = "R";
            remarks = "Remedial standards";
        }

        // Output the average marks, grade, and remarks
        System.out.println("\ Result");
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);
        System.out.println("Remarks: " + remarks);
        
    }
}
