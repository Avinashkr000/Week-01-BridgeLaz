import java.util.Scanner;

public class TemperatureConverter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = sc.nextDouble();
        
        double celsius = fahrenheitToCelsius(fahrenheit);
        System.out.println(fahrenheit + "°F is equal to " + celsius + "°C.");
        
        System.out.print("Enter temperature in Celsius: ");
        double celsiusInput = sc.nextDouble();
        
        double fahrenheitResult = celsiusToFahrenheit(celsiusInput);
        System.out.println(celsiusInput + "°C is equal to " + fahrenheitResult + "°F.");
        
        sc.close();
    }
    
    // Function to convert Fahrenheit to Celsius
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
    
    // Function to convert Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
}
