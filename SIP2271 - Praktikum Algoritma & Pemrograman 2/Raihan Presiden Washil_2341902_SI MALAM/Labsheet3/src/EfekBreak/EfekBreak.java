package efekbreak;

public class EfekBreak {

    public static void main(String[] args) {
        int bil;
        for (bil = 1; bil <= 10; bil++) {
            if (bil == 5) {
                break;
            }
            System.out.println(bil);
        }
    }
}
