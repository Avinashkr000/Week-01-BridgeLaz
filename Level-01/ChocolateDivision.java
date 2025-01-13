import java.util.Scanner;

public class ChocolateDivision {

    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int chocolates_PerChild = number / divisor;  //Number of chocolates each child gets
        int remaining_Chocolates = number % divisor; //Remaining chocolates after distribution
        return new int[] {chocolates_PerChild, remaining_Chocolates};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of chocolates: ");
        int number_OfChocolates = sc.nextInt();

        System.out.print("Enter the number of children: ");
        int number_OfChildren = sc.nextInt();

        if (number_OfChildren == 0) {
            System.out.println("Error! Number of children cannot be zero.");
        } else {
            int[] result = findRemainderAndQuotient(number_OfChocolates, number_OfChildren);
            System.out.println("Each child will get: " + result[0] + " chocolates.");
            System.out.println("Remaining chocolates: " + result[1]);
        }

        sc.close();
    }
}
