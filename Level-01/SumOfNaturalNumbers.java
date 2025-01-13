import java.util.Scanner;
public class SumOfNaturalNumbers{
	//defining method to calculate sum of natural numbers
	public int sumOfNaturalNumbers(int number){
		int sum=0;
		for(int i=1;i<=number;i++){
			sum+=i;
		}
		return sum;
		
	}
	//main() method
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		//taking input from user using Scanner class
		System.out.print("Enter a number : ");
		int number=sc.nextInt();
		SumOfNaturalNumbers s=new SumOfNaturalNumbers();
		int ans=s.sumOfNaturalNumbers(number);
		//printing output
		System.out.println("Sum of "+number+" natural numbers is "+ans);
	}
}