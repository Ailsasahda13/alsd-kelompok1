public class MataKuliahKel1 {
    
    String kodeMK;
    String namaMK;
    int sks;

    MataKuliahKel1(String kodeMataKuliah, String namaMataKuliah, int sks) {
        kodeMK = kodeMataKuliah;
        namaMK = namaMataKuliah;
        sks = sks;
    }

    void tampilMataKuliah() {
        System.out.println(kodeMK + " ");
    }
}
