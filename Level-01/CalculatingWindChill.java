import java.util.Scanner;

public class CalculatingWindChill {

    public static double calculateWindChill(double temperature, double windSpeed) {
        // Wind chill formula
        double wind_Chill = 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
        return wind_Chill;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the temperature:");
        double temperature = sc.nextDouble();

        System.out.print("Enter the wind speed:");
        double wind_Speed = sc.nextDouble();

        // Calculate wind chill
        double wind_Chill = calculateWindChill(temperature, wind_Speed);

        System.out.println("The wind chill temperature is: " + wind_Chill + "°F");

        sc.close();
    }
}
