package Segitiga;

import java.util.Scanner;

public class Segitiga {

    public static void main(String[] args) {
        int i, j, tinggi;
        Scanner scan = new Scanner(System.in);
        System.out.print("Tinggi segitiga : ");
        tinggi = scan.nextInt();
        for (i = 1; i <= tinggi; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println(); //pindah baris
        }
    }
}
