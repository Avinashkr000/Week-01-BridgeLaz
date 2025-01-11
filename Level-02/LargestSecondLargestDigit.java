import java.util.Scanner;

public class LargestSecondLargestDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        System.out.print("Enter  number : ");
        int num = sc.nextInt();
        num = Math.abs(num); 

      
        int[] digit = new int[10];
        int count = 0;

        while (num > 0) {
            if (count == digit.length) {
             
                int[] temp = new int[digit.length + 10];
                System.arraycopy(digit, 0,  temp,  0,  digit.length);
                digit = temp;
            }
            digit[count++] = num % 10;
            num /= 10;
        }


        int largest = -1, second_Largest = -1;

        for (int i = 0; i < count; i++) {
            if (digit[i] > largest) {
                second_Largest = largest;
                largest = digit[i];
            } else if (digit[i] > second_Largest && digit[i] != largest) {
                second_Largest = digit[i];
            }
        }
		

        System.out.println("Largest Digit : " + largest);
        System.out.println("Second Largest Digit : " + second_Largest);

        sc.close();
    }
}
