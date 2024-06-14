package membandingkanstring;

public class MembandingkanString {

    public static void main(String[] args) {
        //  Membandingkan 2 buah String dengan return boolean
        String kar1 = "saya";
        String kar2 = "saya";
        String kar3 = "dia";
        System.out.println("kar1 = " + kar1);
        System.out.println("kar2 = " + kar2);
        System.out.println("kar3 = " + kar3);
        System.out.println("Perbandingan kar1 dengan kar2 = " + kar1.contains(kar2));
        System.out.println("Perbandingan kar1 dengan kar3 = " + kar1.contains(kar3) + "\n");
    }
}
