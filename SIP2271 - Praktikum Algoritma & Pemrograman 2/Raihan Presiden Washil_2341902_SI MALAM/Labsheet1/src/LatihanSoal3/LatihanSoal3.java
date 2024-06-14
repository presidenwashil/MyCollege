package LatihanSoal3;

import java.util.Scanner;

public class LatihanSoal3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta pengguna memasukkan data jam pertama
        System.out.print("Jam 1  : ");
        int jam1 = scanner.nextInt();

        System.out.print("Menit 1: ");
        int menit1 = scanner.nextInt();

        // Meminta pengguna memasukkan data jam kedua
        System.out.print("Jam 2  : ");
        int jam2 = scanner.nextInt();

        System.out.print("Menit 2: ");
        int menit2 = scanner.nextInt();

        // Menghitung selisih kedua jam
        int totalMenit1 = jam1 * 60 + menit1;
        int totalMenit2 = jam2 * 60 + menit2;
        int selisihMenit = Math.abs(totalMenit2 - totalMenit1);

        // Menampilkan selisih kedua jam
        System.out.println("Selisih kedua jam tersebut : " + selisihMenit + " menit");

        // Menutup scanner
        scanner.close();
    }
}
