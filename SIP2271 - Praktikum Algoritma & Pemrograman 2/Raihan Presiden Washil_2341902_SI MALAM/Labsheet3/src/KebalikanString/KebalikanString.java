package KebalikanString;

import java.util.Scanner;

public class KebalikanString {

    public static void main(String[] args) {
        String suatuString;
        int indeks, jumlahKar;
        char karakter;
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan suatu string ");
        suatuString = scan.nextLine();
        jumlahKar = suatuString.length();
        indeks = jumlahKar - 1;
        while (indeks >= 0) {
            karakter = suatuString.charAt(indeks);
            System.out.print(karakter);
            indeks = indeks - 1;
        }
    }
}
