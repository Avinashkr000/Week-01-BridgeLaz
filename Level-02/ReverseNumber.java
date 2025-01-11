import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

   
        System.out.print("Enter a number :  ");
        int num = sc.nextInt();


        boolean is_Negative = num < 0;
        num = Math.abs(num);

        int temp = num;
        int digit_Count = 0;
        while (temp > 0) {
            temp /= 10;
            digit_Count++;
        }


        int[] digits = new int[digit_Count];
        temp = num;
        for (int i = digit_Count - 1; i >= 0; i--) {
            digits[i] = temp % 10;
            temp /= 10;
        }


        int[] reversed_Digits = new int[digit_Count];
        for (int i = 0; i < digit_Count; i++) {
            reversed_Digits[i] = digits[digit_Count - 1 - i];
        }

     
        System.out.print("Reversed number : ");
        if (is_Negative) {
            System.out.print("-");
        }
        for (int digit : reversed_Digits) {
            System.out.print(digit);
        }

        System.out.println();
        sc.close();
    }
}
