package LatihanSoal2;

import java.util.Scanner;

public class LatihanSoal2 {

    public static void main(String[] args) {
        double nilaiUjian;
        Scanner scan = new Scanner(System.in);

        // Meminta pengguna memasukkan nilai ujian
        System.out.print("Masukkan nilai ujian: ");
        nilaiUjian = scan.nextDouble();

        // Menentukan keterangan kelulusan
        if (nilaiUjian >= 60) {
            System.out.println("Keterangan: LULUS");
        } else {
            System.out.println("Keterangan: TIDAK LULUS");
        }
    }
}
