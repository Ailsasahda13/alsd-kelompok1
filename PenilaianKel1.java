public class PenilaianKel1 {
 
    MahasiswaKel1 mhs;
    MataKuliahKel1 MK;
    double nilaiTugas;
    double nilaiUTS;
    double nilaiUAS;
    double nilaiAkhir;

    PenilaianKel1(MahasiswaKel1 mhs, MataKuliahKel1 MK, double nilTugas, double nilUTS, double nilUAS) {
        MahasiswaKel1 = mhs;
        MataKuliahKel1 = MK;
        nilaiTugas = nilTugas;
        nilaiUTS = nilUTS;
        nilaiUAS = nilaiUAS;
    }

    void hitungNIlaiAkhir() {
        return (nilaiTugas * 0.3) + (nilaiUTS * 0.3) + (nilaiUAS * 0.4);
    }

    void tampilkanData() {
        mhs.tampilkanMahasiswa();
        MK.tampilMataKuliah();
        System.out.println();
    }

    void tampilkanNilai() {
        System.out.println(mhs.NIM + " " + mhs.nama + " " + MK.namaMK + " " + nilaiTugas + " " + nilaiUTS + " " + nilaiUAS + " " + nilaiAkhir());
    }
}