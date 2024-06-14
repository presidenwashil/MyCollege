package Terbesar;

public class Terbesar {

    public static void main(String[] args) {
        int[] data = {4, 2, 5, 3, 8, 9, 2, 9, 5};
        int terbesar;
        terbesar = data[0];
        for (int i = 1; i < 9; i++) {
            if (data[i] > terbesar) {
                terbesar = data[i];
            }
        }
        System.out.print("Terbesar (4,2,5,3,8,9,2,9,5) = " + terbesar);
    }
}
