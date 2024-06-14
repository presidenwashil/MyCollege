package FormatString;

public class FormatString {

    public static void main(String[] args) {
        int nilai = 80;
        double nilaiPhi = 3.14;

        String ket = "phi";
        System.out.println(String.format("|%s|%f|Nilai: %d|", ket, nilaiPhi, nilai));
        System.out.println(String.format("|%10s | %6.2f | Nilai : %4d |", ket, nilaiPhi, nilai));
        System.out.println(String.format("|%-10s | %6.3f | Nilai : %8d |", ket, nilaiPhi, nilai));
    }
}
