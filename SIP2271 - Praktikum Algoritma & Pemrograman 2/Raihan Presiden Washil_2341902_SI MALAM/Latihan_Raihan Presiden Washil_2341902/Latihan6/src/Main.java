
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EmployeeCRUD employeeCRUD = new EmployeeCRUD();

        while (true) {
            // Tampilkan menu
            System.out.println("\n===== Menu CRUD Karyawan =====");
            System.out.println("1. Tambahkan karyawan");
            System.out.println("2. Lihat semua karyawan");
            System.out.println("3. Ubah data karyawan");
            System.out.println("4. Hapus karyawan");
            System.out.println("5. Keluar");
            System.out.println("=============================");
            System.out.print("Masukkan pilihan Anda (1-5): ");

            int pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    // Tambahkan karyawan
                    System.out.println("\n--- Tambahkan Karyawan ---");
                    System.out.print("Masukkan ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // Konsumsi newline

                    System.out.print("Masukkan nama: ");
                    String name = scanner.nextLine();

                    System.out.print("Masukkan usia: ");
                    int age = scanner.nextInt();

                    Employee employee = new Employee(id, name, age);
                    employeeCRUD.addEmployee(employee);
                    System.out.println("Karyawan berhasil ditambahkan!");
                    break;

                case 2:
                    // Lihat semua karyawan
                    System.out.println("\n--- Daftar Semua Karyawan ---");
                    List<Employee> employees = employeeCRUD.getAllEmployees();
                    if (employees.isEmpty()) {
                        System.out.println("Belum ada data karyawan.");
                    } else {
                        System.out.println("ID\tNama\t\tUsia");
                        System.out.println("----------------------------");
                        for (Employee emp : employees) {
                            System.out.printf("%d\t%-10s\t%d\n", emp.getId(), emp.getName(), emp.getAge());
                        }
                    }
                    break;

                case 3:
                    // Ubah data karyawan
                    System.out.println("\n--- Ubah Data Karyawan ---");
                    System.out.print("Masukkan ID karyawan yang ingin diubah: ");
                    int updateId = scanner.nextInt();
                    scanner.nextLine(); // Konsumsi newline

                    System.out.print("Masukkan nama baru: ");
                    String newName = scanner.nextLine();

                    System.out.print("Masukkan usia baru: ");
                    int newAge = scanner.nextInt();

                    employeeCRUD.updateEmployee(updateId, newName, newAge);
                    System.out.println("Data karyawan berhasil diubah!");
                    break;

                case 4:
                    // Hapus karyawan
                    System.out.println("\n--- Hapus Karyawan ---");
                    System.out.print("Masukkan ID karyawan yang ingin dihapus: ");
                    int deleteId = scanner.nextInt();

                    employeeCRUD.deleteEmployee(deleteId);
                    System.out.println("Karyawan berhasil dihapus!");
                    break;

                case 5:
                    // Keluar
                    System.out.println("Keluar dari program.");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Pilihan tidak valid, silakan coba lagi.");
                    break;
            }
        }
    }
}
