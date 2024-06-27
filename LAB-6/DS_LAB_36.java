//Create methods to convert temperature from Celsius to Fahrenhit and vice
//versa. Take temperature input from user and call the appropriate conversion
//method.
import java.util.Scanner;
public class DS_LAB_36 {
    public static void main(String[] args) {
        double celsius = 0.0, fahrenheit = 0.0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temperature in Celsius: ");
        celsius = sc.nextDouble();
        fahrenheit = convertCtoF(celsius);
        System.out.println("Temperature in Fahrenheit: " + fahrenheit);
        System.out.println("Enter the temprature in Fahrenheit: ");
        fahrenheit = sc.nextDouble();
        celsius = convertFtoC(fahrenheit);
        System.out.println("Temperature in Celsius: " + celsius);
    }
    public static double convertCtoF(double celsius){
        double fahrenheit = 0.0;
        fahrenheit = (celsius * 9/5) + 32;
        return fahrenheit;
    }
    public static double convertFtoC(double fahrenheit){
        double celsius = 0.0;
        celsius = (fahrenheit - 32) * 5/9;
        return celsius;
    }
}
