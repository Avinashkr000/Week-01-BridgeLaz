import java.util.Scanner;

public class FrequencyOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter  number : ");
        int num = sc.nextInt();

     
        int[] Frequency = new int[10];

     
        while (num != 0) {
            int digit = num % 10; 
            Frequency[digit]++;     // Incrementing  frequency in digit
            num /= 10;           
        }

        // printing frequency of each digit
        System.out.println("Frequency of digits in number :");
        for (int i = 0; i < 10; i++) {
            if (Frequency[i] > 0) {
                System.out.println("Digit " + i + ": " + Frequency[i] + " times");
            }
        }

        sc.close();
    }
}
