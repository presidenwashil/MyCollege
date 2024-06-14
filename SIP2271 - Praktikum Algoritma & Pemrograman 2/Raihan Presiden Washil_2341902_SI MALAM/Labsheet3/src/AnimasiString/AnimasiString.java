package AnimasiString;

import java.util.Scanner;

public class AnimasiString {

    public static void main(String[] args) {
        String suatuString;
        int i, j, panjang;
        char karakter;
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan sebarang string: ");
        suatuString = scan.nextLine();
        panjang = suatuString.length();
        for (i = 0; i < panjang; i++) {
            for (j = i; j < panjang; j++) {
                karakter = suatuString.charAt(j);
                System.out.print(karakter);
            }
            System.out.println(); // Pindah baris
        }
    }
}
