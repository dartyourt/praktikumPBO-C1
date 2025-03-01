package Praktikum2.Akademik;

public class MMahasiswa {
    public static void main(String[] args) {
        MataKuliah PBO = new MataKuliah("PBO", "Pemrograman Berorientasi Objek", 3);
        MataKuliah MBD = new MataKuliah("MBD", "Manajemen Basis Data", 3);
        Mahasiswa M1 = new Mahasiswa("123", "Budi", "Informatika");
        Dosen D1 = new Dosen("Pak Budi", "123", "Informatika");
        Kendaraan K1 = new Kendaraan("Mobil", "B 1234 ABC");
        M1.addMatkul(PBO);
        M1.addMatkul(MBD);
        M1.setDosenWali(D1);
        M1.setKendaraan(K1);
        M1.printDetailMhs();
        System.out.println("Jumlah SKS: " + M1.getJumlahSks());
        System.out.println("Jumlah Mata Kuliah: " + M1.getJumlahMatkul());
    }
}
