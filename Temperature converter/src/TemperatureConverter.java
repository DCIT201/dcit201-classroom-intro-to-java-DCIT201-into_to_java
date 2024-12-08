import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) throws Exception {
        
/*
Write a Java program that converts temperatures between Celsius and Fahrenheit. Your program should:
Prompt the user to choose between the following options:
Convert Celsius to Fahrenheit.
Convert Fahrenheit to Celsius.
Take the temperature value as input from the user.
Perform the conversion based on the user's choice using the following formulas:
Celsius to Fahrenheit: F = (C × 9/5) + 32
Fahrenheit to Celsius: C = (F - 32) × 5/9
Display the converted temperature in a user-friendly format.
*/

Scanner scanner = new Scanner(System.in);

System.out.println("To convert from Celcius to Fahrenheit, please press 1 ");
System.out.println("To convert from Fahrenheit to Celcius, please press 2 ");
byte TemperatureConverter = scanner.nextByte();

switch (TemperatureConverter) {
    case 1:
    System.out.println("Welcome to a Celcius to Fahrenheit converter ");
    System.out.print("Please enter a temperature in degree Celcius: ");

    float celcius = scanner.nextFloat();

    float Fahrenheit = (celcius * 9/5) + 32 ;

    System.out.println(celcius + " degree celcius is " + Fahrenheit + " fahrenheit");
    break;

    case 2:
    System.out.println("Welcome to a Fahrenheit to Celcius converter ");
    System.out.print("Please enter a temperature in degree Fahrenheit: ");

    float fahrenheit = scanner.nextFloat();

    float Celcius = (fahrenheit - 32) * 5/9;

    System.out.println(fahrenheit + " degree fahrenheit is " + Celcius + " celcius");
    break;
  


    default: System.out.println("Neither option was selected. Exiting... ");
        break;
}
    
}

}