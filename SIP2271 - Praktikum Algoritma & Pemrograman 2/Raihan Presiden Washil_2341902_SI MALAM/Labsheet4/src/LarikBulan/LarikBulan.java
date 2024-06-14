package LarikBulan;

import java.util.Scanner;

public class LarikBulan {

    public static void main(String[] args) {
        String[] namaBulan
                = {"", "Januari", "Februari",
                    "Maret", "April", "Mei",
                    "Juni", "Juli", "Agustus",
                    "September", "Oktober",
                    "November", "Desember"};
        int kodeBulan;
        Scanner scan = new Scanner(System.in);
        System.out.print("Kode bulan (1..12): ");
        kodeBulan = scan.nextInt();
        if (kodeBulan >= 1 && kodeBulan <= 12) {
            System.out.println("Bulan : "
                    + namaBulan[kodeBulan]);
        } else {
            System.out.println("Kode bulan harus antara 1 s/d 12");
        }
    }
}
