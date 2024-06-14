package BilanganGenap;

import java.util.Scanner;

public class BilanganGenap {

    public static void main(String[] args) {
        int bilangan;
        Scanner scan = new Scanner(System.in);
        System.out.print("Bilangan bulat : ");
        bilangan = scan.nextInt();
        if (bilangan % 2 == 0) {
            System.out.println("Bilangan genap");
        } else {
            System.out.println("Bilangan ganjil");
        }
    }
}
