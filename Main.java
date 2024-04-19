import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DatabaseMahasiswa database = new DatabaseMahasiswa();

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Hapus Mahasiswa");
            System.out.println("3. Tambah Nilai");
            System.out.println("4. Liat Semua Nilai dan Rata-rata");
            System.out.println("5. Keluar");
            System.out.print("pilih: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine();  

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan NIM: ");
                    String nim = scanner.nextLine();
                    System.out.print("Masukkan Kelas: ");
                    String kelas = scanner.nextLine();
                    System.out.print("Masukkan Nama: ");
                    String nama = scanner.nextLine();
                    database.tambahMahasiswa(nim, kelas, nama);
                    break;
                case 2:
                    System.out.print("Masukkan NIM : ");
                    nim = scanner.nextLine();
                    database.hapusMahasiswa(nim);
                    break;
                case 3:
                    System.out.print("Masukkan NIM: ");
                    nim = scanner.nextLine();
                    System.out.print("Masukkan Nilai: ");
                    double nilai = scanner.nextDouble();
                    database.tambahNilai(nim, nilai);
                    break;
                case 4:
                    database.tampilkanSemuaNilaiDanRataRata();
                    break;
                case 5:
                    System.out.println("Keluar");
                    System.exit(0);
                default:
                    System.out.println("pilih yg bener");
            }
        }
    }
}