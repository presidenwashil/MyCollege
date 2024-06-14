package ContohKanan;

public class ContohKanan {

    public static void main(String[] args) {
        // Menguji metode kanan() dengan beberapa input
        System.out.println(kanan("Dewi Sinta", 5));
        System.out.println(kanan("Dewi Sinta", 9));
        System.out.println(kanan("Dewi Sinta", 15));
    }

    // Mengembalikan n karakter terakhir dari string yang diberikan
    public static String kanan(String st, int n) {
        int panjang = st.length();
        if (n > panjang) {
            n = panjang;
        }
        String strTemp = "";
        for (int indeks = panjang - n; indeks < panjang; indeks++) {
            strTemp += st.charAt(indeks);
        }
        return strTemp;
    }
}
