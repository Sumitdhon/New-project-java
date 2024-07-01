package Project;

import java.util.Scanner;

public class TemperatureCalculator {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Temperature Calculator");
    System.out.println("1. Celsius to Fahrenheit");
    System.out.println("2. Fahrenheit to Celsius");
    System.out.print("Choose an option: ");

    int option = scanner.nextInt();

    System.out.print("Enter temperature: ");
    double temperature = scanner.nextDouble();

    double result;

    if (option == 1) {
      result = celsiusToFahrenheit(temperature);
      System.out.printf("%.2f Celsius is %.2f Fahrenheit%n", temperature, result);
    } else if (option == 2) {
      result = fahrenheitToCelsius(temperature);
      System.out.printf("%.2f Fahrenheit is %.2f Celsius%n", temperature, result);
    } else {
      System.out.println("Invalid option");
    }
  }

  private static double celsiusToFahrenheit(double celsius) {
    return (celsius * 9/5) + 32;
  }

  private static double fahrenheitToCelsius(double fahrenheit) {
    return (fahrenheit - 32) * 5/9;
  }
}

