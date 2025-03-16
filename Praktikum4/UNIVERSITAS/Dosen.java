package Praktikum4.UNIVERSITAS;

import java.time.LocalDate;

public class Dosen extends Pegawai {
    protected String fakultas;

    public String getFakultas() {
        return fakultas;
    }

    public void setFakultas(String fakultas) {
        this.fakultas = fakultas;
    }

    public Dosen(String nip, String nama, LocalDate tanggalLahir, LocalDate tmt, double gajiPokok, String jabatan, String fakultas) {
        super(nip, nama, tanggalLahir, tmt, gajiPokok, jabatan);
        this.fakultas = fakultas;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Fakultas : " + getFakultas());
    }
}
