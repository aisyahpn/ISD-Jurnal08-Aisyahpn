import java.util.HashMap;
import java.util.Map;

class DatabaseMahasiswa {
    Map<String, Mahasiswa> daftarMahasiswa;

    public DatabaseMahasiswa() {
        daftarMahasiswa = new HashMap<>();
    }

    public void tambahMahasiswa(String nim, String kelas, String nama) {
        if (nim.isEmpty() || kelas.isEmpty() || nama.isEmpty()) {
            System.out.println("Error: NIM, kelas, atau nama tidak boleh kosong.");
            return;
        }
        if (!daftarMahasiswa.containsKey(nim)) {
            Mahasiswa mahasiswa = new Mahasiswa(nim, kelas, nama);
            daftarMahasiswa.put(nim, mahasiswa);
            System.out.println("Mahasiswa dengan NIM " + nim + " berhasil ditambahkan.");
        } else {
            System.out.println("Error: Mahasiswa dengan NIM " + nim + " sudah ada.");
        }
    }

    public void hapusMahasiswa(String nim) {
        if (nim.isEmpty()) {
            System.out.println("Error: NIM tidak boleh kosong.");
            return;
        }
        if (daftarMahasiswa.containsKey(nim)) {
            daftarMahasiswa.remove(nim);
            System.out.println("Mahasiswa dengan NIM " + nim + " berhasil dihapus.");
        } else {
            System.out.println("Error: Mahasiswa dengan NIM " + nim + " tidak ditemukan.");
        }
    }

    public void tambahNilai(String nim, double nilai) {
        if (nim.isEmpty()) {
            System.out.println("Error: NIM tidak boleh kosong.");
            return;
        }
        if (daftarMahasiswa.containsKey(nim)) {
            daftarMahasiswa.get(nim).tambahNilai(nilai);
            System.out.println("Nilai ditambahkan untuk mahasiswa dengan NIM " + nim);
        } else {
            System.out.println("Error: Mahasiswa dengan NIM " + nim + " tidak ditemukan.");
        }
    }

    public void tampilkanSemuaNilaiDanRataRata() {
        if (daftarMahasiswa.isEmpty()) {
            System.out.println("Tidak ada mahasiswa dalam database.");
            return;
        }
        for (Map.Entry<String, Mahasiswa> entry : daftarMahasiswa.entrySet()) {
            Mahasiswa mahasiswa = entry.getValue();
            System.out.println("NIM: " + mahasiswa.nim);
            System.out.println("Nama: " + mahasiswa.nama);
            System.out.println("Kelas: " + mahasiswa.kelas);
            System.out.println("Nilai: " + mahasiswa.nilai);
            System.out.println("Rata-rata Nilai: " + mahasiswa.hitungRataRataNilai());
            System.out.println();
        }
    }
}