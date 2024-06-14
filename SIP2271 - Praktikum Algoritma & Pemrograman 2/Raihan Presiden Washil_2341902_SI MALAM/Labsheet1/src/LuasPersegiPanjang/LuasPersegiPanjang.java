package LuasPersegiPanjang;

import java.util.Scanner;

public class LuasPersegiPanjang {

    public static void main(String[] args) {
        int panjang, lebar, luas;
        Scanner scan = new Scanner(System.in);
        System.out.println("Menghitung Luas Persegi Panjang ");
        System.out.print("Masukkan panjang = ");
        panjang = scan.nextInt();
        System.out.print("Masukkan lebar = ");
        lebar = scan.nextInt();
        luas = panjang * lebar;
        System.out.println("Luas = " + luas);
    }
}
