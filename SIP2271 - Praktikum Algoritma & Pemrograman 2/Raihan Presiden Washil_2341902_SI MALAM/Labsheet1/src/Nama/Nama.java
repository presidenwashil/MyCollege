package Nama;

import java.util.Scanner;

public class Nama {

    public static void main(String[] args) {
        String namaMu;
        Scanner scan = new Scanner(System.in);
        System.out.print("Siapa namamu? ");

        namaMu = scan.nextLine();
        System.out.print("Hai ! Namamu " + namaMu + ", kan ?");
    }
}
