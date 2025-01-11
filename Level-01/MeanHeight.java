import java.util.Scanner;

public class MeanHeight {
    public static void main(String[] args) {

        double[] height = new double[11];
        double sm = 0.0;

        Scanner sc = new Scanner(System.in);

   
        System.out.println("Enter heights of 11 players : ");
        for (int i = 0; i < 11; i++) {
            System.out.print("Player " + (i + 1) + " height  :  ");
            height[i] = sc.nextDouble();
            sm += height[i]; 
        }

   
        double mean = sm / 11;

        // Display  mean of height
        System.out.println("The mean height of the football team is : " + mean);

        sc.close();
    }
}
