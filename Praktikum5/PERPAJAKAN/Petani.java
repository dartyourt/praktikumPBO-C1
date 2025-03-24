package Praktikum5.PERPAJAKAN;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Petani extends Manusia implements IPajak{ 
    private String asalKota;
    private static int counterPetani = 0;
    private static final int C = 1; // Digit ke-12 NIM

    public Petani(String nama, LocalDate tanggalMulaiKerja, String alamat, double pendapatan, String nik) {
        super(nama, tanggalMulaiKerja, alamat, pendapatan, nik);
        counterPetani++;
    }

    public String getAsalKota() {
        return asalKota;
    }

    public void setAsalKota(String asalKota) {
        this.asalKota = asalKota;
    }

    @Override
    public int hitungMasaKerja() {
        return (int) ChronoUnit.YEARS.between(this.getTanggalMulaiKerja(), LocalDate.now()) + C;
    }

    @Override
    public double hitungPajak() {
        return 0; // Petani tidak dikenakan pajak
    }

    public static int getCounterPetani() {
        return counterPetani;
    }

    @Override
    public void printInfo() {
        System.out.println("****Petani****");
        super.printInfo();
        System.out.println("Asal Kota : " + getAsalKota());
        System.out.println("Pajak : " + hitungPajak());
    }
}
