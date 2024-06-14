package TabelBilangan;

import java.util.Scanner;

public class TabelBilangan {

    public static void main(String[] args) {
        int i, j, jumlahBaris, jumlahKolom, bil;
        Scanner scan = new Scanner(System.in);
        System.out.print("Jumlah baris : ");
        jumlahBaris = scan.nextInt();
        System.out.print("Jumlah kolom : ");
        jumlahKolom = scan.nextInt();
        for (i = jumlahBaris; i >= 1; i--) {
            bil = i;
            for (j = 1; j <= jumlahKolom; j++) {
                System.out.print(String.format("%3d", bil));
                bil = bil + jumlahBaris;
            }
            System.out.println(); // Pindah baris 
        }
    }
}
