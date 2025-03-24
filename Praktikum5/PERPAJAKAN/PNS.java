package Praktikum5.PERPAJAKAN;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class PNS extends Manusia implements IPajak {
    private String nip;
    private static int counterPNS = 0;
    private static final int A = 1; // Digit ke-14 NIM

    public PNS(String nama, LocalDate tanggalMulaiKerja, String alamat, double pendapatan, String nik) {
        super(nama, tanggalMulaiKerja, alamat, pendapatan, nik);
        counterPNS++;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    @Override
    public int hitungMasaKerja() {
        return (int) ChronoUnit.YEARS.between(this.getTanggalMulaiKerja(), LocalDate.now()) + A;
    }

    @Override
    public double hitungPajak() {
        return 0.1 * getPendapatan();
    }

    public static int getCounterPNS() {
        return counterPNS;
    }

    @Override
    public void printInfo() {
        System.out.println("****PNS****");
        super.printInfo();
        System.out.println("NIP : " + getNip());
        System.out.println("Pajak : " + hitungPajak());
    }
}
