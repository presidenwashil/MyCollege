package Latihan2;

import java.util.Scanner;

public class Latihan2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input ukuran matriks
        System.out.print("Masukkan jumlah baris (m): ");
        int m = scanner.nextInt();
        System.out.print("Masukkan jumlah kolom (n): ");
        int n = scanner.nextInt();

        // Inisialisasi matriks
        int[][] matriks1 = new int[m][n];
        int[][] matriks2 = new int[m][n];
        int[][] matriks3 = new int[m][n];

        // Input data untuk matriks 1
        System.out.println("Masukkan data untuk matriks 1:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Matriks1[" + i + "][" + j + "]: ");
                matriks1[i][j] = scanner.nextInt();
            }
        }

        // Input data untuk matriks 2
        System.out.println("Masukkan data untuk matriks 2:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Matriks2[" + i + "][" + j + "]: ");
                matriks2[i][j] = scanner.nextInt();
            }
        }

        // Penjumlahan matriks
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matriks3[i][j] = matriks1[i][j] + matriks2[i][j];
            }
        }

        // Menampilkan matriks hasil penjumlahan
        System.out.println("Matriks hasil penjumlahan:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriks3[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
