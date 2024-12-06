import java.util.Scanner;

public class TemperatureConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Display the menu options 
        System.out.println("Smeak's Temperature Converter");
        System.out.println("1. Convert Celsius to Fahrenheit");
        System.out.println("2. Convert Fahrenheit to Celsius");

        // Get the user's choice
        System.out.print("Please choose an option(1 or 2): ");
        int choice = scanner.nextInt(); // Read the user's choice

        //Variable to hold the temperature value
        double temperature;

        //Check  the user's choice and get the temperature
        if (choice == 1) {
                //Celsius to Fahrenheit
                System.out.print("Enter temperature in2 Celsius: ");
                temperature = scanner.nextDouble(); // Read the temperature in Celsius 
                double fahrenheit = (temperature * 9 / 5) + 32; // Convert to Fahrenheit
                System.out.println(temperature + " Celsius is " + fahrenheit + "Fahrenheit."); // Display the result 
            } else if (choice == 2) {
                // Fahrenheit to Celsius
                System.out.print("Enter temperature in Fahrenheit: ");
                temperature = scanner.nextDouble(); // Read the temperature in Fahrenheit
                double celsius = (temperature - 32) * 5 / 9; // Convert to Celsius
                System.out.println(temperature + " Fahrenheit is " + celsius + " Celsius."); // Display the result
            } else {
                // Invalid choice
                System.out.println("Invalid choice. Please run the program again and select 1 or 2."); // Inforn the user of the invalid input
            }

        // Close the scanner 
        scanner.close(); // Close the scanner to free up resources 
    }
}
