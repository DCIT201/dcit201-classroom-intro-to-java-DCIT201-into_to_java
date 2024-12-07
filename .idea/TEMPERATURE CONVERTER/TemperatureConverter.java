import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) { // Infinite loop to rerun the program
            double temp;
            double newTemp;
            int choice;

            // Prompt the user to choose a conversion option
            System.out.println("Choose a conversion option:");
            System.out.println("1. Convert Celsius to Fahrenheit");
            System.out.println("2. Convert Fahrenheit to Celsius");

            // Validate user choice
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter 1 or 2:");
                scanner.next(); // Consume invalid input
            }
            choice = scanner.nextInt();

            if (choice != 1 && choice != 2) {
                System.out.println("Invalid choice. Please enter 1 or 2.");
                continue; // Restart the loop
            }

            // Prompt the user to enter the temperature
            System.out.println("Enter the temperature: ");
            while (!scanner.hasNextDouble()) { // Validate temperature input
                System.out.println("Invalid input. Please enter a valid number for temperature:");
                scanner.next(); // Consume invalid input
            }
            temp = scanner.nextDouble();

            // Check for extreme temperatures
            if (temp < -273.15 || temp > 1_000_000) { // Example thresholds
                System.out.println("Extreme temperature detected. Please enter a realistic temperature.");
                continue; // Restart the loop
            }

            // Perform the conversion based on user choice
            if (choice == 1) {
                newTemp = (temp * 9 / 5) + 32; // Celsius to Fahrenheit
                System.out.printf("Converted temperature: %.1f°F%n", newTemp);
            } else {
                newTemp = (temp - 32) * 5 / 9; // Fahrenheit to Celsius
                System.out.printf("Converted temperature: %.1f°C%n", newTemp);
            }

            // Ask if the user wants to perform another conversion
            System.out.print("Do you want to perform another conversion? (yes/no): ");
            String response = scanner.next().toLowerCase();
            if (!response.equals("yes")) {
                System.out.println("Thank you for using the Temperature Converter!");
                break; // Exit the loop if the user does not want to continue
            }
        }

        // Close the scanner
        scanner.close();
    }
}
