import java.util.Scanner;

public class YoungestTallestFriend {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] name = {"Amar", "Akbar", "Anthony"};
        int[] age = new int[3];
        double[] height = new double[3];

    
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + name[i] + ": ");
            age[i] = sc.nextInt();

            System.out.print("Enter height of " + name[i] + " (in cm): ");
            height[i] = sc.nextDouble();
        }


        int youngest_Index = 0;
        int tallest_Index = 0;

        for (int i = 1; i < 3; i++) {
            if (age[i] < age[youngest_Index]) {
                youngest_Index = i;
            }
            if (height[i] > height[tallest_Index]) {
                tallest_Index = i;
            }
        }

        
        System.out.println("\n Youngest Friend : " + name[youngest_Index] + 
                           " ( Age : " + age[youngest_Index] + ")");
        System.out.println(" Tallest Friend : " + name[tallest_Index] + 
                           "( Height : " + height[tallest_Index] + " cm)");

        sc.close();
    }
}
