package JumlahHari;

import java.util.Scanner;

public class JumlahHari {

    public static void main(String[] args) {
        int kodeBulan;
        String namaBulan;
        Scanner scan = new Scanner(System.in);
        System.out.print("Kode bulan (1..12) : ");
        kodeBulan = scan.nextInt();
        if (kodeBulan == 2) {
            System.out.println("Jumlah hari 28 atau 29");
        } else if (kodeBulan == 1 || kodeBulan == 3
                || kodeBulan == 5 || kodeBulan == 7
                || kodeBulan == 8 || kodeBulan == 10
                || kodeBulan == 12) {
            System.out.println("Jumlah hari 31");
        } else if (kodeBulan == 4 || kodeBulan == 6
                || kodeBulan == 9 || kodeBulan == 11) {
            System.out.println("Jumlah hari 30");
        } else {
            System.out.println("Salah kode bulan");
        }
    }
}
