import java.util.Scanner;

public class IntOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
			// entering a int value
        System.out.println("Enter value a : ");
        int a = sc.nextInt();

        System.out.println("Enter value b : ");
        int b = sc.nextInt();
			// entering last value
        System.out.println("Enter value c : ");
        int c = sc.nextInt();
		// some calcuations 	
        int firstResult = a + b * c;
        int secondResult = a * b +c;
        int thirdResult = c + a / b;
        int fourthResult = a % b + c;

		// and finally the results is here
		
        System.out.println("The results of int operations are :" + firstResult + ","+secondResult + " and "+thirdResult + ", "+fourthResult );

     }
}
