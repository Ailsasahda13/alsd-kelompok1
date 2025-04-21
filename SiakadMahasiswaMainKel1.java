public class SiakadMahasiswaMainKel1 {
    public static void main(String[] args) {
        MahasiswaKel1 m1 = new MahasiswaKel1("22001", "Ali Rahman", "Informatika");
        MahasiswaKel1 m2 = new MahasiswaKel1("22002", "Budi Santoso", "Informatika");
        MahasiswaKel1 m3 = new MahasiswaKel1("22003", "Citra Dewi", "Informatika");

        MataKuliahKel1 mk1 = new MataKuliahKel1("MK001", "Struktur Data", 3);
        MataKuliahKel1 mk2 = new MataKuliahKel1("MK002", "Basis Data", 3);
        MataKuliahKel1 mk3 = new MataKuliahKel1("MK003", "Desain Web", 2);

        System.out.println("=== Daftar MahasiswaKel1 ===");
        m1.tampilMahasiswaKel1();
        m2.tampilMahasiswaKel1();
        m3.tampilMahasiswaKel1();

        System.out.println("\n=== Daftar Mata Kuliah ===");
        mk1.tampilMataKuliahKel1();
        mk2.tampilMataKuliahKel1();
        mk3.tampilMataKuliahKel1();

        System.out.println("\n=== Data PenilaianKel1 ===");
        System.out.printf("%-6s %-15s %-6s %-15s %-10s %-10s %-10s %-10s\n", 
            "NIM", "Nama", "Kode", "Mata Kuliah", "Tugas", "UTS", "UAS", "Akhir");

        PenilaianKel1 p1 = new PenilaianKel1(m1, mk1, 80, 85, 90);
        PenilaianKel1 p2 = new PenilaianKel1(m1, mk2, 60, 75, 70);
        PenilaianKel1 p3 = new PenilaianKel1(m2, mk1, 75, 70, 80);
        PenilaianKel1 p4 = new PenilaianKel1(m3, mk2, 85, 90, 95);
        PenilaianKel1 p5 = new PenilaianKel1(m3, mk3, 80, 90, 65);

        p1.tampilPenilaian();
        p2.tampilPenilaian();
        p3.tampilPenilaian();
        p4.tampilPenilaian();
        p5.tampilPenilaian();
    }
}