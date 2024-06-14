package Bulan;

import java.util.Scanner;

public class Bulan {

    public static void main(String[] args) {
        int kodeBulan;
        String namaBulan;
        Scanner scan = new Scanner(System.in);
        System.out.print("Kode bulan (1..12) : ");
        kodeBulan = scan.nextInt();
        if (kodeBulan == 1) {
            namaBulan = "Januari";
        } else if (kodeBulan == 2) {
            namaBulan = "Februari";
        } else if (kodeBulan == 3) {
            namaBulan = "Maret";
        } else if (kodeBulan == 4) {
            namaBulan = "April";
        } else if (kodeBulan == 5) {
            namaBulan = "Mei";
        } else if (kodeBulan == 6) {
            namaBulan = "Juni";
        } else if (kodeBulan == 7) {
            namaBulan = "Juli";
        } else if (kodeBulan == 8) {
            namaBulan = "Agustus";
        } else if (kodeBulan == 9) {
            namaBulan = "September";
        } else if (kodeBulan == 10) {
            namaBulan = "Oktober";
        } else if (kodeBulan == 11) {
            namaBulan = "November";
        } else if (kodeBulan == 12) {
            namaBulan = "Desember";
        } else {
            namaBulan = "Salah kode bulan";
        }
        System.out.println(namaBulan);
    }
}
