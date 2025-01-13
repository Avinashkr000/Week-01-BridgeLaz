import java.util.Scanner;

public class EquationRootFinder {
    static double[] gettingRoot(double number1, double number2, double number3){  
        double []root = new double[2]; 
        double delta = Math.pow(number2, 2) + 4 * number1 * number3; // delta = b2+ 4*a*c shown in problem
       
        if(delta > 0){ // checking if positive or not
            root[0] = (-number2 + Math.sqrt(delta)) / 2 * number1;  //finding the two roots using formulae 
            //root1 of x = (-b + delta)/(2*a) 
            root[1] = (-number2 - Math.sqrt(delta)) / 2 * number1;
            //root2 of x = (-b - delta)/(2*a)
        } 
        else if( delta == 0){ // checking if zero or no then there is only one root of x  
            //root of x = -b / (2*a)
            root[0] = -number2 / 2 * number1;
        }
        
        return root;
    } 

    public static void main(String[] args) {
        Scanner sn =new Scanner(System.in); // taking input
        System.out.print("Enter the value of a "); 
        int a = sn.nextInt(); // 
        System.out.print("Enter the value of b "); 
        int b = sn.nextInt();
        System.out.print("Enter the value of c "); 
        int c = sn.nextInt(); 

        double []result= gettingRoot( a, b, c);  // calling the function 

        if(result.length == 0){ // if the result is 0
            System.out.println("The root of the Quadratic equation are " + result[0]);  
        } 
        else if(result.length == 2){ // if the result is 2
            System.out.println("The root of the Quadratic equation are " + result[0] + " and " + result[1]);
        } 
        else{
            System.out.println("Equation has no real roots");
        }
    }
}
