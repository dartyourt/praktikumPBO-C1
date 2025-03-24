package Praktikum5.PERPAJAKAN;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Pengusaha extends Manusia implements IPajak{
    private String npwp;
    private static int counterPengusaha = 0;
    private static final int B = 5; // Digit ke-13 dari NIM Anda

    public Pengusaha(String nama, LocalDate tanggalMulaiKerja, String alamat, double pendapatan, String nik) {
        super(nama, tanggalMulaiKerja, alamat, pendapatan, nik);
        counterPengusaha++;
    }

    public String getNpwp() {
        return npwp;
    }

    public void setNpwp(String npwp) {
        this.npwp = npwp;
    }

    @Override
    public int hitungMasaKerja() {
        return (int) ChronoUnit.YEARS.between(this.getTanggalMulaiKerja(), LocalDate.now()) + B;
    }

    @Override
    public double hitungPajak() {
        return 0.15 * getPendapatan();
    }

    public static int getCounterPengusaha() {
        return counterPengusaha;
    }

    @Override
    public void printInfo() {
        System.out.println("****Pengusaha****");
        super.printInfo();
        System.out.println("NPWP : " + getNpwp());
        System.out.println("Pajak : " + hitungPajak());
    }
}
