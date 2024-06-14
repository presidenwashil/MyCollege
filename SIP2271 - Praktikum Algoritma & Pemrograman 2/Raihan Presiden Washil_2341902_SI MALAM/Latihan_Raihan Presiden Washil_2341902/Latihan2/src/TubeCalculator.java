
import java.util.Scanner;

public class TubeCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get the radius and height of the tube
        System.out.println("Masukan jari-jari (cm): ");
        double radius = input.nextDouble();

        System.out.println("Masukan tinggi (cm): ");
        double height = input.nextDouble();

        // Calculate the area and circumference of the tube
        double LuasSelimut = 2 * Math.PI * radius * height;
        double Keliling = 2 * Math.PI * radius;

        // Print the results
        System.out.println("Luas selimut tabung : " + LuasSelimut + " sentimeter persegi ");
        System.out.println("Keliling tabung: " + Keliling + " sentimeter persegi");
    }
}
