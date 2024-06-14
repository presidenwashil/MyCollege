package TesTukar;

public class TesTukar {

    public static void main(String[] args) {
        double x = 15, y = 20;
        System.out.println("Nilai awal sebelum ditukar:");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println();

        tukar(x, y);
    }

    // Metode tukar() mencoba menukar nilai dua variabel double
    public static void tukar(double x, double y) {
        double z;
        // Penukaran
        z = x;
        x = y;
        y = z;

        // Mencetak nilai setelah penukaran
        System.out.println("Setelah tukar() dipanggil:");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println();
    }
}
