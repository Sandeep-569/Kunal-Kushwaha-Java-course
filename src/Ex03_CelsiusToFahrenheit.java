import java.util.Scanner;
public class Ex03_CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double Celsius = sc.nextDouble();

        double Fahrenheit = (Celsius*9/5) +32;
        System.out.println(Fahrenheit);

    }
}
