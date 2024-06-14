package InsertionSort;

public class InsertionSort {

    public static void main(String[] args) {
        int i;
        int[] data = {25, 57, 48, 37, 12, 92, 80, 33};
        urutkan(data, data.length);
        System.out.println("Hasil pengurutan data : ");
        tampilkanLarik(data, data.length);
    }

    public static void tampilkanLarik(int[] data, int n) {
        for (int i = 0; i < n; i++) {
            System.out.printf("%d ", data[i]);
        }
        System.out.println();
    }

    public static void urutkan(int[] data, int n) {
        int i, k;
        int x;
        boolean ketemu;
        for (k = 1; k < n; k++) {
            x = data[k];
            //SISIPKAN x KEDALAM DATA [0..k-1]
            i = k - 1;
            ketemu = false;
            while ((i >= 0) && (!ketemu)) {
                if (x < data[i]) {
                    data[i + 1] = data[i];
                    i--;
                } else {
                    ketemu = true;
                }
                data[i + 1] = x;
            }
        }
    }
}
