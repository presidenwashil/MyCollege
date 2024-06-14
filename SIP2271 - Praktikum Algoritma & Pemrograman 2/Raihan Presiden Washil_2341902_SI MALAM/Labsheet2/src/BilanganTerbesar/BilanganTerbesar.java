package BilanganTerbesar;

import java.util.Scanner;

public class BilanganTerbesar {

    public static void main(String[] args) {
        double x, y, terbesar;
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan bilangan x : ");
        x = scan.nextDouble();
        System.out.print("Masukkan bilangan y : ");
        y = scan.nextDouble();
        terbesar = x;
        if (terbesar < y) {
            terbesar = y;
        }
        System.out.println("Bilangan terbesar = " + terbesar);
    }
}
