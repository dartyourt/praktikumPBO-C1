/* 
 * File   : Karyawan.java
 * Deskripsi : program untuk mendefinikan parent class Karyawan 
 * Pembuat : Haidar Ali Laudza /24060123140151
 * Tanggal : 28 Maret 2025
 */

public abstract class Karyawan extends CivitasAkademika{
    private String nip;
    private double masaKerja;
    private static int counterKaryawan = 0;

    public Karyawan(String nama, String email, String nip, double masaKerja) {
        super(nama, email);
        this.nip = nip;
        this.masaKerja = masaKerja;
        counterKaryawan++;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public double getMasaKerja() {
        return masaKerja;
    }

    public void setMasaKerja(double masaKerja) {
        this.masaKerja = masaKerja;
    }

    public static int getCounterKaryawan() {
        return counterKaryawan;
    }

    public abstract double hitungGaji();

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("NIP: " + getNip());
        System.out.println("masa kerja: " + getMasaKerja());
        System.out.println("Gaji: " + hitungGaji());
    }
}