package Latihan1;

public class Latihan1 {

    public static void main(String[] args) {
        // Menampilkan 20 bilangan genap pertama
        System.out.println("20 Bilangan Genap Pertama:");
        int count = 0;
        int number = 0;

        while (count < 20) {
            if (number % 2 == 0) {
                System.out.println(number);
                count++;
            }
            number++;
        }
    }
}
