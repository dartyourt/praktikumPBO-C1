package AKADEMIK;

import java.util.ArrayList;

public class ProgramStudi {
    private String nama;
    private String kode;
    private ArrayList<MataKuliah> daftarMK;

    public ProgramStudi(String nama, String kode) {
        this.nama = nama;
        this.kode = kode;
        this.daftarMK = new ArrayList<>();
    }

    public void tambahMataKuliah(MataKuliah mk) {
        daftarMK.add(mk);
    }

    public String infoProdi() {
        return "Program Studi: " + nama + " (" + kode + ")";
    }
}