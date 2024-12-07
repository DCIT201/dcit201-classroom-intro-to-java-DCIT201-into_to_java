import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
       try (Scanner scanner = new Scanner(System.in)) {
        System.out.println("Hello to my Temperature Converter, we got you covered");
           System.out.println("Choose an option ");
           System.out.println("1. Celsius to Fahrenheit");
           System.out.println("2. Fahrenheit to Celsius"); 

            int option = scanner.nextInt();

            if (option == 1) {
                System.out.println("Enter the temperature in Celsius");
                double celsius = scanner.nextDouble();
                if (celsius < -273.15) { // Check for temperatures below absolute zero
                    System.out.println("Error: Temperatures below -273.15°C are not possible.");
                } else {
                    double fahrenheit = (celsius * 9/5) + 32;
                    System.out.println("The temperature in Fahrenheit is " + fahrenheit);
                }
            } else if (option == 2) {
                System.out.println("Enter the temperature in Fahrenheit");
                double fahrenheit = scanner.nextDouble();
                if (fahrenheit < -459.67) { // Check for temperatures below absolute zero
                    System.out.println("Error: Temperatures below -459.67°F are not possible.");
                } else {
                    double celsius = (fahrenheit - 32) * 5/9;
                    System.out.println("The temperature in Celsius is " + celsius);
                }
            } else {
                System.out.println("Invalid option");
            }
    }
    }
}
     
     //The program starts by displaying a welcome message and the available options. 
     //The user is prompted to choose an option. 
     //If the user chooses option 1, the program asks for the temperature in Celsius and converts it to Fahrenheit. 
     //If the user chooses option 2, the program asks for the temperature in Fahrenheit and converts it to Celsius. 
     //The program also checks for temperatures below absolute zero. The absolute zero is the lowest possible temperature, which is 0 Kelvin or -273.15°C. 
     //Let’s run the program and test it: 
     //Hello to my Temperature Converter, we got you covered
     // Glago Gideon Elorm