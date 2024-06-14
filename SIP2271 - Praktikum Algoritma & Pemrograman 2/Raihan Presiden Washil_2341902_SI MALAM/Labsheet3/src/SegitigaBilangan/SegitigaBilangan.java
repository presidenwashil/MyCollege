package SegitigaBilangan;

import java.util.Scanner;

public class SegitigaBilangan {

    public static void main(String[] args) {
        int i, j, tinggi, bil;
        Scanner scan = new Scanner(System.in);
        System.out.print("Tinggi segitiga : ");
        tinggi = scan.nextInt();
        for (i = 1; i <= tinggi; i++) {
            bil = i;
            for (j = 1; j <= i; j++) {
                System.out.print(String.format("%3d", bil));
                bil = bil + tinggi - j;
            }
            System.out.println(); // Pindah baris 
        }
    }
}
