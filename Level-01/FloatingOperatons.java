import java.util.Scanner;
public class FloatingOperatons{
   public static void main(String[] args){
	   Scanner sc= new Scanner(System.in);
	  //taking inputs from user
	  System.out.println("Enter first num ");
       double num1=sc.nextDouble();
	   System.out.println("Enter secound num ");
       double num2=sc.nextDouble();
	  //Calculations 
	   double add=num1+num2;
	   double sub=num1-num2;
	   double mul=num1*num2;
	   double div=num1/num2;
	  //Printing output 
       System.out.println("The addition, subtraction, multiplication and division value of 2 numbers "+(num1)+" and " + (num2)+" is " + (add) + " , " + (sub) + " , " + (mul) + " and " +(div) );
	   
	  
   }
}