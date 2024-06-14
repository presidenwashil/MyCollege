package Binary;

public class Binary {

    public static void main(String[] args) {
        int[] data = {1, 2, 4, 4, 5, 7, 8, 10, 13, 14, 15};
        int dicari = 8;
        System.out.println("Posisi " + dicari + " dalam array : " + cari(data, data.length, dicari));
    }

    public static int cari(int[] data, int n, int k) {
        int atas, bawah, tengah, posisi;
        boolean ada;
        posisi = -1;
        ada = false;
        bawah = 0;
        atas = n - 1;
        while (atas >= bawah) {
            tengah = (atas + bawah) / 2;
            if (k < data[tengah]) {
                bawah = tengah + 1;
            } else {
                ada = true; //KETEMU
                posisi = tengah;
                bawah = atas + 1;
            }
        }
        if (!ada) {
            posisi = -1;
        }
        return posisi;
    }
}
