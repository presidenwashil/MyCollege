package Kamus2;

import java.util.Scanner;

public class Kamus2 {

    public static void main(String[] args) {
        String kataInggris, kataIndo;
        Scanner scan = new Scanner(System.in);
        System.out.print("Kata (one, two, atau three) : ");
        kataInggris = scan.nextLine();
        // ubah huruf KAPITAL ke huruf kecil
        kataInggris = kataInggris.toLowerCase();
        if (kataInggris.equals("one")) {
            System.out.println("satu");
        } else if (kataInggris.equals("two")) {
            System.out.println("dua");
        } else if (kataInggris.equals("three")) {
            System.out.println("tiga");
        } else {
            System.out.println("Maaf saya tidak tahu");
        }
    }
}
