package BilanganTerkecil;

public class BilanganTerkecil {

    public static void main(String[] args) {
        // Tes untuk tipe integer
        int x = 10, y = 12;
        int min = perolehTerkecil(x, y);
        System.out.println("Bilangan terkecil diantara " + x + " dan " + y + " yaitu " + min);

        // Tes untuk tipe double
        double a = 10.2, b = 9.3;
        double terkecil = perolehTerkecil(a, b);
        System.out.println("Bilangan terkecil diantara " + a + " dan " + b + " yaitu " + terkecil);
    }

    // Metode untuk mendapatkan bilangan terkecil di antara dua integer
    public static int perolehTerkecil(int x, int y) {
        if (x < y) {
            return x;
        } else {
            return y;
        }
    }

    // Metode untuk mendapatkan bilangan terkecil di antara dua double
    public static double perolehTerkecil(double x, double y) {
        if (x < y) {
            return x;
        } else {
            return y;
        }
    }
}
