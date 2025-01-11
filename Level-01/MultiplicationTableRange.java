import java.util.Scanner;

public class MultiplicationTableRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        System.out.print("Enter a number to find its multiplication table (from 6 to 9): ");
        int num = sc.nextInt();

        
        int[] multiplication_Result = new int[4];

        // use the for loop
        for (int i = 6; i <= 9; i++) {
            multiplication_Result[i - 6] = num * i;
        }

        // Display the result
        System.out.println("Multiplication table of " + num + " (from 6 to 9):");
        for (int i = 6; i <= 9; i++) {
            System.out.println(num + " * " + i + " = " + multiplication_Result[i - 6]);
        }

        sc.close();
    }
}
