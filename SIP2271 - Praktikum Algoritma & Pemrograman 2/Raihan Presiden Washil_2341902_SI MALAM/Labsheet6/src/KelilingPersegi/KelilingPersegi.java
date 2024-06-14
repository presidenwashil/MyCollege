package KelilingPersegi;

public class KelilingPersegi {

    public static void main(String[] args) {
        double panjang, lebar, keliling;
        panjang = 20;
        lebar = 10.5;

        // Panggil metode perolehKeliling untuk menghitung keliling
        keliling = perolehKeliling(panjang, lebar);

        // Cetak hasil keliling ke konsol
        System.out.println("Keliling = " + keliling);
    }

    // Metode perolehKeliling menghitung keliling persegi panjang
    public static double perolehKeliling(double panjang, double lebar) {
        double keliling = 2 * (panjang + lebar);
        return keliling;
    }
}
