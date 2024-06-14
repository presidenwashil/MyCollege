package Pembagi;

import java.util.Scanner;

public class Pembagi {

    public static void main(String[] args) {
        int bil, i;
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan sebuah bilangan bulat positif:");
        bil = scan.nextInt();
        for (i = 1; i <= bil; i++) {
            if (bil % i == 0) {
                System.out.println(i);
            }
        }
    }
}
