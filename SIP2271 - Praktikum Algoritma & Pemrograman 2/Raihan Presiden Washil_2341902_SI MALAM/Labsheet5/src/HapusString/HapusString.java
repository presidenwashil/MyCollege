package hapusstring;

public class HapusString {

    public static void main(String[] args) {

        String data = "STMIK Widya Cipta Dharma";

        data = data.replaceAll("[a,i,u,e,o]", "");
        System.out.println(data);
    }
}
