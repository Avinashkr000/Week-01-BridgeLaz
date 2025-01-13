import java.util.Scanner;

public class FactorCalculator {

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sn.nextInt();

        int[] factors = findFactors(number); // finding the factors of the number
        System.out.print("Factors: ");
        for (int factor : factors) {
            System.out.print(factor + " ");
        }
        System.out.println();

        int sum = sumOfFactors(factors); // finding the sum of the factors
        System.out.println("Sum of factors: " + sum);

        long product = productOfFactors(factors); // finding the product of the factors
        System.out.println("Product of factors: " + product);

        double sumOfSquares = sumOfSquaresOfFactors(factors); // finding the sum of squares of the factors
        System.out.println("Sum of squares of factors: " + sumOfSquares);

        sc.close();
    }


    // Method to find the factors of a number and store them in an array
    public static int[] findFactors(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }
        }

        return factors;
    }

    // Method to find the sum of the factors
    public static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    // Method to find the product of the factors
    public static long productOfFactors(int[] factors) {
        long product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    // Method to find the sum of squares of the factors
    public static double sumOfSquaresOfFactors(int[] factors) {
        double sumOfSquares = 0;
        for (int factor : factors) {
            sumOfSquares += Math.pow(factor, 2);
        }
        return sumOfSquares;
    }
}