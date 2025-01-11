import java.util.Scanner;

public class FactorsOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    
        System.out.print("Enter number to find it's factors : ");
        int num = sc.nextInt();

        
        int max_Factor = 10;
        int[] factors = new int[max_Factor];
        int Index = 0;

        // Find  the factors
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                // Add factor in array
                if (Index == max_Factor) {
                    // Resize the Array
                    max_Factor *= 2;
                    int[] temp = new int[max_Factor];
                    System.arraycopy(factors, 0, temp, 0, factors.length);
                    factors = temp;
                }
                factors[Index++] = i;
            }
        }

        // Display The Factors
        System.out.println("Factors of " + num + " : ");
        for (int i = 0; i < Index; i++) {
            System.out.print(factors[i] + " ");
        }
        System.out.println();

        sc.close();
    }
}
