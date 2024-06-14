package Sequential2;

public class Sequential2 {

    public static void main(String[] args) {
        int[] data = {10, 9, 4, 6, 3, 4, 2, 5};
        int dicari = 4;
        int ke;
        ke = 1;
        System.out.println("Posisi " + dicari + " dalam array : " + cari(data, data.length, dicari, ke) + "\n");
        ke = 2;
        System.out.println("Posisi " + dicari + " dalam array : " + cari(data, data.length, dicari, ke) + "\n");
    }

    public static int cari(int[] data, int n, int k, int m) {
        int posisi = 0, i;
        int pencacah = 0;
        boolean ketemu;
        if (n <= 0) {
            posisi = -1;
        } else {
            ketemu = false;
            i = 1;
            while ((i < n - 1) && !ketemu) {
                if (data[i] == k) {
                    pencacah++;
                    System.out.println("pencacah " + pencacah);
                    if (pencacah == m) {
                        posisi = i;
                        ketemu = true;
                    } else {
                        i++;
                    }
                } else {
                    i++;
                }
            }
            if (!ketemu) {
                posisi = -1;
            }
        }
        return posisi;
    }
}
