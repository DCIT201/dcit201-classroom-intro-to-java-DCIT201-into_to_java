import java.util.Scanner;

public class TemperatureConverter {

    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Greet the user
        System.out.println("Welcome to the Temperature Converter!");
        System.out.println("Choose an option to get started:");
        System.out.println("1. Convert Celsius to Fahrenheit");
        System.out.println("2. Convert Fahrenheit to Celsius");

        // Variable to store the user's choice
        int choice;

        // Keep asking for a valid choice until the user provides one
        while (true) {
            System.out.print("Enter 1 or 2: ");
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                if (choice == 1 || choice == 2) {
                    break; // Exit the loop if the choice is valid
                } else {
                    System.out.println("That’s not a valid choice. Please enter 1 or 2.");
                }
            } else {
                System.out.println("Oops, that doesn't look like a number. Try again.");
                scanner.next(); // Clear the invalid input
            }
        }

        // Ask for the temperature to convert
        double temperature;
        while (true) {
            System.out.print("Enter the temperature you want to convert: ");
            if (scanner.hasNextDouble()) {
                temperature = scanner.nextDouble();
                break; // Exit the loop if valid input
            } else {
                System.out.println("That’s not a valid number. Please enter a valid temperature.");
                scanner.next(); // Clear the invalid input
            }
        }

        // Variable to store the converted temperature
        double convertedTemperature;

        // Perform the conversion based on the user's choice
        if (choice == 1) {
            // Convert Celsius to Fahrenheit
            convertedTemperature = (temperature * 9 / 5) + 32;
            System.out.printf("%.2f degrees Celsius is %.2f degrees Fahrenheit.%n", temperature, convertedTemperature);
        } else {
            // Convert Fahrenheit to Celsius
            convertedTemperature = (temperature - 32) * 5 / 9;
            System.out.printf("%.2f degrees Fahrenheit is %.2f degrees Celsius.%n", temperature, convertedTemperature);
        }

        // Say goodbye to the user
        System.out.println("Thanks for using the Temperature Converter. Have a nice day!");
        scanner.close(); // Close the scanner
    }
}
