
import java.util.Scanner;

public class ExamResult {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input nama dan nim
        System.out.print("Input nama: ");
        String name = input.nextLine();
        System.out.print("Input nim: ");
        String nim = input.nextLine();

        // Input nilai tugas, nilai UTS, dan nilai UAS
        System.out.print("Input nilai Tugas: ");
        double nilaiTugas = input.nextDouble();
        System.out.print("Input nilai Quiz: ");
        double nilaiQuiz = input.nextDouble();
        System.out.print("Input nilai UTS: ");
        double nilaiUts = input.nextDouble();
        System.out.print("Input nilai UAS: ");
        double nilaiUas = input.nextDouble();

        // Hitung nilai akhir
        double nilaiAkhir = 0.15 * nilaiTugas + 0.20 * nilaiQuiz +  0.30 * nilaiUts + 0.35 * nilaiUas;

        // Tentukan keterangan lulus/tidak lulus
        String keterangan = nilaiAkhir >= 70 ? "lulus" : "tidak lulus";

        // Output
        System.out.println("nama : " + name);
        System.out.println("nim: " + nim);
        System.out.println("nilai_akhir: " + nilaiAkhir);
        System.out.println("keterangan: " + keterangan);
    }
}
