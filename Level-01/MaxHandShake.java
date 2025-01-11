import java.util.Scanner;

public class MaxHandShake {
    public static void main(String[] args) {
		// Taking the input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of students : ");
        int noOfstudents = sc.nextInt();
		
		
			// the Result
        System.out.println("Maximum possible number of HandShakes" + (noOfstudents * (noOfstudents - 1)) / 2);

    }
}
