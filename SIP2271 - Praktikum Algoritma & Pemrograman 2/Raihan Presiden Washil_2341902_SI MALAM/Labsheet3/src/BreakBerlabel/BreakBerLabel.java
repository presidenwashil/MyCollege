package BreakBerlabel;

public class BreakBerLabel {

    public static void main(String[] args) {
        int i = 0, j = 0;

        selesai:
        while (i < 3) {
            j = 0;
            while (j < 5) {
                if (j == 3) {
                    break selesai;
                }
                System.out.println("i = " + i + " j = " + j);
                j++;
            }
            i++;
        }
    }
}
