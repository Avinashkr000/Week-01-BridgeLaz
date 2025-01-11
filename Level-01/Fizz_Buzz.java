import java.util.Scanner;

public class Fizz_Buzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    
        System.out.print("Enter  positive integer : ");
        int num = sc.nextInt();

  
        if (num <= 0) {
            System.out.println("Error :  enter  positive integer ? ");
            return;
        }

 
        String[] Result = new String[num + 1];


        for (int i = 0; i <= num; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                Result[i] = "FizzBuzz";
            } else if (i % 3 == 0) {
                Result[i] = "Fizz";
            } else if (i % 5 == 0) {
                Result[i] = "Buzz";
            } else {
                Result[i] = String.valueOf(i);
            }
        }

        // Display  results
        System.out.println(" FizzBuzz Results : ");
        for (int i = 0; i <= num; i++) {
            System.out.println(" Position " + i + " = " + Result[i]);
        }

        sc.close();
    }
}
