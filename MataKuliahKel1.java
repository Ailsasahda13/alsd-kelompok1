public class MataKuliahKel1 {
    
    String kodeMK;
    String namaMK;
    int sks;

    MataKuliahKel1(String kodeMataKuliah, String namaMataKuliah, int sksValue) {
        kodeMK = kodeMataKuliah;
        namaMK = namaMataKuliah;
        sks = sksValue;
    }

    void tampilkanMataKuliah() {
        System.out.println("Kode MK : " + kodeMK + " | " + "Nama MK : " + namaMK + " | " + "SKS : " + sks + " ");
    }
}