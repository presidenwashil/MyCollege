package ubahkarakterdalamstring;

public class UbahKarakterDalamString {

    public static void main(String[] args) {
        //mengubah karakter di dalam string
        //membuat method untuk mengubah karakter
        String test = "abcde";
        String hasil = replace(test, 3, 'x');
        System.out.println(hasil);
    }

    private static String replace(String str, int index, char replace) {
        char[] charx = str.toCharArray();
        charx[index] = replace;
        return String.valueOf(charx);
    }
}
