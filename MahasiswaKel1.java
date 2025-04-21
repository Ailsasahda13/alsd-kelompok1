public class MahasiswaKel1 {

    String NIM;
    String nama;
    String programStudi;

    MahasiswaKel1(String nim, String name, String prodi) {
        NIM = nim;
        nama = name;
        programStudi = prodi;
    }

    void tampilkanMahasiswa() {
        System.out.println(NIM + " " + nama + " ");
    }
}