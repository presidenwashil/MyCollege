package TesSisiMiring;

class TesSisiMiring {

    public static void main(String[] args) {
        double x = 4.0, y = 3.0;
        System.out.println("Sisi A: " + x);
        System.out.println("Sisi B: " + y);
        System.out.println("Sisi Miring: " + sisiMiring(x, y));
    }

    // Metode sisiMiring() menghitung panjang sisi miring segitiga siku-siku
    public static double sisiMiring(double a, double b) {
        return Math.sqrt(a * a + b * b);
    }
}
