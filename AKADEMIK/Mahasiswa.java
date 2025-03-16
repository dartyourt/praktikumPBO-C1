package AKADEMIK;

import java.util.ArrayList;

public class Mahasiswa extends Orang {
    private String nim;
    private String prodi;
    private ArrayList<MataKuliah> listMatkul;
    private Dosen dosenWali;
    private Kendaraan kendaraan;
    private final int sksMaksimal = 24;

    public Mahasiswa(String nim, String nama, String alamat, String email, String prodi) {
        super(nama, alamat, email);
        this.nim = nim;
        this.prodi = prodi;
        this.listMatkul = new ArrayList<>();
    }

    public String getNim() {
        return nim;
    }

    public String getProdi() {
        return prodi;
    }

    public void setDosenWali(Dosen dosenWali) {
        this.dosenWali = dosenWali;
    }

    public void setKendaraan(Kendaraan kendaraan) {
        this.kendaraan = kendaraan;
    }

    public void addMatkul(MataKuliah newMatkul) throws Exception {
        if (getJumlahSks() + newMatkul.getSks() > sksMaksimal) {
            throw new Exception("Mahasiswa " + nama + " tidak bisa mengambil " + newMatkul.getNama() + ", melebihi batas SKS!");
        }
        listMatkul.add(newMatkul);
    }

    public int getJumlahSks() {
        int totalSks = 0;
        for (MataKuliah mk : listMatkul) {
            totalSks += mk.getSks();
        }
        return totalSks;
    }

    public void printDetailMhs() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Prodi: " + prodi);
        System.out.println("Dosen Wali: " + (dosenWali != null ? dosenWali.getNama() : "Belum ditentukan"));
        System.out.println("Kendaraan: " + (kendaraan != null ? kendaraan.getJenis() + " " + kendaraan.getNoPlat() : "Tidak memiliki kendaraan"));
        System.out.println("Mata Kuliah yang diambil: ");
        for (MataKuliah mk : listMatkul) {
            System.out.println("- " + mk.getNama() + " (" + mk.getSks() + " SKS)");
        }
        System.out.println("Total SKS: " + getJumlahSks() + "/" + sksMaksimal);
    }
}
