package TesGanjil;

public class TesGanjil {

    public static void main(String[] args) {
        // Deklarasi variabel
        String info;
        int a = 34, b = 77;

        // Tes bilangan genap
        info = ganjil(a) ? "Ganjil" : "Genap";
        System.out.println("Bilangan " + a + " adalah " + info);

        // Tes bilangan ganjil
        info = ganjil(b) ? "Ganjil" : "Genap";
        System.out.println("Bilangan " + b + " adalah " + info);
    }

    // Metode ganjil(int bil) menguji apakah bilangan bil ganjil atau tidak
    public static boolean ganjil(int bil) {
        return bil % 2 == 1;
    }
}
