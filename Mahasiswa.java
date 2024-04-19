import java.util.*;

class Mahasiswa {
    String nim;
    String kelas;
    String nama;
    List<Double> nilai;

    public Mahasiswa(String nim, String kelas, String nama) {
        this.nim = nim;
        this.kelas = kelas;
        this.nama = nama;
        this.nilai = new ArrayList<>();
    }

    public void tambahNilai(double nilai) {
        this.nilai.add(nilai);
    }

    public double hitungRataRataNilai() {
        if (nilai.isEmpty()) {
            return 0;
        }
        double total = 0;
        for (double nilai : this.nilai) {
            total += nilai;
        }
        return total / nilai.size();
    }
}