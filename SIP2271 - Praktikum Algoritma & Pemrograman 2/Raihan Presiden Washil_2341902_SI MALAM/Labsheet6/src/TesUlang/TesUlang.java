package TesUlang;

public class TesUlang {

    public static void main(String[] args) {
        // Menguji metode ulang() dengan beberapa input
        System.out.println(ulang("+", 8));
        System.out.println(ulang("HA", 8));
        System.out.println(ulang("AAMIIN ", 5));
    }

    // Mengulangi string st sebanyak n kali dan mengembalikannya
    public static String ulang(String st, int n) {
        int panjang = st.length();
        if (panjang == 0) {
            return ""; // Mengembalikan string kosong jika panjang string adalah 0
        }
        String strTemp = "";
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < panjang; j++) {
                strTemp += st.charAt(j);
            }
        }
        return strTemp;
    }
}
