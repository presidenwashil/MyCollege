package Larik;

public class Larik {

    public static void main(String[] args) {
        // Inisialisasi array dengan beberapa elemen tipe double
        double data[] = {578, 67.8, 2.3, 24, 123.5};

        // Mendapatkan jumlah elemen dalam array
        int jumlah = data.length;

        // Menghitung elemen terkecil dalam array
        double min = elemenTerkecil(data, jumlah);

        // Mencetak elemen terkecil ke konsol
        System.out.println("Elemen terkecil = " + min);
    }

    // Metode untuk mendapatkan elemen terkecil dalam array double
    public static double elemenTerkecil(double[] x, int jum) {
        // Inisialisasi variabel min dengan nilai elemen pertama array
        double min = x[0];

        // Iterasi melalui array untuk mencari elemen terkecil
        for (int i = 1; i < jum; i++) {
            if (x[i] < min) {
                min = x[i];
            }
        }

        // Mengembalikan elemen terkecil yang ditemukan
        return min;
    }
}
