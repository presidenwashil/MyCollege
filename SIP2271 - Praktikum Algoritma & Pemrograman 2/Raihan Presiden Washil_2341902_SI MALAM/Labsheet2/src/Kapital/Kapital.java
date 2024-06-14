package Kapital;

import java.util.Scanner;

public class Kapital {

    public static void main(String[] args) {
        char karakter;
        String str;
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan sebuah karakter : ");
        str = scan.nextLine();
        karakter = str.charAt(0);// membaca indeks ke nol / karakter paling depan
        if (karakter >= 'A' && karakter <= 'Z') {
            System.out.println(karakter + " termasuk huruf kapital");
        } else {
            System.out.println(karakter + " bukan huruf kapital");
        }
    }
}
