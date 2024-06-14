package Maximum2;

import java.util.Scanner;

public class Maximum2 {

    public static void main(String[] args) {
        double x, y, z, terbesar;
        Scanner scan = new Scanner(System.in);
        System.out.print("Bilangan x : ");
        x = scan.nextDouble();
        System.out.print("Bilangan y : ");
        y = scan.nextDouble();
        System.out.print("Bilangan z : ");
        z = scan.nextDouble();
        if (x > y && x > z) {
            terbesar = x;
        } else if (y > x && y > z) {
            terbesar = y;
        } else {
            terbesar = z;
        }
        System.out.println("Terbesar = " + terbesar);
    }
}
