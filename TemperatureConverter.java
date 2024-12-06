import java.util.Scanner;

public class TemperatureConverter {
    static void goodBye(){
        System.out.println("Thank you for using Kelvin's temperature converter.");
        
    }
    public static void main(String[] args) {
        // This creates a scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user to choose the prefered method of conversion
        System.out.println("Welcome to Kelvin's Temperature Converter");

        System.out.println("May we know who is using this converter?");
        String name = scanner.nextLine();

        System.out.println("Hello " + name);
        System.out.println("Choose your prefered conversion");

        System.out.println("1. Convert Celsius to Fahrenheit");
        System.out.println("2. Convert Fahrenheit to Celsius");
        System.out.print("Enter your choice (1 or 2): ");
        
        int choice = 0;
        // Checks if the user's choice is valid
        while (true) {
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                if (choice == 1 || choice == 2) {
                    break;  // Break out the loop if input is valid
                } else {
                    System.out.print("Invalid choice! Please enter 1 or 2: ");
                }
            } else {
                System.out.print("Invalid input! Please enter 1 or 2: ");
                scanner.next();  // Clear the invalid input
            }
        }

        // Requests tempearture value from user
        double temperature = 0;
        System.out.print("Enter the temperature value: ");
        
        // Checks if user input is valid
        while (true) {
            if (scanner.hasNextDouble()) {
                temperature = scanner.nextDouble();
                break;  // This breaks out of the loop if temperature value is valid
            } else {
                System.out.print("Invalid temperature! Please enter a valid number: ");
                scanner.next();  // This clears the invalid inputs
            }
        }

        // This performs conversion operations based on the user's choice
        if (choice == 1) {
            // Convert Celsius to Fahrenheit
            double fahrenheit = (temperature * 9/5) + 32;
            System.out.printf("Okay " + name + " ,your inputed temperature %.2f in Celsius is equal to %.2f Fahrenheit.\n", temperature, fahrenheit);
            TemperatureConverter.goodBye();

        } else if (choice == 2) {
            
            // Convert Fahrenheit to Celsius
            double celsius = (temperature - 32) * 5/9;
            System.out.printf("Okay " + name + " ,your inputed temperature %.2f in Fahrenheit is equal to %.2f Celsius.\n", temperature, celsius);
            TemperatureConverter.goodBye();
        }

        // This closes the scanner object
        scanner.close();
    }
}