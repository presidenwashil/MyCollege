package kecilkebesar;

public class KecilKeBesar {

    public static void main(String[] args) {
        String strA = "Saya Programmer Java";
        String strB = "Saya suka Pemrograman";
        System.out.println("strA = " + strA);
        System.out.println("strB = " + strB);

        //Mengubah isi String menjadi huruf besar
        String besarA = strA.toUpperCase();
        String besarB = strB.toUpperCase();
        System.out.println("Mengubah isi String menjadi huruf besar");
        System.out.println("strA = " + besarA);
        System.out.println("strB = " + besarB + "\n");
    }
}
