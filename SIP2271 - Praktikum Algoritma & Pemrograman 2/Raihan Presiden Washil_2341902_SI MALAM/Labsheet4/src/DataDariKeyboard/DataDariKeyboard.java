package DataDariKeyboard;

import java.util.Scanner;

public class DataDariKeyboard {

    public static void main(String[] args) {
        double[] data = new double[10];
        int i, jumData;
        String str;
        char jawaban;
        Scanner scan = new Scanner(System.in);
        jumData = 0;
        for (i = 0; i < data.length - 1; i++) {
            System.out.print("Masukkan sebarang bilangan: ");
            data[i] = scan.nextDouble();
            scan.nextLine(); // Buang data tersisa         
            // Tampilkan konfirmasi pemasukan lagi
            if (i < data.length - 2) {
                System.out.print("Memasukkan lagi (Y/T)? ");
                str = scan.nextLine();
                jawaban = str.charAt(0);
                if (jawaban == 'T' || jawaban == 't') {
                    jumData = i + 1;
                    break;
                }
            }
        }
        // Tampilkan data
        for (i = 0; i < jumData; i++) {
            System.out.println(data[i]);
        }
    }
}
