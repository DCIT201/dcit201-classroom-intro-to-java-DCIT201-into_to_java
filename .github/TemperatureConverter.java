
import java.util.Scanner;

public class TemperatureConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Temperature Converter");
        System.out.println("1. Convert Celsius to Fahrenheit");
        System.out.println("2. Convert Fahrenheit to Celsius");
        System.out.print("Enter your choice (1 or 2): ");

        int choice = scanner.nextInt();

        // Validate the choice
        if (choice != 1 && choice != 2) {
            System.out.println("Invalid choice. Please restart.");
            return;
        }

        System.out.print("Enter the temperature to convert: ");
        double temperature = scanner.nextDouble();
        double convertedTemperature;
        if (choice == 1) {
            // Celsius to Fahrenheit
            convertedTemperature = (temperature * 9 / 5) + 32;
            System.out.printf("%.2f Celsius is %.2f Fahrenheit.%n", temperature, convertedTemperature);
        } else {
            // Fahrenheit to Celsius
            convertedTemperature = (temperature - 32) * 5 / 9;
            System.out.printf("%.2f Fahrenheit is %.2f Celsius.%n", temperature, convertedTemperature);
        }

        scanner.close();
    }
}
