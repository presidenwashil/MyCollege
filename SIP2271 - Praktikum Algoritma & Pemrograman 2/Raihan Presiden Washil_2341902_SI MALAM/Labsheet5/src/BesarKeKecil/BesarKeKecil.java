package besarkekecil;

public class BesarKeKecil {

    public static void main(String[] args) {
        String strA = "Saya Programmer Java";
        String strB = "Saya suka Pemrograman";

        System.out.println("strA = " + strA);
        System.out.println("strB = " + strB);

        //  Mengubah nilai String menjadi huruf kecil
        String kecilA = strA.toLowerCase();
        String kecilB = strB.toLowerCase();
        System.out.println("Mengubah nilai String menjadi huruf kecil");
        System.out.println("strA = " + kecilA);
        System.out.println("strB = " + kecilB + "\n");
    }
}
