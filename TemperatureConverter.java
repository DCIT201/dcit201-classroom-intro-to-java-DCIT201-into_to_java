    //This is a method to convert from Celsius to Fahrenheit

public class TemperatureConverter {

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;

    }
    //This is a method to convert from Fahrenheit to Celsius

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;

    }
}
