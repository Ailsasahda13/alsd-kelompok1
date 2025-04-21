public class PenilaianKel1 {
    MahasiswaKel1 mhs;
    MataKuliahKel1 mk;
    double tugas;
    double uts;
    double uas;

    PenilaianKel1(MahasiswaKel1 mahasiswa, MataKuliahKel1 matkul, double nilaiTugas, double nilaiUTS, double nilaiUAS) {
        mhs = mahasiswa;
        mk = matkul;
        tugas = nilaiTugas;
        uts = nilaiUTS;
        uas = nilaiUAS;
    }

    double nilaiAkhir() {
        return (tugas * 0.3) + (uts * 0.3) + (uas * 0.4);
    }

    void tampilkanData() {
        mhs.tampilkanDataMahasiswa();
    }

    void tampilkanNilai() {
        System.out.println(mhs.NIM + " | " + mhs.nama + " | " + mk.namaMK + " | " + "Nilai Akhir : " + nilaiAkhir());
    }
}