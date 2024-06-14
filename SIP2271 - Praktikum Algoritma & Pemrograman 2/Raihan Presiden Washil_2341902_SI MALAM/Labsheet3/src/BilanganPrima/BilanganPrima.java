package BilanganPrima;

import java.util.Scanner;

public class BilanganPrima {

    public static void main(String[] args) {
        int bil, jum, i;
        Scanner scan = new Scanner(System.in);
        System.out.print("Bilangan bulat positif : ");
        bil = scan.nextInt();
        jum = 0;
        for (i = 1; i <= bil; i++) {
            if (bil % i == 0) {
                jum++;
            }
        }
        // Periksa isi jum
        if (jum == 2) {
            System.out.println("Bilangan prima");
        } else {
            System.out.println("Bukan bilangan prima");
        }
    }
}
