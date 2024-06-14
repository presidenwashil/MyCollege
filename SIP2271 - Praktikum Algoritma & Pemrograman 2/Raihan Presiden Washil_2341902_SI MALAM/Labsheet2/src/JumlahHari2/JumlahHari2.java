package JumlahHari2;

import java.util.Scanner;

public class JumlahHari2 {

    public static void main(String[] args) {
        int kodeBulan;
        String namaBulan;
        Scanner scan = new Scanner(System.in);
        System.out.print("Kode bulan (1..12) : ");
        kodeBulan = scan.nextInt();
        switch (kodeBulan) {
            case 2:
                System.out.println("Jumlah hari 28 atau 29");
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Jumlah hari 31");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Jumlah hari 30");
                break;
            default:
                System.out.println("Salah kode bulan");
        }
    }
}
