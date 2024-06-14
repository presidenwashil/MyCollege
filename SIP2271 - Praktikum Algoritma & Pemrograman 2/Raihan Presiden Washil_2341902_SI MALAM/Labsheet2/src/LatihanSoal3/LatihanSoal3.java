package LatihanSoal3;

import java.util.Scanner;

public class LatihanSoal3 {

    public static void main(String[] args) {
        double bilangan;
        Scanner scan = new Scanner(System.in);

        // Meminta pengguna memasukkan bilangan
        System.out.print("Masukkan bilangan: ");
        bilangan = scan.nextDouble();

        // Menghitung nilai absolut
        double nilaiAbsolut = Math.abs(bilangan);

        // Menampilkan nilai absolut
        System.out.println("Nilai absolut dari " + bilangan + " adalah: " + nilaiAbsolut);
    }
}
