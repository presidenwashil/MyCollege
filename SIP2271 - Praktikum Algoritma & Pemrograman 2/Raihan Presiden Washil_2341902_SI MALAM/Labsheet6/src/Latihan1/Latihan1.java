package Latihan1;

public class Latihan1 {

    public static void main(String[] args) {
        // Menguji subrutin hitungRataRata
        double[] A = {4.5, 3.8, 5.2, 4.0, 3.5};
        int n = A.length;
        double rataRata = hitungRataRata(A, n);
        System.out.println("Rata-rata dari array: " + rataRata);
    }

    // Subrutin untuk menghitung rata-rata dari array bilangan real
    public static double hitungRataRata(double[] A, int n) {
        double total = 0;
        for (int i = 0; i < n; i++) {
            total += A[i];
        }
        return total / n;
    }
}
