import java.util.Scanner;

public class ChoclateDistri {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of choclates : ");
        int NoOfChoclate = sc.nextInt();

        System.out.println("Enter number of childrens : ");
        int NoOfChildren = sc.nextInt();
		 // some calculations 
        int chocolatesPerChild = NoOfChoclate / NoOfChildren;
        int remainingChocolates = NoOfChoclate % NoOfChildren;
	
				// here the results 
        System.out.println("The number of chocolates each child gets is " + chocolatesPerChild + " and the number of remaining chocolates are " + remainingChocolates);

    }
}
