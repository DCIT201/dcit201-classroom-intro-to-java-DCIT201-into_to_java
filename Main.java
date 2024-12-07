
import java.util.Scanner; // Import Scanner class for user input

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a scanner object to accept input

        System.out.println("Choose an option: ");
        System.out.println("1. Convert celsius to fahrenheit"); // Option 1
        System.out.println("2. Convert fahrenheit to celsius"); // Option 2
        System.out.println("Enter your choice 1 or 2: "); // Ask the user to select an option

        int option = scanner.nextInt(); // Accept the user choice

        System.out.println("Enter the temperature "); // Ask the user to input the desired temperature to be converted

        double temperature = scanner.nextDouble(); // Accept the user's temperature

        if (option == 1) // Execute the appropriate conversion based on the user's choice
        {
            double result = TemperatureConverter.celsiusToFahrenheit(temperature); // Stores the result
            System.out.println(temperature + " degree Celsius is " + result + " degree Fahrenheit");
        } else if (option == 2) // Executes if user chooses option 2
        {
            double result = TemperatureConverter.fahrenheitToCelsius(temperature); // Stores the result
            System.out.println(temperature + " degree Fahrenheit is " + result + " degree Celsius");
        } else // Displays if user inputs an invalid option
        {
            System.out.println("Invalid choice");
        }
        scanner.close();

    }
}
