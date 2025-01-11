import java.util.Scanner;

public class NumberAnalysis {
    public static void main(String[] args) {
        int[] number = new int[5];
        Scanner sc = new Scanner(System.in);

        // Input 5 number
        System.out.println("Enter 5 number : ");
        for (int i = 0; i < 5; i++) {
            number[i] = sc.nextInt();
        }

      
        for (int num : number) {
            if (num > 0) {
                if (num % 2 == 0) {
                    System.out.println(num + " is positive and even");
                } else {
                    System.out.println(num + " is positive and odd");
                }
            } else if (num < 0) {
                System.out.println(num + " is negative");
            } else {
                System.out.println(num + " is zero");
            }
        }
        if (number[0] == number[4]) {					// Here is the output
		
            System.out.println("First last numbers  equal");
        } else if (number[0] > number[4]) {
            System.out.println("First number is greater than last number");
        } else {
            System.out.println("First number is less than last number.");
        }

        sc.close();
    }
}
