import java.util.Scanner;
public class siakadMahasiswaKel1 {
    static PenilaianKel1[] penilaians;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        siapkanData();

        int pilih;
        do {
            System.out.println("\n=== MENU SISTEM AKADEMIK ===");
            System.out.println("1. Tampilkan Daftar Mahasiswa");
            System.out.println("2. Tampilkan Daftar Mata Kuliah");
            System.out.println("3. Tampilkan Data Penilaian");
            System.out.println("4. Urutkan Mahasiswa Berdasarkan Nilai Akhir");
            System.out.println("5. Cari Mahasiswa Berdasarkan NIM");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilih = sc.nextInt();

            switch (pilih) {
                case 1:
                    tampilkanDaftarMahasiswa();
                    break;
                case 2:
                    tampilkanDaftarMataKuliah();
                    break;
                case 3:
                    tampilkanDataPenilaian();
                    break;
                case 4:
                    urutkanNilaiAkhir();
                    break;
                case 5:
                    System.out.print("Masukkan NIM : ");
                    String nim = sc.next();
                    cariMahasiswa(nim);
                    break;
                case 0:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilih != 0);
    }

    static void siapkanData() {

        MahasiswaKel1 m1 = new MahasiswaKel1("22001", "Ali Rahman", "Informatika");
        MahasiswaKel1 m2 = new MahasiswaKel1("22002", "Budi Santoso", "Informatika");
        MahasiswaKel1 m3 = new MahasiswaKel1("22003", "Citra Dewi", "Sistem Informasi Bisnis");

        MataKuliahKel1 mk1 = new MataKuliahKel1("MK001", "Struktur Data", 3);
        MataKuliahKel1 mk2 = new MataKuliahKel1("MK002", "Basis Data", 3);
        MataKuliahKel1 mk3 = new MataKuliahKel1("MK003", "Desain Web", 3);

        penilaians = new PenilaianKel1[5];
        penilaians[0] = new PenilaianKel1(m1, mk1, 80, 85, 90);
        penilaians[1] = new PenilaianKel1(m1, mk2, 60, 75, 70);
        penilaians[2] = new PenilaianKel1(m2, mk1, 75, 70, 80);
        penilaians[3] = new PenilaianKel1(m3, mk2, 85, 90, 95);
        penilaians[4] = new PenilaianKel1(m3, mk3, 80, 90, 65);
    }

    static void tampilkanDaftarMahasiswa() {
        System.out.println("\nDaftar Mahasiswa:");
        boolean[] sudahTampil = new boolean[penilaians.length];
        for (int i = 0; i < penilaians.length; i++) {
            boolean sudah = false;
            for (int j = 0; j < i; j++) {
                if (penilaians[i].mhs.NIM.equals(penilaians[j].mhs.NIM)) {
                    sudah = true;
                    break;
                }
            }
            if (!sudah) {
                penilaians[i].mhs.tampilkanDataMahasiswa();
            }
        }
    }

    static void tampilkanDaftarMataKuliah() {
        System.out.println("\nDaftar Mata Kuliah:");
        boolean[] sudahTampil = new boolean[penilaians.length];
        for (int i = 0; i < penilaians.length; i++) {
            boolean sudah = false;
            for (int j = 0; j < i; j++) {
                if (penilaians[i].mk.kodeMK.equals(penilaians[j].mk.kodeMK)) {
                    sudah = true;
                    break;
                }
            }
            if (!sudah) {
                penilaians[i].mk.tampilkanMataKuliah();
            }
        }
    }

    static void tampilkanDataPenilaian() {
        System.out.println("\nData Penilaian:");
        System.out.println("NIM Nama MataKuliah Tugas UTS UAS Akhir");
        for (int i = 0; i < penilaians.length; i++) {
            penilaians[i].tampilkanNilai();
        }
    }

    static void urutkanNilaiAkhir() {
        for (int i = 0; i < penilaians.length - 1; i++) {
            for (int j = 0; j < penilaians.length - i - 1; j++) {
                if (penilaians[j].nilaiAkhir() < penilaians[j + 1].nilaiAkhir()) {
                    PenilaianKel1 temp = penilaians[j];
                    penilaians[j] = penilaians[j + 1];
                    penilaians[j + 1] = temp;
                }
            }
        }

        System.out.println("\nData diurutkan berdasarkan nilai akhir:");
        tampilkanDataPenilaian();
    }

    static void cariMahasiswa(String nim) {
        boolean ditemukan = false;
        for (int i = 0; i < penilaians.length; i++) {
            if (penilaians[i].mhs.NIM.equals(nim)) {
                if (!ditemukan) {
                    System.out.println("\nData Mahasiswa ditemukan:");
                    System.out.println("NIM Nama MataKuliah Tugas UTS UAS Akhir");
                    ditemukan = true;
                }
                penilaians[i].tampilkanNilai();
            }
        }

        if (!ditemukan) {
            System.out.println("Mahasiswa dengan NIM " + nim + " tidak ditemukan.");
        }
    }
}
