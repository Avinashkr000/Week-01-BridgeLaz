import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double base_cm;
        System.out.println("Enter base in cms");
        base_cm = sc.nextDouble();
        double height_cm;
        System.out.println("Enter height in cms");
        height_cm = sc.nextDouble();

        double areaIncmsquare = 0.5 * base_cm *height_cm;
        double areaInchesSquare = 0.5 * (base_cm*0.393701)*(height_cm*0.393701);

        System.out.println("Area of Triangle in sqaure cms is " + areaIncmsquare);
        System.out.println("Area of Triangle in square inches is " + areaInchesSquare);

        double height_Inches = height_cm / 2.54;
        double height_feets = height_Inches/12;

        System.out.println("Height in feets " + height_feets + " ");

    }
}
