import java.util.Scanner;

public class PrimeNumberChecker {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number to check if it is prime: ");
        int number = sc.nextInt();
        
        boolean isPrime = checkPrime(number);
        
        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
        
        sc.close();
    }
    
    // Function to check if a number is prime
    public static boolean checkPrime(int number) {
        if (number <= 1) {
            return false; // 0 and 1 are not prime numbers
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; // number is divisible by i, so it's not prime
            }
        }
        return true;
    }
}
