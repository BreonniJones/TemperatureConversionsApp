package operationsUnitTesting;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import operationsLibrary.TemperatureConverter;

public class TemperatureUnitTesting {

    // Test conversion from Celsius to Fahrenheit
    @Test
    public void testCelsiusToFahrenheit() {
        // Arrange
        double celsius = 0.0;

        // Act
        double fahrenheit = TemperatureConverter.celsiusToFahrenheit(celsius);

        // Assert
        assertEquals(32.0, fahrenheit, 0.001);  // Allowing small delta for floating-point precision
    }

    // Test conversion from Fahrenheit to Celsius
    @Test
    public void testFahrenheitToCelsius() {
        // Arrange
        double fahrenheit = 32.0;

        // Act
        double celsius = TemperatureConverter.fahrenheitToCelsius(fahrenheit);

        // Assert
        assertEquals(0.0, celsius, 0.001);  // Allowing small delta for floating-point precision
    }
}
