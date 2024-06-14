package Bulan2;

import java.util.Scanner;

public class Bulan2 {

    public static void main(String[] args) {
        int kodeBulan;
        String namaBulan;
        Scanner scan = new Scanner(System.in);
        System.out.print("Kode bulan (1..12) : ");
        kodeBulan = scan.nextInt();
        switch (kodeBulan) {
            case 1:
                namaBulan = "Januari";
                break;
            case 2:
                namaBulan = "Februari";
                break;
            case 3:
                namaBulan = "Maret";
                break;
            case 4:
                namaBulan = "April";
                break;
            case 5:
                namaBulan = "Mei";
                break;
            case 6:
                namaBulan = "Juni";
                break;
            case 7:
                namaBulan = "Juli";
                break;
            case 8:
                namaBulan = "Agustus";
                break;
            case 9:
                namaBulan = "September";
                break;
            case 10:
                namaBulan = "Oktober";
                break;
            case 11:
                namaBulan = "November";
                break;
            case 12:
                namaBulan = "Desember";
                break;
            default:
                namaBulan = "Salah kode bulan";
        }
        System.out.println(namaBulan);
    }
}
