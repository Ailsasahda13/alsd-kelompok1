public class PenilaianKel1 {
    MahasiswaKel1 mahasiswa;
    MataKuliahKel1 mataKuliah;
    double nilaiTugas;
    double nilaiUTS;
    double nilaiUAS;
    double nilaiAkhir;

    public PenilaianKel1(MahasiswaKel1 mahasiswa, MataKuliahKel1 mataKuliah, double tugas, double uts, double uas) {
        this.mahasiswa = mahasiswa;
        this.mataKuliah = mataKuliah;
        this.nilaiTugas = tugas;
        this.nilaiUTS = uts;
        this.nilaiUAS = uas;
        hitungNilaiAkhir();
    }

    public void hitungNilaiAkhir() {
        nilaiAkhir = (0.3 * nilaiTugas) + (0.3 * nilaiUTS) + (0.4 * nilaiUAS);
    }

    public void tampilPenilaian() {
        System.out.printf("%-6s %-15s %-6s %-15s %-10.2f %-10.2f %-10.2f %-10.2f\n",
            mahasiswa.NIM, mahasiswa.nama, 
            mataKuliah.kodeMK, mataKuliah.namaMK, 
            nilaiTugas, nilaiUTS, nilaiUAS, nilaiAkhir);
    }
}
