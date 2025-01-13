public class UnitConverterYars{
  // Problem 4 methods: 
  public static double convertKmToMiles(double km){
    return km * 0.621371;
  }
  public static double convertMilesToKm(double miles) {
    return miles * 1.60934;    
  }
  public static double convertMetersToFeet(double meters) {
    return meters * 3.28084;    
  }
  public static double convertFeetToMeters(double feet) {
    return feet * 0.3048;    
  } 

  // Problem 5 Methods:
  public static double convertYardsToFeet(double yards){
    return yards * 3;
  }
  public static double convertFeetToYards(double Feet){
    return Feet * 0.333333;
  }
  public static double convertMetersToInches(double Meters){
    return Meters * 39.3701;
  }
  public static double convertInchesToMeters(double Inches){
    return Inches * 0.0254;
  }
  public static double convertInchesToCm(double Inches){
    return Inches * 2.54;
  }

  // Problem 6 Methods: 
  public static double convertFarhenheitToCelsius(double farhenheit){
    return (farhenheit - 32) * 5 / 9;
  }
  public static double convertCelsiusToFarhenheit(double celsius){
    return (celsius * 9 / 5) + 32;
  }  
  public static double convertPoundsToKilograms(double pounds){
    return pounds * 0.453592;
  }  
  public static double convertKilogramsToPounds(double kilograms){
    return kilograms * 2.20462;
  }  
  public static double convertGallonsToLiters(double gallons){
    return gallons * 3.78541;
  }  
  public static double convertLitersTogallons(double liters){
    return liters *  0.264172;
  }
}
