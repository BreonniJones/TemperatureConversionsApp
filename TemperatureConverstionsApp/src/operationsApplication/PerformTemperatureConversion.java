package operationsApplication;

import java.util.Scanner;
import operationsLibrary.TemperatureConverter;

public class PerformTemperatureConversion {

    public void startConversion() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose conversion type:");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter temperature in Celsius: ");
                double celsius = scanner.nextDouble();
                double fahrenheit = TemperatureConverter.celsiusToFahrenheit(celsius);
                System.out.println(celsius + "°C is " + fahrenheit + "°F");
                break;

            case 2:
                System.out.print("Enter temperature in Fahrenheit: ");
                fahrenheit = scanner.nextDouble();
                celsius = TemperatureConverter.fahrenheitToCelsius(fahrenheit);
                System.out.println(fahrenheit + "°F is " + celsius + "°C");
                break;

            default:
                System.out.println("Invalid choice.");
                break;
        }
        scanner.close();
    }
}
