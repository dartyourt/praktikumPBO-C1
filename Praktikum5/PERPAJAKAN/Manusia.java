package Praktikum5.PERPAJAKAN;

import java.time.LocalDate;

public abstract class Manusia {
    private String nama;
    private String alamat;
    private String nik;
    private LocalDate tanggalMulaiKerja;
    private double pendapatan;
    private static int counterManusia = 0;

    public Manusia(String nama, LocalDate tanggalMulaiKerja, String alamat, double pendapatan, String nik) {
        this.nama = nama;
        this.tanggalMulaiKerja = tanggalMulaiKerja;
        this.alamat = alamat;
        this.pendapatan = pendapatan;
        this.nik = nik;
        counterManusia++;
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getNik() {
        return nik;
    }

    public LocalDate getTanggalMulaiKerja() {
        return tanggalMulaiKerja;
    }

    public double getPendapatan() {
        return pendapatan;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public void setTanggalMulaiKerja(LocalDate tanggalMulaiKerja) {
        this.tanggalMulaiKerja = tanggalMulaiKerja;
    }

    public void setPendapatan(double pendapatan) {
        this.pendapatan = pendapatan;
    }

    public abstract int hitungMasaKerja();
    
    public void printInfo() {
        System.out.println("Nama: " + getNama());
        System.out.println("Alamat: " + getAlamat());
        System.out.println("NIK: " + getNik());
        System.out.println("Tanggal Mulai Kerja: " + getTanggalMulaiKerja());
        System.out.println("Pendapatan: " + getPendapatan());
        System.out.println("Masa Kerja: " + hitungMasaKerja());
    }
    
    public static int getCounterMns() {
        return counterManusia;
    }
}
