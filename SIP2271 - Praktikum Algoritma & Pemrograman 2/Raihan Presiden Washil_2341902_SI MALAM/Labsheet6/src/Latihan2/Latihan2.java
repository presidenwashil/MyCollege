package Latihan2;

public class Latihan2 {

    public static void main(String[] args) {
        // Menguji subrutin ip
        char[] Nilai = {'A', 'A', 'B', 'C'};
        int[] Sks = {3, 2, 3, 3};
        int n = Nilai.length;
        double ip = hitungIP(Nilai, Sks, n);
        System.out.println("Indeks Prestasi (IP): " + ip);
    }

    // Subrutin untuk menghitung indeks prestasi
    public static double hitungIP(char[] Nilai, int[] Sks, int n) {
        int totalSks = 0;
        double totalNilai = 0;

        for (int i = 0; i < n; i++) {
            int angkaNilai = konversiNilai(Nilai[i]);
            totalNilai += angkaNilai * Sks[i];
            totalSks += Sks[i];
        }

        return totalNilai / totalSks;
    }

    // Fungsi bantu untuk mengonversi nilai huruf ke angka
    public static int konversiNilai(char nilai) {
        switch (nilai) {
            case 'A':
                return 4;
            case 'B':
                return 3;
            case 'C':
                return 2;
            case 'D':
                return 1;
            case 'E':
                return 0;
            default:
                return 0;
        }
    }
}
