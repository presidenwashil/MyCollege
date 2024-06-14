package ambilstring;

public class AmbilString {

    public static void main(String[] args) {
        String strA = "Saya Programmer Java";
        String strB = "Saya suka Pemrograman";

        System.out.println("strA = " + strA);
        System.out.println("strB = " + strB);

        //  Mengambil isi sebagian String
        String sub_strA = strA.substring(0, 3);   //substring(index_awal, index_akhir)
        String sub_strB = strB.substring(0, 9);
        System.out.println("Mengambil isi sebagian String");
        System.out.println("strA = " + sub_strA);
        System.out.println("strB = " + sub_strB + "\n");
    }
}
