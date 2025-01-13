import java.util.Arrays;

public class NumberChecker {
    static int countDigits(int num) {
        int count = 0;
        while (num != 0) {
            num /= 10; // removes the last digit
            count++; // counts it
        }
        return count;

    }
    static int[] storeDigits(int num) {
        int count = countDigits(num);
        int[] digits = new int[count];
        int index = 0;
        while (num != 0) {
            digits[index++] = num % 10; // stores the last digit
            num /= 10; // removes the last digit
        }
        return digits;
    }

    static boolean isDuckNumber(int num) {
        int[] digits = storeDigits(num);
        for (int i = 0; i<digits.length; i++) {
            if (digits[i] != 0) { // if any digit is not zero
                return true;
            }
        }
        return false;
    }
    static boolean isArmstrongNumber(int num) {
        int[] digits = storeDigits(num);
        int n = digits.length;
        int sum = 0;
        for (int i = 0; i<digits.length; i++) {
            sum += (int) Math.pow(digits[i], n); // sum of digits raised to the power of number of digits
        }
        return sum == num; // if sum is equal to the number
    }
    static int findLargest(int[] digits) {
        int largest = Integer.MIN_VALUE; // initialize with the smallest possible integer
        for (int i = 0; i<digits.length; i++) {
            if (digits[i] > largest) {
                largest = digits[i]; // updates the largest
            }
        }
        return largest;
    }
    static int findSmallest(int[] digits) {
        int smallest = Integer.MAX_VALUE; // initialize with the largest possible integer
        for (int i = 0; i<digits.length; i++) {
            if (digits[i] < smallest) {
                smallest = digits[i]; // updates the smallest
            }
        }
        return smallest;
    }

    public static void main(String[] args) {
        System.out.println(NumberChecker.countDigits(123));
        System.out.println(Arrays.toString(NumberChecker.storeDigits(123)));
        System.out.println(NumberChecker.isDuckNumber(123));
        System.out.println(NumberChecker.isArmstrongNumber(123));
        System.out.println(NumberChecker.findLargest(new int[]{1, 2, 3}));
        System.out.println(NumberChecker.findSmallest(new int[]{1, 2, 3}));
    }
}