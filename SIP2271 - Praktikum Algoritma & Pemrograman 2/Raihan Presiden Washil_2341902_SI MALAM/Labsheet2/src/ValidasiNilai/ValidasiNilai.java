package ValidasiNilai;

import java.util.Scanner;

public class ValidasiNilai {

    public static void main(String[] args) {
        double nilai;
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan nilai ujian : ");
        nilai = scan.nextDouble();
        if (nilai >= 0 && nilai <= 100) {
            System.out.println("Nilai Absah");
        } else {
            System.out.println("Nilai Tidak Absah");
        }
    }
}
