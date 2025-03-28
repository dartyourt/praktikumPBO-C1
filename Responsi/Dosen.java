/* 
 * File   : Dosen.java
 * Deskripsi : program untuk mendefinikan parent class Dosen 
 * Pembuat : Haidar Ali Laudza /24060123140151
 * Tanggal : 28 Maret 2025
 */

public class Dosen extends Karyawan {
    private Fakultas fakultas;
    private static int counterDosen = 0;

    public Dosen(String nama, String email, String nip, double masaKerja, Fakultas fakultas) {
        super(nama, email, nip, masaKerja);
        this.fakultas = fakultas;
        counterDosen++;
    }

    public Fakultas getFakultas() {
        return fakultas;
    }

    public void setFakultas(Fakultas fakultas) {
        this.fakultas = fakultas;
    }

    public static int getCounterDosen() {
        return counterDosen;
    }
    @Override
    public double hitungGaji() {
        return getFakultas().getGajiPokok() + (getMasaKerja() + 0.01 * getFakultas().getGajiPokok());
    }

    @Override
    public void printInfo() {
        System.out.println("\n--- Informasi Dosen " + (getCounterDosen()) + " ---");
        super.printInfo();
        System.out.println("Fakultas: " + getFakultas().getNama());
        System.out.println("Jumlah Dosen: " + getCounterDosen());
    }

}