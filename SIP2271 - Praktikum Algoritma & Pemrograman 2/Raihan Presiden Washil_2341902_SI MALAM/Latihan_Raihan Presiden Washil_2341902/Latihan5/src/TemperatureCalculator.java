
import java.util.Scanner;

public class TemperatureCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input suhu dalam Celcius: ");
        double C = input.nextDouble();
        double R = 32 / 5.0 * C;
        double K = C + 273.15;
        double F = 9.0 / 5.0 * C + 32;
        System.out.println("R: " + R);
        System.out.println("K: " + K);
        System.out.println("F: " + F);
    }
}
