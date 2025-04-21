public class MahasiswaKel1 {
    String NIM;
    String nama;
    String prodi;

    MahasiswaKel1(String nimMhs, String namaMhs, String prodiMhs) {
        NIM = nimMhs;
        nama = namaMhs;
        prodi = prodiMhs;
    }

    void tampilkanDataMahasiswa() {
        System.out.println("NIM: " + NIM + " | Nama: " + nama + " | Prodi: " + prodi);
    }
}