import java.util.Scanner;

public class NumberChecker2 {
    // finds the count of digits in the number
    static int countDigits(int number) {
        int count = 0;
        while (number != 0) {
            number /= 10;
            count++;
        }
        return count;
    }

    // stores the digits of the number in a digits array
    static int[] storeDigits(int number) {
        int count = countDigits(number);
        int[] digits = new int[count]; // digits array
        int index = 0;
        while (number != 0) {
            digits[index++] = number % 10; // takes last digit
            number /= 10; // removes last digit
        }
        return digits;
    }

    // finds the sum of the digits of a number using the digits array
    static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int i = 0; i < digits.length; i++) {
            sum += digits[i]; // adds each digit to sum
        }
        return sum;
    }

    // finds the sum of the squares of the digits of a number using the digits array
    static int sumOfSquaresOfDigits(int[] digits) {
        int sum = 0;
        for (int i = 0; i < digits.length; i++) {
            sum += (int) Math.pow(digits[i], 2); // adds square of each digit to sum
        }
        return sum;
    }

    // checks if a number is a harshad number using a digits array
    static boolean isHarshadNumber(int number) {
        int[] digits = storeDigits(number); // stores digits of number
        int sum = sumOfDigits(digits); // finds sum of digits
        return number % sum == 0;
    }

    // checks if a numbers frequency number using a digits array
    static void frequencyOfDigits(int number) {
        int[] digits = storeDigits(number);
        int[][] frequency = new int[10][2];
        for (int i = 0; i < digits.length; i++) {
            frequency[digits[i]][0] = digits[i]; // stores digit
            frequency[digits[i]][1]++; // increments frequency
        }
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i][1] != 0) {
                System.out.println(i + " appears " + frequency[i][1] + " times");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sn.nextInt();
        int[] digits = storeDigits(number);
        System.out.println("Count of digits: " + countDigits(number));
        System.out.println("Sum of digits: " + sumOfDigits(digits));
        System.out.println("Sum of squares of digits: " + sumOfSquaresOfDigits(digits));
        System.out.println("Is Harshad number: " + isHarshadNumber(number));
        frequencyOfDigits(number);

    }
}
