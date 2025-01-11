import java.util.Scanner;

public class OddEvenArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter a natural number: ");
        int num = sc.nextInt();

      
        if (num <= 0) {
            System.out.println("Error: not a natural number");
            return;
        }

        int[] oddNumber = new int[num];
        int[] evenNumber = new int[num];
        int odd_Index = 0, even_Index = 0;

   
        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0) {
                evenNumber[even_Index++] = i;
            } else {
                oddNumber[odd_Index++] = i;
            }
        }

        // Print odd numbers
        System.out.print("Odd Numbers : ");
        for (int i = 0; i < odd_Index; i++) {
            System.out.print(oddNumber[i] + "  ");
        }
        System.out.println();

        // Print even numbers
        System.out.print("Even Numbers : ");
        for (int i = 0; i < even_Index; i++) {
            System.out.print(evenNumber[i] + "  ");
        }
        System.out.println();

        sc.close();
    }
}
