package BilanganTerbesar2;

import java.util.Scanner;

public class BilanganTerbesar2 {

    public static void main(String[] args) {
        double x, y;
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan bilangan x : ");
        x = scan.nextDouble();
        System.out.print("Masukkan bilangan y : ");
        y = scan.nextDouble();
        if (x > y) {
            System.out.println("Bilangan terbesar = " + x);
        } else {
            System.out.println("Bilangan terbesar = " + y);
        }
    }
}
