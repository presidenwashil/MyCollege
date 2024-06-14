package LatihanSoal2;

import java.util.Scanner;

public class LatihanSoal2 {

    public static void main(String[] args) {
        // Membuat objek Scanner untuk membaca input dari keyboard
        Scanner scanner = new Scanner(System.in);

        // Meminta pengguna memasukkan dua bilangan bulat
        System.out.print("Masukkan bilangan pertama: ");
        int bilangan1 = scanner.nextInt();

        System.out.print("Masukkan bilangan kedua: ");
        int bilangan2 = scanner.nextInt();

        // Menampilkan jumlah kedua bilangan
        int jumlah = bilangan1 + bilangan2;
        System.out.println("Jumlah kedua bilangan adalah: " + jumlah);

        // Menutup objek Scanner
        scanner.close();
    }
}
