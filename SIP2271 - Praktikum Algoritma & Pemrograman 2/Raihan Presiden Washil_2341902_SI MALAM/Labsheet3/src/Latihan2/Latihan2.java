package Latihan2;

public class Latihan2 {

    public static void main(String[] args) {
        // Menampilkan konversi suhu dari derajat Celsius ke Fahrenheit dan Reamur
        System.out.println("Konversi Suhu dari derajat Celsius ke Fahrenheit dan Reamur");
        System.out.println("C\tR\tF");

        // Loop dari suhu 0 derajat Celsius hingga 100 derajat Celsius
        for (int celsius = 0; celsius <= 100; celsius++) {
            // Konversi suhu
            double fahrenheit = (9.0 / 5.0 * celsius) + 32;
            double reamur = 4.0 / 5.0 * celsius;

            // Menampilkan hasil konversi
            System.out.printf("%d\t%.2f\t%.2f%n", celsius, reamur, fahrenheit);
        }
    }
}
