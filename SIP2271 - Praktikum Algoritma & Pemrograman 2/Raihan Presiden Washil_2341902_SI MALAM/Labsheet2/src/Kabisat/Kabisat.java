package Kabisat;

import java.util.Scanner;

public class Kabisat {

    public static void main(String[] args) {
        int tahun;
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan tahun : ");
        tahun = scan.nextInt();
        if (tahun % 4 != 0) {
            System.out.println("Bukan tahun kabisat");
        } else if ((tahun % 100 == 0) && (tahun % 400 != 0)) {
            System.out.println("Bukan tahun kabisat");
        } else {
            System.out.println("Tahun kabisat");
        }
    }
}
