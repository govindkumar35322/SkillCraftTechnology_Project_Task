import java.util.Scanner;

public class TemperatureConverter {

    // Convert Fahrenheit to Kelvin
    public static double fahrenheitToKelvin(double fahrenheit) {
        return (fahrenheit - 32) * 5/9 + 273.15;
    }

    // Convert Kelvin to Fahrenheit
    public static double kelvinToFahrenheit(double kelvin) {
        return (kelvin - 273.15) * 9/5 + 32;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Temperature Converter: Fahrenheit <-> Kelvin");
        System.out.println("1: Convert Fahrenheit to Kelvin");
        System.out.println("2: Convert Kelvin to Fahrenheit");
        System.out.print("Choose an option (1 or 2): ");
        int choice = scanner.nextInt();
        
        if (choice == 1) {
            System.out.print("Enter temperature in Fahrenheit: ");
            double fahrenheit = scanner.nextDouble();
            double kelvin = fahrenheitToKelvin(fahrenheit);
            System.out.printf("%.2f Fahrenheit is equal to %.2f Kelvin\n", fahrenheit, kelvin);
        } else if (choice == 2) {
            System.out.print("Enter temperature in Kelvin: ");
            double kelvin = scanner.nextDouble();
            double fahrenheit = kelvinToFahrenheit(kelvin);
            System.out.println("%.2f Kelvin is equal to %.2f Fahrenheit\n", kelvin, fahrenheit);
        } else {
            System.out.println("Invalid choice! Please run the program again and select either 1 or 2.");
        }
        
        scanner.close();
    }
}
