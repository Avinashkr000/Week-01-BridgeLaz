import java.util.Scanner;

public class ArraysSum {
    public static void main(String[] args) {
   
        double[] number = new double[10];
        double total = 0.0;
        int indexx = 0;

        Scanner sc = new Scanner(System.in);


        System.out.println("Enter up to 10 numbers :");
		// using  while loop 
        while (true) {
            System.out.print("Enter  number: ");
            double input = sc.nextDouble();

          
            if (input <= 0) {
                break;
            }

  
            if (indexx == 10) {
                System.out.println("Array is full. Stopping input.");
                break;
            }

  
            number[indexx] = input;
            indexx++;
        }  
        for (int i = 0; i < indexx; i++) {
            total += number[i];
        }

        // show  entered numbers
        System.out.println("You entered following numbers :");
        for (int i = 0; i < indexx; i++) {
            System.out.println(number[i]);
        }

        // Display the total
        System.out.println("The total  entered numbers is : " + total);

        sc.close();
    }
}
