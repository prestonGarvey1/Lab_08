import java.util.Scanner;

public class Task_06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double celsius = 0;
        celsius = InputHelper.celsiusToFahrenheit(scan, celsius);
        System.out.printf("Your temperature in degrees fahrenheit is:    %.2f%n", celsius);

    }
}
