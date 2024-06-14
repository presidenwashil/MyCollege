package LatihanSoal5;

import java.util.Scanner;

public class LatihanSoal5 {

    public static void main(String[] args) {
        int nomorSaluran;
        String namaStasiun = "";

        // Membuat array untuk menyimpan nama stasiun TV
        String[] stasiunTV = {"TRANSTV", "RCTI", "NET", "ANTV", "TRANS7", "TVONE"};

        Scanner scan = new Scanner(System.in);

        // Meminta pengguna memasukkan nomor saluran
        System.out.print("Masukkan nomor saluran: ");
        nomorSaluran = scan.nextInt();

        // Menentukan nama stasiun berdasarkan nomor saluran
        if (nomorSaluran >= 1 && nomorSaluran <= 6) {
            namaStasiun = stasiunTV[nomorSaluran - 1];
        } else {
            namaStasiun = "Tidak ada stasiun untuk nomor saluran tersebut";
        }

        // Menampilkan nama stasiun
        System.out.println("Nama stasiun TV untuk nomor saluran " + nomorSaluran + " adalah: " + namaStasiun);
    }
}
