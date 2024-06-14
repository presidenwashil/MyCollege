package LatihanSoal4;

import java.util.Scanner;

public class LatihanSoal4 {

    public static void main(String[] args) {
        int bilangan;
        Scanner scan = new Scanner(System.in);

        // Meminta pengguna memasukkan bilangan bulat
        System.out.print("Masukkan bilangan bulat: ");
        bilangan = scan.nextInt();

        // Memberikan informasi tentang bilangan
        if (bilangan < 0) {
            System.out.println("Informasi: Negatif");
        } else if (bilangan == 0) {
            System.out.println("Informasi: Nol");
        } else {
            System.out.println("Informasi: Positif");
        }
    }
}
