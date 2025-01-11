import java.util.Scanner;

public class TallestAndYoungestFriend {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking  age height as user input 
        System.out.print("Enter the age of Amar: ");
        int amar_Age = sc.nextInt();
        System.out.print("Enter the height of Amar (in cm): ");
        int amar_Height = sc.nextInt();

        System.out.print("Enter the age of Akbar : ");
        int akbar_Age = sc.nextInt();
        System.out.print("Enter the height of Akbar in cm: ");
        int akbar_Height = sc.nextInt();

        System.out.print("Enter the age of Anthony: ");
        int anthony_Age = sc.nextInt();
        System.out.print("Enter the height of Anthony in cm : ");
        int anthony_Height = sc.nextInt();

        // Finding the youngest friend based on age
        int youngest_Age = amar_Age;
        String youngest_Friend = "Amar";

        if (akbar_Age < youngest_Age) {
            youngest_Age = akbar_Age;
            youngest_Friend = "Akbar";
        }
        if (anthony_Age < youngest_Age) {
            youngest_Age = anthony_Age;
            youngest_Friend = "Anthony";
        }

        // Finding the tallest friend based on height
        int tallest_Height = amar_Height;
        String tallest_Friend = "Amar";

        if (akbar_Height > tallest_Height) {
            tallest_Height = akbar_Height;
            tallest_Friend = "Akbar";
        }
        if (anthony_Height > tallest_Height) {
            tallest_Height = anthony_Height;
            tallest_Friend = "Anthony";
        }

        // Output Statement
        System.out.println(youngest_Friend + " is the youngest with " + youngest_Age + " years old.");
        System.out.println(tallest_Friend + " is the tallest with " + tallest_Height + " cm height.");
    }
}