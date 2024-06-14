package PredikatKelulusan;

import java.util.Scanner;

public class PredikatKelulusan {

    public static void main(String[] args) {
        double ip;
        Scanner scan = new Scanner(System.in);
        System.out.print("IP Kumulatif : ");
        ip = scan.nextDouble();
        if (ip >= 2 && ip <= 2.75) {
            System.out.println("Lulus Memuaskan");
        } else if (ip > 2.75 && ip <= 3.50) {
            System.out.println("Lulus Sangat Memuaskan");
        } else if (ip > 3.50 && ip <= 4.00) {
            System.out.println("Lulus Dengan Pujian");
        } else {
            System.out.println("Data IP Tidak Valid");
        }
    }
}
