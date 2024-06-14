package SelectionSort;

public class SelectionSort {

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
        int posMin, posAwal, j, tmp;
        for (posAwal = 0; posAwal < n - 1; posAwal++) {
            posMin = posAwal;
            for (j = posAwal + 1; j < n; j++) {
                if (data[posMin] > data[j]) {
                    posMin = j;
                }
            }
            //TUKARKAN
            tmp = data[posAwal];
            data[posAwal] = data[posMin];
            data[posMin] = tmp;
            System.out.printf("Hasil posAwal %d : ", posAwal);
            tampilkanLarik(data, n);
        }
    }
}
