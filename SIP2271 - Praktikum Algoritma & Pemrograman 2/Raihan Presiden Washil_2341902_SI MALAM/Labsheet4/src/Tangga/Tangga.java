package tangga;

public class Tangga {

    public static void main(String[] args) {
        /*Mengalokasikan array dimensi 2
          yang mengandung 4 baris */
        int[][] sel = new int[4][];

        /*Mengalokasikan kolom untuk
        masing-masing baris */
        int i, j;
        for (i = 0; i < sel.length; i++) {
            sel[i] = new int[i + 1];
        }

        //Mengisi masing-masing elemen
        for (i = 0; i < sel.length; i++) {
            for (j = 0; j < sel[i].length; j++) {
                sel[i][j] = i + j;
            }
        }

        //Menampilkan isi semua elemen array
        for (i = 0; i < sel.length; i++) {
            for (j = 0; j < sel[i].length; j++) {
                System.out.print(sel[i][j] + " ");
            }

            System.out.println(""); //pindah baris
        }
    }
}
