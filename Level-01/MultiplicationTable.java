import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

 
        System.out.print("Enter  number to print its multiplication table: ");
        int arr = sc.nextInt();


        int[] tabl = new int[10];

        // Calculate multiplication 
        for (int i = 1; i <= 10; i++) {
            tabl[i - 1] = arr * i;
        }

        // Display the multiplication table
        System.out.println("Multiplication Table of " + arr + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(arr + " * " + i + " = " + tabl[i - 1]);
        }

        sc.close();
    }
}
