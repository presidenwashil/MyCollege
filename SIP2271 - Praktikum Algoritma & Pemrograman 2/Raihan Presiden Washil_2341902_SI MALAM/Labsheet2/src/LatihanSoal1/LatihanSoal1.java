package LatihanSoal1;

import java.util.Scanner;

public class LatihanSoal1 {

    public static void main(String[] args) {
        double x, y, terbesar;
        Scanner scan = new Scanner(System.in);

        // Meminta pengguna memasukkan nilai x dan y
        System.out.print("Masukkan nilai x: ");
        x = scan.nextDouble();
        System.out.print("Masukkan nilai y: ");
        y = scan.nextDouble();

        // Menentukan bilangan terbesar
        if (x > y) {
            terbesar = x;
        } else {
            terbesar = y;
        }

        // Menampilkan bilangan terbesar
        System.out.println("Bilangan terbesar adalah: " + terbesar);
    }
}
