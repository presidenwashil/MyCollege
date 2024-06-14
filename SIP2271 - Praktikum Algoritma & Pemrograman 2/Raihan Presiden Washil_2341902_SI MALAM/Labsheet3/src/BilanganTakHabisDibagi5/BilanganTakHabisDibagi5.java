package BilanganTakHabisDibagi5;

public class BilanganTakHabisDibagi5 {

    public static void main(String[] args) {
        int bil;
        for (bil = 1; bil <= 25; bil += 2) {
            if (bil % 5 != 0) {
                System.out.print(bil + " ");
            }
        }
        System.out.println();
    }
}
