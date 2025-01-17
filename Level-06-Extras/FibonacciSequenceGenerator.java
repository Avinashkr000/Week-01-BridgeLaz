import java.util.Scanner;

public class FibonacciSequenceGenerator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of terms for the Fibonacci sequence: ");
        int terms = sc.nextInt();
        
        generateFibonacci(terms);
        
        sc.close();
    }
    
    // Function to generate and print the Fibonacci sequence up to n terms
    public static void generateFibonacci(int terms) {
        int first = 0, second = 1;
        
        System.out.print("Fibonacci sequence: ");
        for (int i = 1; i <= terms; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
        System.out.println();
    }
}
